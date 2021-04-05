package md.java.tekwill.homework.exercise0204;

public class CalculatingTheProductOfOddInteger {
    public static void main(String[] args) {
        int suma = 1;
        for (int Variable = 1; Variable <= 15; Variable += 2){
            suma = Variable * suma;
        }
        System.out.println("Result:" + suma);
    }
}

