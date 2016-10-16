package arabicStar.vo;

import arabicStar.util.order.Order;

/**
 * 结果信息类，用来传递对订单操作的结果信息
 * @author WaterWan
 * TODO：还没有添加属性
 */
public class ResultMessage {
	
	public ResultMessage(){
		System.out.println("未定义");
	}
	public ResultMessage(Order order) {
		if(order.isUnexecuted()) {
			System.out.println("未执行状态");
		} else if(order.isExecuted()) {
			System.out.println("已执行状态");
		} else if(order.isRepealed()) {
			System.out.println("撤销状态");
		} else if(order.isAbnormal()) {
			System.out.println("异常状态");
		}
	}
}
