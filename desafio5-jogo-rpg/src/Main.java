import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        int dados = leitor.nextInt();
        int vidaDoJogador = leitor.nextInt();
        int ataqueDoJogador= leitor.nextInt();
        int defesaDoJogador = leitor.nextInt();
        int vidaDoInimigo= leitor.nextInt();
        int ataqueDoInimigo = leitor.nextInt();

        //Dados
        if(dados >= 8 && dados < 10){
            dados = (dados + ataqueDoJogador) * 2;
        }else{
            dados = (dados + ataqueDoJogador);
        }

        //Dano causado ao jogador
        int danoJogador = dados + vidaDoJogador - ataqueDoInimigo;

        //Dano causado ao inimigo

        int danoInimigo = vidaDoInimigo - dados;

        if(danoJogador > 0 && danoInimigo <= 0){
            System.out.println("Jogador sobreviveu e derrotou o inimigo");

        } else if (danoJogador > 0 && danoInimigo > 0) {
            System.out.println("Jogador sobreviveu e nao derrotou o inimigo");
        }else{
            System.out.println("Jogador nao sobreviveu");
        }

    }
}