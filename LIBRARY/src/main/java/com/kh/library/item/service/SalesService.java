package com.kh.library.item.service;

import java.util.List;

import com.kh.library.item.vo.OrderSheetVO;

public interface SalesService {

	//주문내역조회
	List<OrderSheetVO> selectOrderAll();
	
	//주문상품 건별 상태변경
	void updateItemState(OrderSheetVO orderSheetVO);
	
	//주문상품 선택상품 상태변경
	void updateItemsStates(OrderSheetVO orderSheetVO);
}
