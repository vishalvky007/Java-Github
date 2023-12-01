/* Program-2:
 * Implementing the  concept  of  Wrapper  Classes,  Type  Casting  and
 * auto-boxing and un-boxing
 */

public class P2 {
	public static void main(String args[]) {

		int i = 30;
		float f = 50.0F;
		char c = 'a';
		boolean b = true;

		// Autoboxing: Converting primitives into objects
		Integer intobj = i;
		Float floatobj = f;
		Character charobj = c;
		Boolean boolobj = b;

		// Printing objects
		System.out.println("\n---Printing object values---");
		System.out.println("Integer object: " + intobj);
		System.out.println("Float object: " + floatobj);
		System.out.println("Character object: " + charobj);
		System.out.println("Boolean object: " + boolobj);

		// Unboxing: Converting Objects to Primitives
		int intvalue = intobj.intValue();	//converting Integer to int explicitly  	
		float floatvalue = floatobj.floatValue();
		char charvalue = charobj;	//unboxing, now compiler will write a.intValue() internally    
		boolean boolvalue = boolobj;

		// Printing primitives
		System.out.println("\n---Printing primitive values---");
		System.out.println("int value: " + intvalue);
		System.out.println("float value: " + floatvalue);
		System.out.println("char value: " + charvalue);
		System.out.println("boolean value: " + boolvalue);

		// Type casting example
		double doubleValue = 42.56;
		int intValue = (int) doubleValue; // Explicit casting (narrowing)

		System.out.println("\nType Casting Example:");
		System.out.println("Original double: " + doubleValue);
		System.out.println("Casted int: " + intValue);
	}
}
