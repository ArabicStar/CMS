package arabicStar.po;

import arabicStar.util.hotel.Hotel;
import arabicStar.util.member.Member;

public class ManagePO {
	private MemberPO memberPO;
	private Member member;
	private HotelPO hotelPO;
	private Hotel hotel;
	public MemberPO getMemberPO() {
		return memberPO;
	}
	public void setMemberPO(MemberPO memberPO) {
		this.memberPO = memberPO;
	}
	public Member getMember() {
		return member;
	}
	public void setMember(Member member) {
		this.member = member;
	}
	public HotelPO getHotelPO() {
		return hotelPO;
	}
	public void setHotelPO(HotelPO hotelPO) {
		this.hotelPO = hotelPO;
	}
	public Hotel getHotel() {
		return hotel;
	}
	public void setHotel(Hotel hotel) {
		this.hotel = hotel;
	}
	
}
