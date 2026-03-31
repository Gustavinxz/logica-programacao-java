import java.util.Scanner;
public class aprovacaoNotas {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int continuar;
       do {
           double n1, n2, n3, media;

           System.out.println("------------------------");
           System.out.println(" Sistema de Aprovação");
           System.out.println("------------------------");

           System.out.println("Digite a nota da sua primeira prova: ");
           n1 = sc.nextDouble();
           System.out.println("Digite a nota da sua segunda prova: ");
           n2 = sc.nextDouble();
           System.out.println("Digite a nota da sua terceira prova: ");
           n3 = sc.nextDouble();

           media = (n1 + n2 + n3) / 3;

           if (media >= 7) {
               System.out.println("O estudante teve média " + media + " e foi aprovado.");
           } else if (media >= 5 && media <= 6.9) {
               System.out.println("O estudante teve média " + media + " e esta de recuperação.");
           } else {
               System.out.println("O estudante teve média " + media + " e esta reprovado. ");
           }

        System.out.println("Deseja usar outras notas?: 1 - Sim / 2 - Não");
        continuar = sc.nextInt();
       }while(continuar == 1);
       System.out.println("Programa encerrado.");
       sc.close();
    }
}
