package com.logical.practices.examples.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.logical.practices.framework.ILogicalExample;

@Component
public class ContinuousSubArray implements ILogicalExample{
	@Override
	public void run(Object o) {
		
		@SuppressWarnings("unchecked")
		Map<Object, Object> data = (Map<Object, Object>) o;
		int[] arr = (int[]) data.get("inputArray");
		int total = (int) data.get("total");
		List<int[]> continuousArrayList = findContinuousArray(arr, total);
		for(int[] arrData: continuousArrayList) {
			for(int i=0; i<arrData.length; i++) {
				System.out.print(arrData[i] + " ");
			}
			System.out.println();
		}
	}
	
	public List<int[]> findContinuousArray(int[] arr, int total){
		
		List<int[]> continuousArraysList = new ArrayList<int[]>();
		
		for(int i=0; i<(arr.length-2); i++) {
			if(arr[i] < total) {
				int idx = 0;
				int j = i, sum = 0;
				int[] subArray = new int[3];
				while(idx < subArray.length) {
					sum = sum + arr[j];
					if(sum >= total && idx != subArray.length-1) {
						break;
					}
					subArray[idx] = arr[j];
					j++;
					idx++;
				}
				if(sum == total) {
					continuousArraysList.add(subArray);
				}
			}
		}
		return continuousArraysList;
	}
}
