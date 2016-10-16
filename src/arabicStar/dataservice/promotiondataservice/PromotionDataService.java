package arabicStar.dataservice.promotiondataservice;

import arabicStar.data.promotiondata.PromotionData;
import arabicStar.po.PromotionPO;
import arabicStar.util.promotion.Promotion;

/**
 * 这是Promotion的数据接口方法实现
 * @author Vivian
 *
 */
public class PromotionDataService implements PromotionData {

	/**
	 * 获取促销策略信息
	 * @return 返回促销策略名称与介绍
	 */
	@Override
	public Promotion getDiscription() {
		// TODO Auto-generated method stub
		System.out.println("获取描述成功");
		return null;
	}

	public void insert(PromotionPO po){
		System.out.println("Insert Succeed!");
	}

	public void delete(PromotionPO po){
		System.out.println("Delete Succeed!");
	}

	public void update(PromotionPO po){
		System.out.println("Update Succeed!");
	}

	public PromotionPO find(int id){
		System.out.println("Find Succeed!");
		PromotionPO po = new PromotionPO(null,null);
		return po;
	}
}
