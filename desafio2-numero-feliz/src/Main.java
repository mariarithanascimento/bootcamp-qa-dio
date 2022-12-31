import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int n;
        do {
            n = sc.nextInt();
 
            if (!(n >= 0)) {
            }
 
        } while (!(n >= 0));
 
     
        HashSet<Integer> numeros = new HashSet<>();
        boolean repetido = false;
 
   
        while (n != 1 && !repetido) {
 

            int[] digitos = devolveDigitos(n);
 

            int soma = 0;
            for (int i = 0; i < digitos.length; i++) {
                soma += Math.pow(digitos[i], 2);
            }
 

            if (!numeros.add(n)) {
                repetido = true;
            }
 

            n = soma;
 
        }
 

        if (n == 1) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
 
    }
 
    public static int[] devolveDigitos(int n) {
 

        if (n == 0) {
            int digitos[] = {0};
            return digitos;
        }
 

        int digitos[] = new int[conta(n)];
        int digito;

        int numeroOriginal = Math.abs(n);
        for (int i = 0, j = digitos.length - 1, copiarNumero = numeroOriginal; numeroOriginal > 0; i++, j--) {

            copiarNumero /= 10;

            digito = numeroOriginal - (copiarNumero * 10);

            digitos[j] = digito;

            numeroOriginal = copiarNumero;
        }
        return digitos;
    }
 
    public static int conta(int num) {
 
        int contador = 0;
 
        if (num == 0) {
            contador = 1;
        } else {
            
            for (int i = Math.abs(num); i > 0; i /= 10) {
                contador++;
            }
 
        }
 
        return contador;
}
}
