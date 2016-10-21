package arabicStar.blService.manageBLService;

import arabicStar.vo.HotelVO;
import arabicStar.vo.MarketVO;
import arabicStar.vo.MemberVO;

public interface ManageLogicService {

	public boolean addMember(MemberVO member);
	
	public boolean findMember(int memberID);
	
	public boolean updateMmeber(int memberID,MemberVO member);
	
	public boolean addHotel(HotelVO hotel);
	
	public boolean findHotel(int hotelID);
	
	public boolean deleteHotel(int hotelID);
	
	public boolean updateHotel(int hotelID,HotelVO hotel);
	
	public boolean addMarket(MarketVO market);
	
	public boolean findMarket(int marketID);
	
	public boolean updateMarket(int marketID,MarketVO market);
}
