package com.calmlee.ex.lesson02.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.calmlee.ex.lesson02.dao.UsedGoodsDAO;
import com.calmlee.ex.lesson02.model.UsedGoods;

@Service // 비즈니스 로직이 담기는 스프링빈으로 등록
public class UsedGoodsBO {
	
	@Autowired
	private UsedGoodsDAO usedGoodsDAO; // 의존성 주입
	
	public List<UsedGoods> getUsedGoodsList(){
		return usedGoodsDAO.selectUsedGoodsList();
	}

}
