package com.collection.map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Map<String,Integer> map = new HashMap<>();
//		Map<String,Integer> map = new LinkedHashMap<>();// give o/p as insertion order
		Map<String,Integer> map = new TreeMap<>(); // do not take key value as null.
		//add
		map.put("Amit",23);
		map.put("Yogesh",27);
		map.put("Vivek",31);
		map.put("Varun",21);
		map.put("John",22);
		map.put("Amit",32); // always update new value:
		
		// in hashmap we give null value
//		map.put(null, 30);
		map.put("SUresh",null);
		
		System.out.println(map);
		
		// access value
//		System.out.println(map.get(null));
		System.out.println(map.get("psa"));
		
		// Map entry
		
		for(Map.Entry<String,Integer> set:map.entrySet()){
			System.out.println(set.getKey());
			System.out.println(set.getValue());
		}
		
		// containsKey
		System.out.println(map.containsKey("psa"));
		
		System.out.println(map.remove("Amit"));
		System.out.println(map);
	}

}
