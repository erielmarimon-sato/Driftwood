package com.sgs.vision.storage.model;

import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

public class AttributesJSONHelper {
    

	/**
	 * 
	 * @param m - converting map to JSON string
	 * @return String - return JSON
	 */
    public static String toString(Map<String, String> m) {
        if (m.isEmpty()) {
            return "";
        }
    	ObjectMapper mapper = new ObjectMapper();
    	String json = "";
    	try {
			json = mapper.writeValueAsString(m);
			json = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(m);
		} catch (Exception e) {
			
		}
    	
        return json;
    }

    /**
     * 
     * @param string - convert string to map	
     * @return - map 
     */
    public static Map<String, String> toMap(String s) {

        Map<String, String> m = new HashMap<String, String>();
        if (s.isEmpty()) {
          return m;
        }
        ObjectMapper mapper = new ObjectMapper();
        try {
			m = mapper.readValue(s, new TypeReference<Map<String, String>>(){});
		} catch (Exception e) {
	
		}
        return m;
    }
}
