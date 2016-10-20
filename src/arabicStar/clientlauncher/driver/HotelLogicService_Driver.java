package arabicStar.clientlauncher.driver;

import arabicStar.blService.hotelBLService.HotelLogicService;
import arabicStar.vo.CommentVO;
import arabicStar.vo.HotelVO;
import arabicStar.vo.RoomVO;

public class HotelLogicService_Driver {
	public void driver(HotelLogicService controller) {
		RoomVO room = new RoomVO("七星假日酒店",300,"家庭房",1);
		RoomVO rooms[] = new RoomVO[]{room};
		controller.checkIn(room);

		controller.checkOut(room);
		
		CommentVO comment = new CommentVO("2016-10-01","小明","早上公鸡叫的太早了","七星假日酒店");
		controller.comment(comment);
		
		HotelVO hotel = new HotelVO("七星假日酒店",3,"888888","开发区","周围有广袤的田野",3,rooms);
		
		HotelVO hotel2 = new HotelVO("七星假日酒店",3,"888888","新街口","周围有广袤的田野",3,rooms);
		controller.add(hotel);
		controller.updateInfo(hotel2);

	}
}
