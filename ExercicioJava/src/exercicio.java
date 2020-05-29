import java.util.Scanner;

//Algorítimo para testar o índice do array(vetor), temos um array(vetor) de 15 números, é ultilizado um FOR para pedir que o usuário digite um número 15 vezes, se o número digitado for igual a 30 ele mostra o índice do array(vetor). O índice vai de 0 a 14.

public class exercicio {
    public static void main(String[] args){
        int num[]= new int[15];
        int i;
        Scanner leia = new Scanner(System.in);
        for(i=0;i < num.length; i++){
            System.out.print("Digite um número: ");
            num[i] = leia.nextInt();

            if (num[i]==30){
                System.out.println("Índice " + i);
            }
            
        }   
    }
}
