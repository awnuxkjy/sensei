package com.sensei.indexing.hadoop.demo;

import org.json.JSONException;
import org.json.JSONObject;
import org.apache.hadoop.io.Text;

import com.sensei.indexing.hadoop.map.MapInputConverter;

public class CarMapInputConverter implements MapInputConverter {

	@Override
	public JSONObject getJsonInput(Object key, Object value) throws JSONException {
		String line = ((Text) value).toString();
		return new JSONObject(line);
	}

}