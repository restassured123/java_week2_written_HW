package week2WritingHw;

public class Programme_4 {

    String Name ="Prime";
    String Surname="Testing";

    static boolean a = true;
    static boolean b = false;

    public void instanceMethod(){
        System.out.println(Name);
        System.out.println(Surname);
        System.out.println(a);
        System.out.println(b);
    }
    public static void staticMethod(){
        System.out.println(a);
        System.out.println(b);

        Programme_4 programme4= new Programme_4();
        System.out.println(programme4.Name);
        System.out.println(programme4.Surname);
    }
    public static void main(String[] args) {
        staticMethod();

        Programme_4 programme4= new Programme_4();
        programme4.instanceMethod();


    }
}
