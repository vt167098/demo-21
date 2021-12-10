package com.vt.demo21.controller;

import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ejlchina.searcher.BeanSearcher;
import com.ejlchina.searcher.util.MapUtils;
import com.vt.demo21.model.CntModel;
import com.vt.demo21.model.Join01Model;

@RestController
@RequestMapping("/api/demo21")
public class IndexController {

	@Autowired
	private BeanSearcher beanSearcher;

	@GetMapping("/query")
	@CrossOrigin("*")
	@ResponseBody
	public List<CntModel> get01(HttpServletRequest request){
		
		return beanSearcher.searchList(CntModel.class, MapUtils.flat(request.getParameterMap()));
	}
	
	@GetMapping("/query2")
	@CrossOrigin("*")
	@ResponseBody
	public Join01Model get02(HttpServletRequest request){
		
		Map<String, Object> params = MapUtils.flat(request.getParameterMap());
		params.put("tablec", ":cntm521");

		return beanSearcher.searchFirst(Join01Model.class, params);
	}
	
	@GetMapping("/query3")
	@CrossOrigin("*")
	@ResponseBody
	public Number get03(HttpServletRequest request){
		
		return beanSearcher.searchCount(CntModel.class, MapUtils.flat(request.getParameterMap()));
	}

	@GetMapping("/query4")
	@CrossOrigin("*")
	@ResponseBody
	public List<CntModel> get04(HttpServletRequest request){
		
		return beanSearcher.searchAll(CntModel.class, MapUtils.flat(request.getParameterMap()));
	}
}
