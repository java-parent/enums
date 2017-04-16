/**
 * 
 */
package com.loinx.java.enums;

/**
 * @author loinx
 *
 */
public class EnumOverConstantTest {
	public static void main(String[] args) {
		benefitsOfEnumOverConstants();
	}

	/**
	 * This method shows the benefit of using Enum over Constants
	 */
	private static void benefitsOfEnumOverConstants() {
		// Enum values are fixed
		simpleEnumExample(ThreadStates.START);
		simpleEnumExample(ThreadStates.WAITING);
		simpleEnumExample(ThreadStates.RUNNING);
		simpleEnumExample(ThreadStates.DEAD);
		simpleEnumExample(null);

		simpleConstantsExample(1);
		simpleConstantsExample(2);
		simpleConstantsExample(3);
		simpleConstantsExample(4);
		// we can pass any int constant
		simpleConstantsExample(5);
	}

	private static void simpleEnumExample(ThreadStates th) {
		if (th == ThreadStates.START)
			System.out.println("Thread started");
		else if (th == ThreadStates.WAITING)
			System.out.println("Thread is waiting");
		else if (th == ThreadStates.RUNNING)
			System.out.println("Thread is running");
		else
			System.out.println("Thread is dead");
	}

	private static void simpleConstantsExample(int i) {
		if (i == ThreadStatesConstant.START)
			System.out.println("Thread started");
		else if (i == ThreadStatesConstant.WAITING)
			System.out.println("Thread is waiting");
		else if (i == ThreadStatesConstant.RUNNING)
			System.out.println("Thread is running");
	}
	
}
