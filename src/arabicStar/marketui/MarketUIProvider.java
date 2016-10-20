package arabicStar.marketui;

import arabicStar.blService.marketBLService.MarketLogicService;
import arabicStar.uibase.ContentProvider;
import javafx.event.Event;
import javafx.scene.Scene;

public class MarketUIProvider implements ContentProvider {
	private MarketLogicService marketBL;

	public MarketUIProvider(MarketLogicService marketBL) {
		this.marketBL = marketBL;
	}

	@Override
	public boolean ready(Event e) {
		// TODO 自动生成的方法存根
		return false;
	}

	@Override
	public Scene prepareContent() {
		// TODO 自动生成的方法存根
		return null;
	}

}
