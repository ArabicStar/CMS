package arabicStar.data.marketdata;

import arabicStar.util.market.Market;

public interface MarketData {

	/**
	 * 获取market的信息
	 * @return market的信息
	 * TODO:返回值类型为InfoVO
	 */
	public Market getInfo();
}
