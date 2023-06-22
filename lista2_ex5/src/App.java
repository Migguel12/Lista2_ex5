import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Informe a nota da primeira avaliacao: ");
        double n1 = ler.nextDouble();
        System.out.println("");

        System.out.print("Informe a nota da segunda avaliaco: ");
        double n2 = ler.nextDouble();
        System.out.println("");

        double media = ((n1 + n2)/2);

        if(media > 7 && media < 10){
            System.out.print("Aprovado");
        }
        if(media < 7){
            System.out.print("Reprovado");
        }
        if(media == 10){
            System.out.print("Aprovado com distincao");
        }
    }
}
