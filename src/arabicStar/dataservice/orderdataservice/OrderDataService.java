package arabicStar.dataservice.orderdataservice;

import java.util.Date;

import arabicStar.data.orderdata.IOrderData;
import arabicStar.util.order.Order;
/**
 * 这是Order数据的实现
 * @author WaterWan
 *
 */
public class OrderDataService implements IOrderData {

	@Override
	public Order getInfo() {
		// TODO Auto-generated method stub
		System.out.println("Get INFO");
		return null;
	}

	@Override
	public Date getTime() {
		// TODO Auto-generated method stub
		System.out.println("Get TIME");
		return null;
	}

	@Override
	public String getRoom() {
		// TODO Auto-generated method stub
		System.out.println("Get ROOM");
		return null;
	}

	@Override
	public String getAppeal() {
		// TODO Auto-generated method stub
		System.out.println("Get APPEAL");
		return null;
	}

}
