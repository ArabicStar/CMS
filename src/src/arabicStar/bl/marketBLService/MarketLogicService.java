package arabicStar.bl.marketBLService;

import arabicStar.util.market.Market;
import arabicStar.vo.ResultMessage;

/**
 * market的逻辑接口
 * @author ParanoiaSun
 *
 */
public interface MarketLogicService {

	/**
	 * 传入修改后的网站营销人员信息进行信息更新
	 * @param market 修改后的market对象
	 * @return 修改的提示信息
	 * TODO:返回值类型为ResultMessage
	 */
	public ResultMessage updateInfo(Market market);

}
