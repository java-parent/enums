/**
 * 
 */
package com.loinx.java.enums;

import java.io.Closeable;
import java.io.IOException;

/**
 * <ul>
 * <li>All java enum implicitly extends java.lang.Enum class that extends Object
 * class and implements Serializable and Comparable interfaces. So we can’t
 * extend any class in enum. </li>
 * 
 * <li>Since enum is a keyword, we can’t end package name
 * with it, for example com.journaldev.enum is not a valid package name. 
 * </li>
 * 
 * <li>Java enum can implement interfaces. As in above enum example, it’s implementing
 * Closeable interface. 
 * </li>
 * <li>Java enum constructors are always private. </li>
 * <li>We can’t create instance of enum using new operator. </li>
 * <li>We can declare abstract methods in java enum, then all the enum fields must implement the abstract method. In
 * above example getDetail() is the abstract method and all the enum fields have
 * implemented it. 
 * </li>
 * <li>We can define a method in enum and enum fields can override
 * them too. For example, toString() method is defined in enum and enum field
 * START has overridden it. </li>
 * <li>Java enum fields has namespace, we can use enum
 * field only with class name like ThreadStates.START </li> 
 * <li>Enums can be used in switch statement, we will see it in action in the later part of this
 * tutorial. 
 * </li>
 * <li>We can extend existing enum without breaking any existing
 * functionality. </li>
 * For example, we can add a new field NEW in ThreadStates enum
 * without impacting any existing functionality. </li>
 * <li>Since enum fields are constants, java best practice is to write them in block letters and
 * underscore for spaces. For example EAST, WEST, EAST_DIRECTION etc.</li>
 * <li>Enum constants are implicitly static and final</li>
 * <li> Enum constants are final but it’s variable can still be changed. For example, we can use setPriority() method
 * to change the priority of enum constants. We will see it in usage in below
 * example. </li>
 * <li>Since enum constants are final, we can safely compare them using
 * “==” and equals() methods. Both will have the same result.</li>
 * </ul>
 * @author loinx
 *
 */
public enum ThreadStatesEnum implements Closeable {
	START(1) {
		@Override
		public String toString() {
			return "START implementation. Priority=" + getPriority();
		}

		@Override
		public String getDetail() {
			return "START";
		}
	},
	RUNNING(2) {
		@Override
		public String getDetail() {
			return "RUNNING";
		}
	},
	WAITING(3) {
		@Override
		public String getDetail() {
			return "WAITING";
		}
	},
	DEAD(4) {
		@Override
		public String getDetail() {
			return "DEAD";
		}
	};

	private int priority;

	public abstract String getDetail();

	// Enum constructors should always be private.
	private ThreadStatesEnum(int i) {
		priority = i;
	}

	// Enum can have methods
	public int getPriority() {
		return this.priority;
	}

	public void setPriority(int p) {
		this.priority = p;
	}

	// Enum can override functions
	@Override
	public String toString() {
		return "Default ThreadStatesConstructors implementation. Priority=" + getPriority();
	}

	@Override
	public void close() throws IOException {
		System.out.println("Close of Enum");
	}

}
