import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);
        int T = entrada.nextInt();
        int amigos = entrada.nextInt();
        int fatias = entrada.nextInt();
        
        double quantidadeFatias = (amigos * fatias);

    if(quantidadeFatias > 4){
        double quantidadePizza = (quantidadeFatias / 4 );
        System.out.println(Math.round(quantidadePizza));

    } else{
        System.out.println("1");
    }

    }
}
