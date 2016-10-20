package arabicStar.dataservice.orderDataServiceImpl;

import java.util.Date;

import arabicStar.blService.hotelBLService.HotelLogicService;
import arabicStar.blService.promotionBLService.PromotionLogicService;
import arabicStar.data.orderDataService.OrderDataService;
import arabicStar.po.OrderPO;

<<<<<<< HEAD
/**
 * 这是Order数据的实现
 * 
 * @author WaterWan
 *
 */
public class OrderDataServiceImpl_Stub implements OrderDataService {
	private HotelLogicService hotelBL;
	private PromotionLogicService promotionBL;

	public OrderDataServiceImpl_Stub(HotelLogicService hotelBL, PromotionLogicService promotionBL) {
		this.hotelBL = hotelBL;
		this.promotionBL = promotionBL;
	}

=======
public class OrderDataServiceImpl_Stub implements OrderDataService{
>>>>>>> origin/CMS
	@Override
	public OrderPO getInfo() {
		// TODO Auto-generated method stub
		System.out.println("Get INFO");
		return new OrderPO();
	}

	@Override
	public Date getTime() {
		// TODO Auto-generated method stub
		System.out.println("Get TIME");
		return new Date();
	}

	@Override
	public String getRoom() {
		// TODO Auto-generated method stub
		System.out.println("Get ROOM");
		return new String("Room");
	}

	@Override
	public String getAppeal() {
		// TODO Auto-generated method stub
		System.out.println("Get APPEAL");
		return new String("Appeal");
	}

	@Override
	public boolean insert(OrderPO po) {
		// TODO Auto-generated method stub
		System.out.println("INSERT ORDER");
		return false;
	}
	
	@Override
	public OrderPO find(int id) {
		// TODO Auto-generated method stub
		System.out.println("FIND PO");
		return null;
	}

	@Override
	public boolean delete(OrderPO po) {
		// TODO Auto-generated method stub
		System.out.println("DELETE PO");
		return false;
	}

	@Override
	public boolean update(OrderPO po) {
		// TODO Auto-generated method stub
		System.out.println("UPDATE PO");
		return false;
	}

	@Override
	public boolean setTime(Date date) {
		// TODO Auto-generated method stub
		System.out.println("SET TIME");
		return false;
	}
}
