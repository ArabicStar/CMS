package arabicStar.clientlauncher.driver;

import arabicStar.blService.promotionBLService.PromotionLogicService;
import arabicStar.vo.HotelVO;
import arabicStar.vo.OrderVO;
import arabicStar.vo.RoomVO;

public class PromotionLogicService_Driver {
	
	public void driver(PromotionLogicService controller){
		
		HotelVO hotel = new HotelVO("七天假日酒店",4,"888888","开发区","有停车房",4.3,null);
		RoomVO room = new RoomVO("七天假日酒店",300,"家庭房",1);
		
		OrderVO order = new OrderVO(hotel,room);
		
		controller.apply(order);
		
	}

}
