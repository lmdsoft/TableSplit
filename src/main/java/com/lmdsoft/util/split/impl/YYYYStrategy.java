package com.lmdsoft.util.split.impl;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import com.lmdsoft.util.split.Strategy;

/**
 * @Author: lmdsoft
 * @Date: 2019/6/4 18:03
 * @Version V1.0
 * @Description: 按年分表策略
 **/

public class YYYYStrategy implements Strategy {

	@Override
	public String convert(Map<String, Object> params) {
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY");
		StringBuilder sb=new StringBuilder(params.get(Strategy.TABLE_NAME).toString());
		sb.append("_");
		sb.append(sdf.format(new Date()));
		return sb.toString();
	}
	
}