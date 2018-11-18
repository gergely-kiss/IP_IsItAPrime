package uk.gergely.kiss.isiraprime;

import uk.gergely.kiss.educationutil.print.method.PrintMethod;
import uk.gergely.kiss.isiraprime.iterative.CalculationIterative;
import uk.gergely.kiss.isiraprime.recursive.CalculationRecursive;


public class IsItAPrime {

	public static void main(String[] args) {
		Long max = Long.MAX_VALUE;		
		PrintMethod pm = new PrintMethod("Number: ", "isPrime :");
		
		long startTime = System.currentTimeMillis();
		pm.printMehod(max, new CalculationIterative());		
		long endTime = System.currentTimeMillis();
		System.out.println( (endTime - startTime)/1000);
		
		startTime = System.currentTimeMillis();
		pm.printMehod(max, new CalculationRecursive());
		endTime = System.currentTimeMillis();
		System.out.println((endTime - startTime)/1000);
	}

}
