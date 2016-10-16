package arabicStar.order.orderblservice;

import arabicStar.order.Order;
import arabicStar.order.orderbl.IOrderBl;
import arabicStar.vo.OrderInfo;
/**
 * 这是Order逻辑的实现
 * @author WaterWan
 *
 */
public class OrderBlService implements IOrderBl {

	@Override
	public Order born(OrderInfo orderInfo) {
		// TODO Auto-generated method stub
		System.out.println("成功生成该订单");
		return null;
	}

	@Override
	public void die(Order order) {
		// TODO Auto-generated method stub
		System.out.println("该订单已被撤销");
	}

	@Override
	public void cure(Order order) {
		// TODO Auto-generated method stub
		System.out.println("用户延迟入住成功");
	}

	@Override
	public void ill(Order order) {
		// TODO Auto-generated method stub
		System.out.println("该订单变为异常");
	}

	@Override
	public void ripe(Order order) {
		// TODO Auto-generated method stub
		System.out.println("该订单已被执行");
	}

	@Override
	public void cancel(Order order) {
		// TODO Auto-generated method stub
		System.out.println("已经发起对订单的申诉");
	}

}
