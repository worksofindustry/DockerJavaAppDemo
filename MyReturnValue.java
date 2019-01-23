import java.time.LocalDate;


public class MyReturnValue {
  static int myMethod(int x) {
    return 5 + x;
	//void indicates the method should not return a value, it you want
	//the method to return something, use a primative type in its place
	//and use the word return inside of the method
  }
  
  //this example method takes two paramters
  static int myAddingFunction(int x, int y){
	  return x + y;	  
  }
  
  static void checkAge(int age){
	  String ageCheck = (age < 18) ? "You are too young" : "you may proceed";
	  System.out.println(ageCheck);
  }
  
  public void myPublicMethod(){
	  
	  System.out.println("Hello from Public Method!");
	  //unlike static methods, public methods must first have
	  //a new object of the Class file, MyReturnValue, created before it can be used!!!
  }

  public static void main(String[] args) {
    System.out.println(myMethod(3));
	
	System.out.println("\nThe sum is " + myAddingFunction(22,3) + "!\n");
	checkAge(5);
	
	MyReturnValue myPublicObj = new MyReturnValue(); //create an object of MyClass
	myPublicObj.myPublicMethod(); //call the public method on the object
	
	LocalDate myDate = LocalDate.now(); //calling imported object from java.time.LocalDate
	System.out.println("Todays Date: " + myDate);
	
	
  }
}