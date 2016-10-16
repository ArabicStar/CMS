package arabicStar.dataservice.orderdataservice;

import java.util.Date;

import arabicStar.data.orderdata.OrderData;
import arabicStar.util.order.Order;
/**
 * 这是Order数据的实现
 * @author WaterWan
 *
 */
public class OrderDataService implements OrderData {

	@Override
	public Order getInfo() {
		// TODO Auto-generated method stub
		System.out.println("Get INFO");
		return new Order();
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
