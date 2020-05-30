package com.home;

public class LambdaExpression {

	/* Lamda Expression is an anonymous function
	 * Nameless
	 * without return type
	 * without modifiers
	 */

	public static void main(String[] args) {
	
	// () -> System.out.println("Hello Lambda");
    // (a, b) ->  System.out.println(a+b);
	// n -> n*n;
		
	//	(String name) -> System.out.println("Hello Lambda");
		
		functionalLambdaInterface f = new functionalLambdaInterface() {

			@Override
			public void show(String name) {
             System.out.println(name);				
			}
			
		};
		
		f.show("Test");
		functionalLambdaInterface f1 = (name) -> {System.out.println(name);};
		
		f1.show("Test Lamda Expression");

			
		
}
		
		
		
		

}