import java.util.Scanner;  

/*  

1. Pedra = Flecha
2. Papel = Escudo
3. Tesoura = Espada

jogador = jogador1
computador = jogador2

*/
public class PedraPapelTesoura {  
    public static void main(String[] args){  

        Scanner teclado = new Scanner(System.in);  

        int jogador1 = teclado.nextInt(); 
        int jogador2 = teclado.nextInt(); 
    /* 
        switch (jogador1) {
            case 1:
                System.out.println("Jogador 1 escolheu Flecha");
            break;

            case 2:
                System.out.println("Jogador 1 escolheu Escudo");
            break;

            case 3:
                System.out.println("Jogador 1 escolheu Espada");
            break;
        
            default:
                System.out.println("Opção Inválida!");
                break;
        }

        switch (jogador2) {
            case 1:
                System.out.println("Jogador 2 escolheu Flecha");
            break;

            case 2:
                System.out.println("Jogador 2 escolheu Escudo");
            break;

            case 3:
                System.out.println("Jogador 2 escolheu Espada");
            break;
        
            default:
                System.out.println("Opção Inválida!");
            break;
        }   
*/  
        if(jogador1 == jogador2){
            System.out.println("Empatou");

        }else{
            if((jogador1 == 1 && jogador2 == 3) || (jogador1 == 2 && jogador2 == 1) || (jogador1 == 3 && jogador2 == 2)){
                System.out.println("Ganhou");
            }else{
                System.out.println("Perdeu");

            }

        }
        
        teclado.close();
     }
}
