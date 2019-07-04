package com.lmdsoft.util;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;


/**
 * @Author: lmdsoft
 * @Date: 2019/6/4 14:03
 * @Version V1.0
 * @Description: ContextHelper
 **/

@Component
public class ContextHelper implements ApplicationContextAware {
	private static ApplicationContext context;

	@Override
	public void setApplicationContext(ApplicationContext context)
			throws BeansException {
		ContextHelper.context = context;
	}

	public static ApplicationContext getApplicationContext() {
		return ContextHelper.context;
	}

	public static <T> T getBean(Class<T> clazz) {
		return context.getBean(clazz);
	}

	public static Object getBean(String name) {
		return context.getBean(name);
	}

	public static <T> T getBean(String name, Class<T> clazz) {
		return context.getBean(name, clazz);
	}
}
