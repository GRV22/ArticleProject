package com.argnv.article.utils;

import org.json.JSONObject;

public class JSONConverter {

	public static String getSuccessJSONObjectFromModel(Object o) {
		JSONObject obj = new JSONObject();
		obj.put("status", "success");
		obj.put("data", new JSONObject(o));
		return obj.toString();
	}
	
	public static String getFailJSONObjectWithReason(String reason) {
		JSONObject obj = new JSONObject();
		obj.put("status", "fail");
		obj.put("reason", reason);
		return obj.toString();
	}
}
