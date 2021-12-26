package com.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ArrayRemoveDuplicatesAndSort {

	public static void main(String[] args) {
		int arr[]=new int[] {5,1,2,6,4,4,5};


		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		map.forEach((K, V) -> System.out.print(K ));
		//System.out.println(map.keySet());
		 
	}

}
