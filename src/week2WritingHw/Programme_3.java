package week2WritingHw;

public class Programme_3 {
    static String surname  = "Testing";
    String name = "Prime";

    public void instanceMethod(){
        System.out.println(name);
        System.out.println(Programme_3.surname);
    }
    public static void staticMethod(){
        System.out.println(surname);
        Programme_3 programme3= new Programme_3();
        System.out.println(programme3.name);

    }
    public static void main(String[] args) {

        staticMethod();
        Programme_3 programme3= new Programme_3();
        programme3.instanceMethod();


    }

}
