package myjava;

public class Test {

    public static void main(String[] args) {
        String s1 = "Amit";
        String s2 = "Amit";
        System.out.println(s1==s2);
        String s3 = new String("Amit");
        String s4 = new String("Amit");
        System.out.println(s3==s4);
        System.out.println(s3=="Amit");
        System.out.println(s3.equals("Amit"));


        Open t = new Open();
        Open.Tst v = new Open.Tst();

        v.testit();
    }
}
class Open{
    private static int i = 1;
    private static String str = "Hello";

    static class Tst{

        public void testit(){
            System.out.println(i);
            System.out.println(str);
        }
    }
}