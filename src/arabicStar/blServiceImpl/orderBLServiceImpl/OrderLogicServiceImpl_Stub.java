package arabicStar.blServiceImpl.orderBLServiceImpl;

import arabicStar.blService.orderBLService.OrderLogicService;
import arabicStar.util.order.Order;
import arabicStar.vo.OrderVO;
import arabicStar.vo.ResultMessage;
/**
 * 这是Order逻辑的实现
 * @author WaterWan
 *
 */
public class OrderLogicServiceImpl_Stub implements OrderLogicService {
	Order order;
	/**
	 * 根据传入的值，生成一个新订单
	 * @param 传入的订单信息
	 * @return 返回新订单
	 */
	@Override
	public Order born(OrderVO orderInfo) {
		// TODO Auto-generated method stub
		System.out.println("成功生成该订单");
		return new Order(orderInfo);
	}

	/**
	 * 撤销传入的订单
	 * @param order 需要撤销的订单
	 * @return 订单撤销的提示信息
	 */
	@Override
	public ResultMessage die(Order order) {
		// TODO Auto-generated method stub
		if(!order.isRepealed()) {
			System.out.println("该订单已被撤销");
		}
		return new ResultMessage(order);
	}

	/**
	 * 延迟入住传入的订单
	 * @param order 需要延迟的订单
	 * @return 订单延迟的提示信息
	 */
	@Override
	public ResultMessage cure(Order order) {
		// TODO Auto-generated method stub
		if(order.isAbnormal()) {
			System.out.println("用户延迟入住成功");
		}
		return new ResultMessage(order);
	}

	/**
	 * 使订单变为异常
	 * @param order 需要变为异常的订单
	 * @return 使订单异常的提示信息
	 */
	@Override
	public ResultMessage ill(Order order) {
		// TODO Auto-generated method stub
		if(!order.isAbnormal()) {
			System.out.println("该订单变为异常");
		}
		return new ResultMessage(order);
	}

	/**
	 * 执行订单
	 * @param order 需要执行的订单
	 * @return 订单执行的提示信息
	 */
	@Override
	public ResultMessage ripe(Order order) {
		// TODO Auto-generated method stub
		if (order.isUnexecuted()) {
			System.out.println("该订单已被执行");
		}
		return new ResultMessage(order);
	}

	/**
	 * 申诉撤销订单
	 * @param order 需要申诉的订单
	 * @return 订单申诉的提示信息
	 */
	@Override
	public ResultMessage cancel(Order order) {
		// TODO Auto-generated method stub
		if(order.isAbnormal()) {
			System.out.println("已经发起对订单的申诉");
		}
		return new ResultMessage(order);
	}
	


}
