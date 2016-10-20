package arabicStar.data.marketDataService;

import arabicStar.util.market.Market;

public interface MarketDataService {

	/**
	 * 获取market的信息
	 * @return market的信息
	 * TODO:返回值类型为InfoVO
	 */
	public Market getInfo();
}
