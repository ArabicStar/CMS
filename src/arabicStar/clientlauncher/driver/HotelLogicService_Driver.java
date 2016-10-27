package arabicStar.clientlauncher.driver;

import arabicStar.blService.hotelBLService.HotelLogicService;
import arabicStar.vo.CommentVO;
import arabicStar.vo.HotelVO;
import arabicStar.vo.MemberVO;
import arabicStar.vo.RoomVO;

public class HotelLogicService_Driver {
	public void driver(HotelLogicService controller) {

		RoomVO room = new RoomVO("七天假日酒店",300,"家庭房",1);
		CommentVO comment = new CommentVO("2016-10-01","小明","早上公鸡叫的太早了","七天假日酒店");
		HotelVO hotel = new HotelVO("七天假日酒店",4,"888888","开发区","有停车房",4.3,null);

		controller.checkIn(room);
		controller.checkOut(room);
		controller.comment(comment);
		controller.updateInfo(hotel);
		controller.search("开发区");
		
	}


}
