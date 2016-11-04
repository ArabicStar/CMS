package arabicStar.memberLogic;

import java.util.Random;

import arabicStar.memberDataService.MemberDataService;
import arabicStar.po.MemberPO;
import arabicStar.po.MemberPOBuilder;
import arabicStar.util.info.member.MemberInfo;
import arabicStar.vo.MemberVO;
import arabicStar.vo.MemberVOBuilder;

public class AccoutManager {
	private static final int BOUND = 10000000;
	private static final String ID_PATTERN = "%08d";

	private Random idRandom;

	private String loginedID;
	private MemberVO loginedMember;
	private boolean isLogined;

	private MemberDataService data;

	AccoutManager(MemberDataService data) {
		idRandom = new Random(System.currentTimeMillis());
		this.data = data;

		loginedID = "";
		loginedMember = null;
		isLogined = false;
	}

	/**
	 * register a new member<br>
	 * 
	 * @param info
	 *            member info input by user retrieved from UI layer
	 * @return new member's info
	 */
	MemberInfo register(MemberVOBuilder info, String passwordHash) {
		String id = generateNewID();

		MemberInfo vo = info.setId(id).getMemberVO();
		MemberPO po = new MemberPOBuilder(vo).setPasswordHash(passwordHash).getMemberPO();
		if (data.insertMember(po))
			return vo;

		return MemberVOBuilder.getInvalidInfo();
	}

	/**
	 * login an account<br>
	 * 
	 * @param id
	 *            member id
	 * @param passwordHash
	 *            password hash
	 * @return Null if account not exist<br>
	 *         Invalid MemberVO if password wrong<br>
	 *         MemberVO logined if success<br>
	 */
	MemberInfo login(String id, String passwordHash) {
		MemberPO member = findAccount(id);
		if (member == null)
			return null;

		if (!isPasswordCorrect(passwordHash, member))
			return MemberVOBuilder.getInvalidInfo();

		loginedID = member.getID();
		loginedMember = new MemberVOBuilder(member).getMemberVO();
		isLogined = false;

		return new MemberVOBuilder(member).getMemberVO();
	}

	/**
	 * logout current logined account
	 * 
	 * @return false if no account logined currently<br>
	 *         true if success<br>
	 */
	boolean logout() {
		if (!isLogined)
			return false;

		loginedID = "";
		loginedMember = null;
		isLogined = false;
		return true;
	}

	String getLoginedID() {
		return loginedID;
	}

	MemberVO getLoginedMember() {
		return new MemberVOBuilder(loginedMember).getMemberVO();
	}

	boolean isLogined() {
		return isLogined;
	}

	/* get a new id */
	private String generateNewID() {
		String id = toIDString(idRandom.nextInt(BOUND));
		while (accountExists(id))
			id = toIDString(idRandom.nextInt(BOUND));

		return id;
	}

	/* check if a accout exists */
	boolean accountExists(String id) {
		return null == data.findMember(id);
	}

	MemberPO findAccount(String id) {
		return data.findMember(id);
	}

	/* convert a int to id */
	private static final String toIDString(int i) {
		if (i >= BOUND)
			return "";
		return String.format(ID_PATTERN, i);
	}

	private boolean isPasswordCorrect(String passwordHash, MemberPO po) {
		return passwordHash.equals(po.getPasswordHash());
	}
}
