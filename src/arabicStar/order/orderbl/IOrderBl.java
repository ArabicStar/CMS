package arabicStar.order.orderbl;

import arabicStar.order.Order;
/**
 * 这是Order逻辑的接口
 * @author WaterWan
 *
 */
public interface IOrderBl {
	/**
	 * 根据传入的值，生成一个新订单
	 * @return 返回新订单
	 * TODO: 未传递VO
	 */
	public Order born();
	/**
	 * 撤销传入的订单
	 * @param order 需要撤销的订单
	 * @return 订单撤销的提示信息
	 * TODO:应返回的类型为ResultMessage
	 */
	public void die(Order order);
	/**
	 * 延迟入住传入的订单
	 * @param order 需要延迟的订单
	 * @return 订单延迟的提示信息
	 */
	public void cure(Order order);
	/**
	 * 使订单变为异常
	 * @param order 需要变为异常的订单
	 * @return 使订单异常的提示信息
	 * TODO:应返回的类型为ResultMessage
	 */
	public void ill(Order order);
	/**
	 * 执行订单
	 * @param order 需要执行的订单
	 * @return 订单执行的提示信息
	 * TODO:应返回的类型为ResultMessage
	 */
	public void ripe(Order order);
	/**
	 * 申诉撤销订单
	 * @param order 需要申诉的订单
	 * @return 订单申诉的提示信息
	 * TODO:应返回的类型为ResultMessage
	 */
	public void cancel(Order order);
	
}
