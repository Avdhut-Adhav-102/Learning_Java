class ArithmeticSUB{
	public static void main( String [] args){
	
	
	byte a= 15;
	byte b = 12;
	int bbi =a-b; 
	
	short se = 200;
	short te = 100;
	int ssi = se-te;
	
	char w ='a';	
	char s ='b';
	int cci= w-s;
	
	long p = 5000l;
	long q = 2000l;
	long ll = p-q;
	
	float o = 2.1f;	
	float f = 1.2f;
	float ff = o-f;
	
	double d = 5.1;
	double k = 4.2;
	double dd = d-k;
	
	String y = "qspider";	
	String j = "jspider";
	//String ss = y-j;
	
	boolean x = true;
	boolean z = false;
	//boolean m = x-y;

System.out.println("byte - byte = int" + bbi);
System.out.println("short - short = int"+ ssi);
System.out.println("char - char = int" + cci);
System.out.println("long - long = long"+ll);
System.out.println("float - float = float"+ff);
System.out.println("double - double = double"+dd);
System.out.println("string - string =  error: bad operand types for binary operator '-' " );
System.out.println("boolean - boolean = CTE" );

}

}