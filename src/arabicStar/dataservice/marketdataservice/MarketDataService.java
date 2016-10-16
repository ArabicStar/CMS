package arabicStar.dataservice.marketdataservice;

import arabicStar.vo.MarketInfo;
import arabicStar.data.marketdata.MarketData;

public class MarketDataService implements MarketData{

	/**
	 * 更新网站营销信息
	 * @return 所需要的网站营销信息
	 */
	@Override
	public MarketInfo getInfo() {
		// TODO Auto-generated method stub
		System.out.println("成功获取信息！");
		return null;
	}

}
