package arabicStar.blService.orderBLService;

import arabicStar.util.order.Order;
import arabicStar.vo.OrderVO;
import arabicStar.vo.ResultMessage;
/**
 * 这是Order逻辑的接口
 * @author WaterWan
 *
 */
public interface OrderLogicService {

	public Order born(OrderVO orderInfo);

	public ResultMessage die(Order order);

	public ResultMessage cure(Order order);

	public ResultMessage ill(Order order);

	public ResultMessage ripe(Order order);

	public ResultMessage cancel(Order order);
	
}
