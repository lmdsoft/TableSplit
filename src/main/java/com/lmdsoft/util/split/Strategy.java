package com.lmdsoft.util.split;

import java.util.Map;


/**
 * @Author: lmdsoft
 * @Date: 2019/6/4 19:03
 * @Version V1.0
 * @Description: 定义策略接口
 **/

public interface Strategy {

	public static final String TABLE_NAME="table_name";
	public static final String SPLIT_FIELD="split_field";
	public static final String EXECUTE_PARAM_DECLARE="execute_param_declare";
	public static final String EXECUTE_PARAM_VALUES="execute_param_values";
	/**
	 * 传入一个需要分表的表名，返回一个处理后的表名 
	 * Strategy必须包含一个无参构造器
	 * @param params
	 * @return
	 */
	public String convert(Map<String, Object> params) throws Exception;
}
