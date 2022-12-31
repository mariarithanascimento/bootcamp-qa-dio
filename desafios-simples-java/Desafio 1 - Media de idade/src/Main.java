import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       
        //Declarando as variaveis
        int idade1, idade2, idade3, media;

        //Adicionamos o método Scanner para o usuario digitar os valores
        Scanner entrada = new Scanner(System.in);
        
        //as idades serão capturadas nesse bloco abaixo:

        idade1 = entrada.nextInt();
        idade2 = entrada.nextInt();
        idade3 = entrada.nextInt();

        //iniciar a variavel média

        media = (idade1 + idade2 + idade3)/3;

        //criando as condições
        if(media <= 25){

            System.out.println("Jovem!");

        }else if(media >= 26 && media < 60){

            System.out.println("Adulta!");

        } else{

            System.out.println("Idosa!");
        }
    }
   
}