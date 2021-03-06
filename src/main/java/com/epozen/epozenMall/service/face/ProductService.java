package com.epozen.epozenMall.service.face;

import java.util.List;
import java.util.Map;

import com.epozen.epozenMall.util.Paging;
import com.epozen.epozenMall.vo.ShopProductVO;

public interface ProductService {

	/**
	 * 상품 전체 리스트 조회
	 * 
	 * @param Paging  현재 페이지 정보
	 * @return Priduct List
	 */
	List<ShopProductVO> selectAllPro(Paging paging);

	Paging getCurPage(Map<String, Object> map);

}
