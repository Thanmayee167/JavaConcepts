package polymorphism.superkeyword;

//Example of super keyword where super() is provided by the compiler implicitly.
class Animal3{
Animal3(){System.out.println("animal is created");}
}  
class Dog3 extends Animal3{
Dog3(){
System.out.println("dog is created");  
}  
}  
public class Example4{
public static void main(String args[]){  
Dog3 d=new Dog3();
}}  