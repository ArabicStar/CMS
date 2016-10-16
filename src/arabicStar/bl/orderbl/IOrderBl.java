package arabicStar.bl.orderbl;

import arabicStar.util.order.Order;
import arabicStar.vo.OrderInfo;
import arabicStar.vo.ResultMessage;
/**
 * 这是Order逻辑的接口
 * @author WaterWan
 *
 */
public interface IOrderBl {

	public Order born(OrderInfo orderInfo);

	public ResultMessage die(Order order);

	public ResultMessage cure(Order order);

	public ResultMessage ill(Order order);

	public ResultMessage ripe(Order order);

	public ResultMessage cancel(Order order);
	
}
