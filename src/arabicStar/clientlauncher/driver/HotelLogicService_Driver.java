package arabicStar.clientlauncher.driver;

import arabicStar.blService.hotelBLService.HotelLogicService;
import arabicStar.vo.CommentVO;
import arabicStar.vo.HotelVO;
import arabicStar.vo.RoomVO;

public class HotelLogicService_Driver {
	public void driver(HotelLogicService controller) {
		RoomVO room = new RoomVO("七天假日酒店",300,"家庭房",1);
		RoomVO rooms[] = new RoomVO[]{room};
		controller.checkIn(room);

		controller.checkOut(room);
		
		CommentVO comment = new CommentVO("2016-10-01","小明","早上公鸡叫的太早了","七天假日酒店");
		controller.comment(comment);
		
		HotelVO hotel = new HotelVO("七天假日酒店",3,"888888","开发区","周围有广袤的田野",3,rooms);
		
		controller.updateInfo(hotel);

	}
}
