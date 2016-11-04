package arabicStar.dataService.marketDataService;

import arabicStar.po.CreditChangePO;

public interface MarketDataService {
	public CreditChangePO updateCredit(String id, int change);
}
