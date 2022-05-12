package com.chainsys.variables;

public class Calculate {
	/**
	 * @author Chainsys-ayyanar
	 * created on : 25 march 2022
	 */
	//public class Calculator {
		/**
		 * Add method: will take 2 integer values using the following parameters
		 * add will add the values.The result of totaling the summation will be returned back to the caller
		 * This a static method,object reference is not required
		 * @param param1 of type int
		 * @param param2 of type int
		 * return type int
		 */
		public static int add(int param1,int param2) {
			int result = param1+param2;
			return result;
		}
			/**
			 * multiple method: will take 2 integer values using the following parameters
			 *multiple and will multiple the values.The result of totaling the summation will be returned back to the caller
			 * This a static method,object reference is not required
			 * @param param1 of type int
			 * @param param2 of type int
			 * return type int
			 */
			public static int multiple(int param1,int param2) {
				int result = param1*param2;
				return result;
			}
		
	
		/**
		 * divide method: will take 2 integer values using the following parameters
		 * divide will divide the values.The result of totaling the summation will be returned back to the caller
		 * This a static method,object reference is not required
		 * @param param1 of type int
		 * @param param2 of type int
		 * return type int
		 */
		public static int divide(int param1,int param2) {
			int result = param1/param2;
			return result;
		}
	
		/**
		 * Subtracter method: will take 2 integer values using the following parameters
		 * sub will add the values.The result of totaling the summation will be returned back to the caller
		 * This a static method,object reference is not required
		 * @param param1 of type int
		 * @param param2 of type int
		 * return type int
		 */
		public static int subtractor(int param1,int param2) {
			int result = param1-param2;
			return result;
		
		}
	
}



