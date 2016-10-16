package arabicStar.data.marketdata;

import arabicStar.vo.MarketVO;

public interface MarketData {

	/**
	 * 获取market的信息
	 * @return market的信息
	 * TODO:返回值类型为MarketInfo
	 */
	public MarketVO getInfo();
}
