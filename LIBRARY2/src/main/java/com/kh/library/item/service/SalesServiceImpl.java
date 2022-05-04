package com.kh.library.item.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.library.item.vo.OrderSheetVO;

@Service("salesService")
public class SalesServiceImpl implements SalesService {

	@Autowired
	private SqlSessionTemplate sqlSession;

	@Override
	public List<OrderSheetVO> selectOrderAll() {
		return sqlSession.selectList("cartMapper.selectOrderAll");
	}

	@Override
	public void updateItemState(OrderSheetVO orderSheetVO) {
		sqlSession.update("cartMapper.updateItemState", orderSheetVO);
	}

	@Override
	public void updateItemsStates(OrderSheetVO orderSheetVO) {
		sqlSession.update("cartMapper.updateItemsStates", orderSheetVO);
	}

	@Override
	public void deleteOrders(OrderSheetVO orderSheetVO) {
		sqlSession.delete("cartMapper.deleteOrders", orderSheetVO);
	}

	@Override
	public List<OrderSheetVO> searchKindState(OrderSheetVO orderSheetVO) {
		return sqlSession.selectList("cartMapper.searchKindState", orderSheetVO);
	}
}
