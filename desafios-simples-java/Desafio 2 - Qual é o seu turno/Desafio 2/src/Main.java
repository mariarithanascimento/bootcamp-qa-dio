import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Adicionamos o método Scanner para o usuario digitar os valores
        Scanner entrada = new Scanner(System.in);

        //Declarando as variaveis
        char turno;

        //as informações serão capturas no bloco abaixo:
        turno = entrada.next().charAt(0);

        //criando as condições

        if(turno == 'M' || turno == 'm'){
            System.out.println("Bom Dia!");

        } else if(turno == 'V' || turno == 'v'){
            System.out.println("Boa Tarde!");

        } else if(turno == 'N' || turno == 'n'){
            System.out.println("Boa Noite!");

        } else{
            System.out.println("Valor Inválido!");
        }
        
}
}
