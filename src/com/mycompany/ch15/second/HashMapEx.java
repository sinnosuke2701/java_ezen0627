package com.mycompany.ch15.second;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String,Integer> map = new HashMap<String,Integer>();
		
		map.put("신짱구", 5);
		map.put("신짱아", 0);
		map.put("신형만", 34);
		map.put("봉미선", 29);
		
		map.forEach((key , value)->{
			System.out.println(key + ":" + value);
		});
		
		System.out.println("---------------------");
		
		for(String strkey : map.keySet()) {
			Integer strValue = map.get(strkey);
			System.out.println(strkey + ":" + strValue);
		}
		
		
	}

}
