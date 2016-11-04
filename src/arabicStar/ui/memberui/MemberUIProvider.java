package arabicStar.ui.memberui;

import arabicStar.blService.memberBLService.MemberLogicService;
import arabicStar.uiBase.ContentAccessor;
import arabicStar.uiBase.ContentProvider;
import javafx.scene.Node;

public class MemberUIProvider extends ContentProvider {
	private MemberLogicService memberBL;

	public MemberUIProvider(MemberLogicService memberBL) {
		this.memberBL = memberBL;
	}

	@Override
	public ContentAccessor getAccessor() {
		// TODO 自动生成的方法存根
		return null;
	}

}
