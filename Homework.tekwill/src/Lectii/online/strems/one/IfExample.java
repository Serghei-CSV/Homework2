package Lectii.online.strems.one;

public class IfExample {
    public static void main(String[] args) {
        int score = 200;
        String name = "Lion";
        if(name.equals("Lion"))
            score = 200;

        System.out.println("(Lion) score= "+ score);
        if (name.equals("Tiger"))
            score = 300;

        System.out.println("(Tiger) score =" +score);

    }
}
