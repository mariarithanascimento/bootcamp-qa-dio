import java.util.*;
 
public class Main{

public static void main(String args[]) {
    Scanner input = new Scanner(System.in);

    // M valor normal | S pago | desconto é porcentagem de desconto
    int M, S, desconto;

    M = input.nextInt();
    S = input.nextInt();
    desconto = (S * 100) / M;

    System.out.println("O desconto foi de " + (100 - desconto) + "%");
      
}
}
