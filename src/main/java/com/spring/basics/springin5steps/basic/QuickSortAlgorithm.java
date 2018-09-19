package com.spring.basics.springin5steps.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm {
	@Override
	public int[] sort(int[] numbers) {
//		Logic for Quick Sort
		return numbers;
	}

}
