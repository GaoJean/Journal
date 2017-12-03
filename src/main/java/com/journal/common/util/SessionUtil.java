package com.journal.common.util;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class SessionUtil {

	/**
     * SESSION工具包：工具包BEAN_ID
     * 
     * @return String BEAN_ID
     */
	public static final String UTIL_ID = "cn.gaojean.journal.web.util.SessionUtil";
	
	/**
     * SESSION工具包：批量获取SESSION参数
     * 
     * @param List<String> 属性名称列表
     * @return Map<String, Object> 包含多个属性键值对<属性名称,属性值>
     */
	public static Map<String, Object> getSessionAttributes(List<String> sessionAttributeNames){
		Map<String, Object> sessionAttributes = new HashMap<String, Object>();
		
		Iterator<String> names = sessionAttributeNames.iterator();
		while (names.hasNext()) {
			String name = (String) names.next();
			sessionAttributes.put(name, getCurrentSession().getAttribute(name));
		}
		
		return sessionAttributes;
	}

	/**
     * SESSION工具包：单一获取SESSION参数
     * 
     * @param String 属性名称
     * @return Map<String, Object> 包含单一属性键值对<属性名称,属性值>
     */
	public static Object getSessionAttribute(String name){
		return getCurrentSession().getAttribute(name);
	}
	
	public static <T> void setSessionAttribute(String name, T value){
		getCurrentSession().setAttribute(name, value);
	}
	
	public static HttpSession getCurrentSession(){
		return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest().getSession();
	}
}
