import java.util.Scanner;
public class comparandoNumeros {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);


        int continuar;
     do {
         double n1, n2;

         System.out.println("--------------------------------");
         System.out.println("      Comparado Número !!!");
         System.out.println("--------------------------------");

         System.out.println("Digite o primeiro número: ");
         n1 = sc.nextDouble();
         System.out.println("Digite o segundo número: ");
         n2 = sc.nextDouble();

         if (n1 > n2) {
             System.out.println("O maior número é  " + n1);
         } else if (n2 > n1) {
             System.out.println("O maior número é " + n2);
         } else if (n1 == n2) {
             System.out.println("Os números são iguais.");
         }
        System.out.println("Deseja comparar outros números? 1 - Sim / 2 - Não.");
         continuar = sc.nextInt();
     }while(continuar == 1 );
     System.out.println("Programa encerrado.");
        sc.close();
    }
}
