package com.streamAPI;
// to find odd numbers square  value for each
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class PipelineOfStreamAPI {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		Stream<Integer> stream= list.stream();
		stream.filter(x->x%2==1)
		.map(x->x*x)
		.forEach(x->System.out.print(x+" "));

	}

}
