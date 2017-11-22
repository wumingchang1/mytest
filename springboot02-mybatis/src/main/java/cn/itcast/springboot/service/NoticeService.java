package cn.itcast.springboot.service;

import java.util.List;
import java.util.Map;

import cn.itcast.springboot.domain.Notice;

public interface NoticeService {
	
	/**
	 * 统计所有
	 * @return
	 */
	List<Notice> findAll();
	
	/**
	 * 分页查询所有
	 */
	Map<String,Object> findByPage(Integer page,Integer rows); 
}
