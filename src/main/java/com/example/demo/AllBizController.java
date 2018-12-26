package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@RestController
@RequestMapping("/biz")
public class AllBizController {
	
	@Autowired
	private AllBizDao bizDao;
	
	@RequestMapping(value="/getAll" ,method=RequestMethod.GET)
	public PageInfo<AllBiz> getAll() {
		PageHelper.startPage(1, 10);
		PageInfo<AllBiz> info = new PageInfo<>(bizDao.getAll());
		return info;
	}
}
