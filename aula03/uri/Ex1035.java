package uri;
import java.util.Scanner;

public class Ex1035 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A,B,C,D;

        System.out.println("Digite os quatro valores A,B,C e D");
        A = in.nextInt();
        B = in.nextInt();
        C = in.nextInt();
        D = in.nextInt();

        if(B > C && D > A) {
            if((C + D) > (A + B) ){
                if(C > 0 && D > 0){
                    if((A % 2) == 0){
                        System.out.println("Valores aceitos\n");
                    }
                }
            }
        } else {
            System.out.println("Valores nao aceitos\n");
        }
        
        in.close();
    }
}
