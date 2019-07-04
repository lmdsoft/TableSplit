package com.lmdsoft.util.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: lmdsoft
 * @Date: 2019/6/4 18:07
 * @Version V1.0
 * @Description: 自定义分表注解
 **/

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.TYPE, ElementType.METHOD })
public @interface TableSplit {
	//是否分表
	 public boolean split() default true;
	 
	 public String value() default "";

	 public String field() default "";
	 
	 //获取分表策略
	 public String strategy();
	 
}
