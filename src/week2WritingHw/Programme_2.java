package week2WritingHw;

public class Programme_2 {
//Declare two static variables
    static int a = 100;
    static int b = 200;
//Declare one static method
//  Call both static variables into the static method inside the print statement
    public static void staticMethod(){
        System.out.println(a);
        System.out.println(b);
    }
    //Declare the Main method.
    // * 2.5 Call the static method into the Main method and Run the programme.

    public static void main(String[] args) {

        staticMethod();
    }
}
