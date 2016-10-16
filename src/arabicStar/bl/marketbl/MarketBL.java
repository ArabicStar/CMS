package arabicStar.bl.marketbl;

import arabicStar.util.market.Market;

/**
 * market的逻辑接口
 * @author ParanoiaSun
 *
 */
public interface MarketBL {

	/**
	 * 传入修改后的网站营销人员信息进行信息更新
	 * @param market 修改后的market对象
	 * @return 修改的提示信息
	 * TODO:返回值类型为ResultMessage
	 */
	public void updateInfo(Market market);

}