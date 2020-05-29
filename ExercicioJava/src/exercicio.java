import java.util.Scanner;

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
