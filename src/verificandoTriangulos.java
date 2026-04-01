import java.util.Scanner;
public class verificandoTriangulos {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       int continuar;
       do {
           int l1, l2, l3;
           System.out.println("---------------------------------");
           System.out.println("Verificação de existência de triângulos");
           System.out.println("---------------------------------");

           System.out.println("Digite o primeiro lado: ");
           l1 = sc.nextInt();
           System.out.println("Digite o segundo lado: ");
           l2 = sc.nextInt();
           System.out.println("Digite o terceiro lado: ");
           l3 = sc.nextInt();

           if (l1 + l2 > l3 && l1 + l3 > l2 && l2 + l3 > l1) {
               System.out.println("Os lados podem formar um triângulo. ");
           } else {
               System.out.println("Os lados Não podem formar um triângulo. ");
           }
        System.out.println("Deseja testar outras medidas? 1 - Sim / 2 - Não");
           continuar = sc.nextInt();
       }while(continuar == 1);
      System.out.println("Programa encerrado.");
       sc.close();
    }
}
