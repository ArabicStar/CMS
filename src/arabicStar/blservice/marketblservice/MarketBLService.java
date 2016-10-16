package arabicStar.blservice.marketblservice;

import arabicStar.bl.marketbl.MarketBL;
import arabicStar.util.market.Market;
import arabicStar.vo.ResultMessage;

public class MarketBLService implements MarketBL{

	/**
	 * 根据传入的market信息，更新数据库中的网站营销信息
	 * @return 返回操作结果提示
	 * @return 修改的提示信息
	 * TODO:返回值类型为ResultMessage
	 */
	@Override
	public ResultMessage updateInfo(Market market) {
		// TODO Auto-generated method stub
		System.out.println("信息更新成功！");
		return null;
	}

}
