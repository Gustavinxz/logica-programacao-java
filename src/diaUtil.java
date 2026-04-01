import java.util.Scanner;
public class diaUtil {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int continuar;
        do {
            String dia;

            System.out.println("---------------------------------");
            System.out.println("          Dias úteis");
            System.out.println("---------------------------------");

            System.out.println("Digite um dia da semana (em letras minúsculas) : ");
            dia = sc.nextLine();

            if (dia.equals("segunda") || dia.equals("terça") || dia.equals("quarta") || dia.equals("quinta") || dia.equals("sexta")) {
                System.out.println(dia + " é um dia útil.");
            } else if (dia.equals("sabado") || (dia.equals("domingo"))) {
                System.out.println(dia + " não é um dia útil.");
            } else {
                System.out.println("Isso não e um dia da semana.");
            }

        System.out.println("Deseja  testar outro dia? 1 - Sim / 2 - Não");
            continuar = sc.nextInt();
        }while(continuar == 1);
        System.out.println("Programa encerrado.");
        sc.close();
    }
}
