import java.util.Scanner;
public class verificandoIntervaloNumeros {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int continuar;

       do {
           double emprestimo;

           System.out.println("---------------------------------");
           System.out.println("  Disponibilidade empréstimos");
           System.out.println("---------------------------------");

           System.out.println("Digite o valor que você quer de empréstimo: ");
           emprestimo = sc.nextDouble();

           if (emprestimo >= 1000 && emprestimo <= 5000) {
               System.out.println("O valor " + emprestimo + " está dentro do intervalo permitido para empréstimo. ");
           } else {
               System.out.println("O valor " + emprestimo + " não está dentro do intervalo permitido para empréstimo. ");
           }
           System.out.println("Deseja tentar outro valor? 1 - Sim / 2 - Não");
           continuar = sc.nextInt();
       }while(continuar == 1);
       System.out.println("Programa encerrado");
       sc.close();
    }
}
