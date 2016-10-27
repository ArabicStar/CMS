package arabicStar.blServiceImpl.manageBLServiceImpl;

import arabicStar.blService.manageBLService.ManageLogicService;
import arabicStar.vo.HotelVO;
import arabicStar.vo.MarketVO;
import arabicStar.vo.MemberVO;
import arabicStar.vo.UserVO;

public class ManageLogicServiceImpl_Stub implements ManageLogicService {

	@Override
	public boolean addMember(MemberVO member) {
		// TODO Auto-generated method stub
		System.out.println("增加用户");
		return true;
	}

	@Override
	public boolean findMember(int memberID) {
		// TODO Auto-generated method stub
		System.out.println("找到用户");
		return true;
	}

	@Override
	public boolean updateMmeber(int memberID, MemberVO member) {
		// TODO Auto-generated method stub
		System.out.println("更新用户");
		return true;
	}

	@Override
	public boolean addHotel(HotelVO hotel) {
		// TODO Auto-generated method stub
		System.out.println("增加酒店");
		return true;
	}

	@Override
	public boolean findHotel(int hotelID) {
		// TODO Auto-generated method stub
		System.out.println("找到酒店");
		return true;
	}

	@Override
	public boolean deleteHotel(int hotelID) {
		// TODO Auto-generated method stub
		System.out.println("删除酒店");
		return true;
	}

	@Override
	public boolean updateHotel(int hotelID, HotelVO hotel) {
		// TODO Auto-generated method stub
		System.out.println("更新酒店");
		return true;
	}

	@Override
	public boolean addMarket(UserVO market) {
		// TODO Auto-generated method stub
		System.out.println("增加营销人员");
		return true;
	}

	@Override
	public boolean findMarket(int marketID) {
		// TODO Auto-generated method stub
		System.out.println("找到营销人员");
		return true;
	}

	@Override
	public boolean updateMarket(int marketID, UserVO market) {
		// TODO Auto-generated method stub
		System.out.println("更新营销人员信息");
		return true;
	}

}
