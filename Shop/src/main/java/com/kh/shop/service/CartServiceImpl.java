package com.kh.shop.service;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.shop.vo.CartVO;
import com.kh.shop.vo.CartViewVO;

@Service("cartService")
public class CartServiceImpl implements CartService{
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public void insertCart(CartVO cartVO) {
		sqlSession.insert("cartMapper.insertCart", cartVO);
	}

	@Override
	public List<CartViewVO> selectCartList(String memId) {
		return sqlSession.selectList("cartMapper.selectCartList", memId);
	}

	@Override
	public void deleteCart(CartVO cartVO) {
		sqlSession.delete("cartMapper.deleteCart", cartVO);
	}

	@Override
	public void updateItemCnt(CartVO cartVO) {
		sqlSession.update("cartMapper.updateItemCnt", cartVO);
	}

	@Override
	public void deleteCarts(CartVO cartVO) {
		sqlSession.delete("cartMapper.deleteCarts", cartVO);
	}

}
















