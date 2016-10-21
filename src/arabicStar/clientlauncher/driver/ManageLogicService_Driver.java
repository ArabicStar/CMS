package arabicStar.clientlauncher.driver;


import arabicStar.blService.manageBLService.ManageLogicService;
import arabicStar.vo.HotelVO;
import arabicStar.vo.MemberVO;
import arabicStar.vo.User;
import arabicStar.vo.UserVO;


public class ManageLogicService_Driver {

	public void driver(ManageLogicService controller) {

		MemberVO user0 = new MemberVO();
		UserVO user1 = new UserVO(User.WEBMARKET, "张三");
		HotelVO hotel = new HotelVO("七天假日酒店",4,"888888","开发区","有停车房",4.3,null);

		
		controller.addHotel(hotel);
		controller.addMarket(user1);
		controller.addMember(user0);	
		controller.updateHotel(1, hotel);
		
		
		
	}
}
