package arabicStar.ui.marketui;

import arabicStar.blService.marketBLService.MarketLogicService;
import arabicStar.uiBase.ContentAccessor;
import arabicStar.uiBase.ContentProvider;
import javafx.scene.Node;

public class MarketUIProvider extends ContentProvider {
	private MarketLogicService marketBL;

	public MarketUIProvider(MarketLogicService marketBL) {
		this.marketBL = marketBL;
	}

	@Override
	protected ContentAccessor getAccessor() {
		// TODO 自动生成的方法存根
		return null;
	}



}
