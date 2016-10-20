package arabicStar.blServiceImpl.marketBLServiceImpl;

import arabicStar.blService.hotelBLService.HotelLogicService;
import arabicStar.blService.marketBLService.MarketLogicService;
import arabicStar.blService.memberBLService.MemberLogicService;
import arabicStar.util.market.Market;
import arabicStar.vo.ResultMessage;

public class MarketLogicServiceImpl_Stub implements MarketLogicService {
	private MemberLogicService memberBL;
	private HotelLogicService hotelBL;

	public MarketLogicServiceImpl_Stub(MemberLogicService memberBL, HotelLogicService hotelBL) {
		this.memberBL = memberBL;
		this.hotelBL = hotelBL;
	}

	/**
	 * 根据传入的market信息，更新数据库中的网站营销信息
	 * 
	 * @return 返回操作结果提示
	 * @return 修改的提示信息 TODO:返回值类型为ResultMessage
	 */
	@Override
	public ResultMessage updateInfo(Market market) {
		// TODO Auto-generated method stub
		System.out.println("信息更新成功！");
		return null;
	}

}
