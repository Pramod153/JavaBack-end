package com.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

// average of even number 
public class Test5 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8};
		List<Integer> list = new ArrayList<>();
		for(int ele:arr) {
			list.add(ele);
		}
		double asDouble =list.stream()
		.filter(x->x%2==0)
		.mapToInt(x->x*x)
		.average()
		.getAsDouble();
		System.out.println(asDouble);

	}

}
