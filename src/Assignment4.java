
public class Assignment4 {

	public static void main(String[] args) {
		
		//Construct a new MyInteger object with a value of 997
		MyInteger Integer1 = new MyInteger(997);

		//prints our header for the instance result
		System.out.println("Testing Instance Method, isPrime");
		//calls the instance method isPrime into a variable
		boolean p = Integer1.isPrime();
		//calls the print and test method
		printPrime(Integer1, p);
		//prints header and separator for the static result
		System.out.println("---------------------------------------------");
		System.out.println("Testing Static Method (that takes a ref variable), isPrime");
		//calls the static method isPrime into our variable
		p = MyInteger.isPrime(Integer1);
		//the same print method after we update p 
		printPrime(Integer1, p);
		
		//adds some space between the results of our two MyInteger objects
		System.out.println();
		System.out.println();
		
		//Construct a new MyInteger object with a value of 998
		MyInteger Integer2 = new MyInteger(998);
		
		//prints our header for the instance result
		System.out.println("Testing Instance Method, isPrime");
		//calls the instance method isPrime into our variable
		p = Integer2.isPrime();
		//the same print method with our new MyInteger and p
		printPrime(Integer2, p);
		//prints header and separator for the static result
		System.out.println("---------------------------------------------");
		System.out.println("Testing Static Method (that takes a ref variable), isPrime");
		// calls the static method isPrime into our variable
		p = MyInteger.isPrime(Integer2);
		//the same print method after we update p
		printPrime(Integer2, p);

		
		
		
	
	}
	
	
	/*Takes the object reference and a boolean result to print whether the integer is prime or not
	 Note that the boolean test for whether a number is prime or not needs to be done before we call this method, all this does is print the corresponding text
	 */
	static public void printPrime(MyInteger I, boolean prime)
	{
		if (prime == true)
	{System.out.println("isPrime: "+I.value+" is prime");}
	else
	{System.out.println("isPrime: "+I.value+" is not prime");}
	}
}


//MyInteger class
class MyInteger 
{
	//the datafield the stores an int value
	int value;
	
	//our constructors, the default value is 1
	MyInteger()
	{value = 1;}
	MyInteger(int i)
	{value = i;}
	
	//a getValue method
	int getValue()
	{int r = value;
		return r;}
	
	//a setValue method
	void setValue(int i)
	{value = i;}
	
	//our instance isPrime method that references itself
	boolean isPrime()
	{
		boolean p = true;
		int c = 2;
			for (c = 2; c <= value; c++)
				{if (value % c == 0)
					{p = false;}}
		return p;
	}
	
	//our static isPrime method that needs an object reference
	static boolean isPrime(MyInteger I)
	{
		boolean p = true;
		int c = 2;
			for (c = 2; c<= I.value; c++)
				{if(I.value % c== 0)
					{p = false;}}
		return p;
	}	
}
//nonsense end comment