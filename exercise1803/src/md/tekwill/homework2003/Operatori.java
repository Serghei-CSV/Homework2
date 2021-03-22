package md.tekwill.homework2003;

public class Operatori {
    public static void main(String[] args) {
        int a = 7;
                     //8   //7 //7     //9 //9     //7 //7     //9
        int result = ++a - --a + a++ + ++a - a-- - --a - a++ + ++a;
        System.out.println("result:"+result);
    }
}
