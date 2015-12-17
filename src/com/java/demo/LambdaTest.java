/*
 * Copyright (c) 2015 아시아나IDT
 * 
 * 이 프로그램은 저작권 보호법에 의해 보호됩니다.
 * 이 프로그램의 일부나 전부를 무단으로 복제하거나 배포하는 경우에는
 * 저작권의 침해가 되므로 주의하시기 바랍니다.
 */
package com.java.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * 이 클래스는...
 *
 * @author yoots
 * Created on 2015. 12. 15.
 */

public class LambdaTest {

	interface IAdd<V>{
		
		abstract V add(V x , V y);
	}
	
	/**
	 *
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		IAdd<Integer>  lambda = (x,y) -> x + y;
		System.out.println(lambda.add(3 ,  4));
		
		
		List<Integer> list = Arrays.asList(1 , 2, 3, 4, 5, 6, 7);
		
		System.out.println("Print all numbers : ");
		evaluate(list , (n) -> true);
		
        System.out.println("Print no numbers : ");
        evaluate(list, (n)->false);

        System.out.println("Print even numbers : ");
        evaluate(list, (n)-> n%2 == 0 );

        System.out.println("Print odd numbers : ");
        evaluate(list, (n)-> n%2 == 1 );
        
        System.out.println("Print numbers greater than 5 : ");
        evaluate(list, (n)-> n > 5 );
	
        
        //New way:
        List<Integer> list2 = Arrays.asList(1,2,3,4,5,6,7);
        list2.stream().map((x) -> x*x).forEach(System.out::println);
        
	}
	
	public static void evaluate(List<Integer> list , Predicate<Integer> predicate){
		
		for(Integer n : list){
			if(predicate.test(n)){
				System.out.print(n + " ");
			}
		}
	}

}
