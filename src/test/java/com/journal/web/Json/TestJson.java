package com.journal.web.Json;

import java.util.HashMap;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;


public class TestJson {
	
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<String, Object>();
		map.put("orderSource", "01");
		map.put("orderNo", "");
		map.put("saleNumber", "");
		map.put("orderStatus", "");
		String mesg = JSONObject.toJSONString(map);
		System.out.println(mesg);
	}
}
