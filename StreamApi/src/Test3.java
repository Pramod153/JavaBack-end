package com.streamAPI;
// sum array values 
import java.util.ArrayList;
import java.util.List;

public class Test3 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		List<Integer> list = new ArrayList<>();
		for(int ele:arr) {
			list.add(ele);
		}
		Integer result = list.stream().reduce(0,(sum,a)->sum+a);
		System.out.print(result);
	}

}
