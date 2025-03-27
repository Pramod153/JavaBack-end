package com.streamAPI;

import java.util.ArrayList;
import java.util.List;

//avg of all numbers.Input: int [] arr= {1,2,3,4,5,6,7};
public class Test4 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7};
		List<Integer> list = new ArrayList<>();
		for(int ele:arr) {
			list.add(ele);
		}
		double asDouble =list.stream()
							.mapToInt(x->x)
							.average()
							.getAsDouble();
		
		System.out.println(asDouble);
	}

}
