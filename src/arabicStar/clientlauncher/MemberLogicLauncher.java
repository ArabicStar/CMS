package arabicStar.clientlauncher;

import arabicStar.bl.memberBLService.MemberLogicService;
import arabicStar.blservice.memberBLServiceImpl.MemberLogicServiceImpl_Stub;

public class MemberLogicLauncher {
	public MemberLogicService launch() {
		return new MemberLogicServiceImpl_Stub();
	}
}
