package cn.itcast.springboot.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.itcast.springboot.domain.Notice;
import cn.itcast.springboot.mapper.NoticeMapper;
import cn.itcast.springboot.service.NoticeService;

@Service
@Transactional
public class NoticeServiceImpl implements NoticeService {

	//注入NoticeMapper
	@Autowired
	private NoticeMapper noticeMapper;
	
	@Override
	public List<Notice> findAll() {
		
		return noticeMapper.findAll();
	}

	@Override
	public Map<String, Object> findByPage(Integer page, Integer rows) {
		
		//创建集合封装响应数据
		Map<String,Object> data = new HashMap<>();
		
		/**
		 * 统计查询
		 */
		long count = noticeMapper.count();
		data.put("total", count);
		
		/**
		 * 分页查询
		 */
		List<Notice> notice = noticeMapper.findByPage((page - 1) * rows, rows);
		data.put("rows", notice);
		return data;
	}

}
