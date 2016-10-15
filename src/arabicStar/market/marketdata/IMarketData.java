package arabicStar.market.marketdata;

import arabicStar.market.Market;

public interface IMarketData {

	/**
	 * 获取market的信息
	 * @return market的信息
	 * TODO:返回值类型为InfoVO
	 */
	public Market getInfo();
}
