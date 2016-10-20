package arabicStar.clientcontroller;

import arabicStar.bl.memberBLService.MemberLogicService;

public class ClientLogicController {
	private MemberLogicService memberLogicService;

	public ClientLogicController() {
	}

	public void init() {

	}

	public void setMemberLogicController(MemberLogicService membersLogicService) {
		if (this.memberLogicService == null)
			this.memberLogicService = membersLogicService;
	}
}
