package md.tekwill.homework2003;

public class Coment {
    public static void main(String[] args) {
        int a = 18;
        int b = 22;
        int c = 30;
        System.out.println(++a > 18 || b++ < 10);// true  false = true
        System.out.println(b-- > 30 && a++ <= 19); // false  true = false
        System.out.println(c++ > a && a < b || c++ < 30);// true  true  false  = true
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
    }
}
