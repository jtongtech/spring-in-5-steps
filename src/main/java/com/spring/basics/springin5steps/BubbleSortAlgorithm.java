package com.spring.basics.springin5steps;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
//@Primary
@Qualifier("bubble")
public class BubbleSortAlgorithm implements SortAlgorithm {
	@Override
	public int[] sort(int[] numbers) {
//		Logic for Bubble Sort
		return numbers;
	}

}
