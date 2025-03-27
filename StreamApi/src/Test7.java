package com.streamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//print all duplicates from given array
public class Test7 {

	public static void main(String[] args) {
		int[] arr = {2,1,1,2,3,4,4,5,3};
		List<Integer> list = new ArrayList<>();
		for(int ele:arr) {
			list.add(ele);
		}
		List<Integer> collect = list.stream()
//				.filter(x->Collections.frequency(list, x)>1)
				.filter(x->Collections.frequency(list, x)==1)
				.distinct()
				.collect(Collectors.toList());
		System.out.println(collect);
	}

}
