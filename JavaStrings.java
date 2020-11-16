import java.util.Scanner;

public class JavaStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String A = scanner.next();
        String B = scanner.next();
        int total = A.length() + B.length() ;


        String firstletterofA = A.substring(0,1);
        String remaininglettersofA = A.substring(1,A.length());
        String firstletterofB = B.substring(0,1);
        String remaininglettersofB = B.substring(1,B.length());

        System.out.println(total);
        if(A.compareTo(B) > 0)
        {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }
        System.out.println(firstletterofA.toUpperCase() + remaininglettersofA + " " + firstletterofB.toUpperCase() + remaininglettersofB);


    }
}
