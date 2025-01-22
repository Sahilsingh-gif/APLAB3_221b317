class One {
    One(int x) {
        System.out.println("Constructor of One with x = " + x);
    }
}


class Two extends One {
    Two(int x) {
        super(x); // Call the parent class constructor
        System.out.println("Constructor of Two with x = " + x);
    }
}


public class Main {
    public static void main(String[] args) {
        Two obj = new Two(10);
    }
}


//error ocurred
//Main.java:8: error: constructor One in class One cannot be applied to given types;
//class Two extends One {
//^
  //required: int
 // found:    no arguments
 // reason: actual and formal argument lists differ in length
//1 error



//Solution add a constructor in two class
// Two(int x) {
//         super(x); // Call the parent class constructor
//         System.out.println("Constructor of Two with x = " + x);
//     }