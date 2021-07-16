package com.calmlee.ex.lesson02;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.calmlee.ex.lesson02.bo.UsedGoodsBO;
import com.calmlee.ex.lesson02.model.UsedGoods;

@RestController
public class Lesson02Ex01RestController {

		@Autowired
		private UsedGoodsBO usedGoodsBO;
	
		@RequestMapping("/lesson02/ex01")
		public List<UsedGoods> ex01(){
			List<UsedGoods> usedGoodsList = usedGoodsBO.getUsedGoodsList();
			return usedGoodsList;
		}
}
