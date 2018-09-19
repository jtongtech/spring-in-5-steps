package com.spring.basics.springin5steps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.spring.basics.springin5steps.basic.BinarySearchImpl;

@SpringBootApplication
public class SpringIn5StepsBasicApplication {

//	What are the beans?
//	What are the dependencies for the beans?
//	Where to search for beans? = No Need

	public static void main(String[] args) {
//		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
//		each new instance of an object is a bean ie new QuickSortAlgorithm() is a bean
//		int result = binarySearch.binarySearch(new int[] { 12, 4, 6 }, 3);
//		com.spring.basics.springin5steps.BubbleSortAlgorithm@52e922
//		com.spring.basics.springin5steps.QuickSortAlgorithm@52e922
//		System.out.println(result);
//		Appliction Context maintains all the beans
		ApplicationContext applicationContext = SpringApplication.run(SpringIn5StepsBasicApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		BinarySearchImpl binarySearch1 = applicationContext.getBean(BinarySearchImpl.class);
		System.out.println(binarySearch);
		System.out.println(binarySearch1);
		int result = binarySearch.binarySearch(new int[] { 12, 4, 6 }, 3);
		System.out.println(result);
//		com.spring.basics.springin5steps.BubbleSortAlgorithm@1f8b5b8
//		3
	}
}
