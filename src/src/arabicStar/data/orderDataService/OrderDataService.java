package arabicStar.data.orderDataService;

import java.util.Date;

import arabicStar.po.OrderPO;
/**
 * 这是Order数据的接口
 * @author WaterWan
 *
 */
public interface OrderDataService {
	/**
	 * 获取订单信息
	 * @return 所需要的订单
	 */
	public OrderPO getInfo();
	/**
	 * 获取订房的时间
	 * @return 订房时间
	 * TODO：此处的返回值类型可能需要修改，需要我们自己实现一个时间的类
	 */
	public Date getTime();
	/**
	 * 获取房间信息
	 * @return 所需要的房间信息
	 * TODO：对于返回值可能需要商量一下
	 */
	public String getRoom();
	/**
	 * 获取申诉信息
	 * @return 申诉的信息
	 */
	public String getAppeal();
}
