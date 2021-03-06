package com.journal.common.util;

import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;


/**
 * 读取properties配置文件
 * @author 
 * @see 可以追加多个properties文件
 */
public class PropertiesUtil {

	// appserver.properties
	private Resource appserver;
	// business.properties
	private Resource business;

	private Properties properties;

	public void setAppserver(Resource appserver) {
		this.appserver = appserver;
	}

	public void setBusiness(Resource business) {
		this.business = business;
	}

	public void init() {
		synchronized (this) {
			properties = new Properties();
			InputStreamReader readerVars;
			try {
				readerVars  = new InputStreamReader(appserver.getInputStream(), "UTF-8");
				properties.load(readerVars);
				readerVars = new InputStreamReader(business.getInputStream(), "UTF-8");
				properties.load(readerVars);
				System.out.println(properties.toString());
			} catch (IOException e) {
				e.printStackTrace();
				throw new RuntimeException(e.getMessage());
			}
		}
	}

	public String getProperties(String key) {
		return (String) this.properties.getProperty(key);
	}

}