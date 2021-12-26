package com.example;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayReturnSign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int A[]= {1,3,-9};
		
		System.out.println(solution(A));

	}
	
	public static int solution(int[] A) {
		List<Integer> list = Arrays.stream(A).boxed().collect(Collectors.toList());
		
		if(list.contains(0))
			return 0;
		Integer reduce = list.stream().reduce(1,(a,b)->a*b);
		if(reduce <0){
			return -1;
		}
		return 1;
	
	
	}

}
