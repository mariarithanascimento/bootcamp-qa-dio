import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero = scan.nextInt();
        int produto = 1;
        int soma = 0;

        String numeroEmString = String.valueOf(numero);
        String[] split = numeroEmString.split("");
        int[] ints = Arrays.stream(split).mapToInt(Integer::new).toArray();

        for (int i = 0; i < split.length; i++) {
            produto = ints[i] * produto;
        }

        for (int n : ints) {
            soma += n;
        }

        System.out.println(produto - soma);

        }
}