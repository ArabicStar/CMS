package arabicStar.dataservice.orderDataServiceImpl;

import java.util.Date;

import arabicStar.data.orderDataService.OrderDataService;
import arabicStar.po.OrderPO;

/**
 * 这是Order数据的实现
 * 
 * @author WaterWan
 *
 */
public class OrderDataServiceImpl_Stub implements OrderDataService {

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

}
