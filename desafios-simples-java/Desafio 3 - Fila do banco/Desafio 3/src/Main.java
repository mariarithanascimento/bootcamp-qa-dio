import java.util.Scanner; 
 
public class Main { 
 
    public static void main(String[] args) { 
        
        Scanner nome = new Scanner(System.in);
        String[] nomesFila = new String[3];
        
        for(int i= 0; i < nomesFila.length; i++){

            nomesFila[i] = nome.next();
            System.out.format("%s - esta na posicao: %d%n", nomesFila[i], (i + 1));
        }
         
  
  } 
}
