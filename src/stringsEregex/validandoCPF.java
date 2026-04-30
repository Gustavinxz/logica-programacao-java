package stringsEregex;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
public class validandoCPF {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int continuar;
       do {
           System.out.println("-----------------------------");
           System.out.println("   Validando CPF com regex");
           System.out.println("-----------------------------");

           System.out.println("Modelo CPF(XXX.XXX.XXX-XX)\nDigite um CPF: ");
           String cpf = sc.nextLine();
           Pattern pattern = Pattern.compile("^\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}$");
           Matcher matcher = pattern.matcher(cpf);

           if (matcher.find()) {
               System.out.println("O cpf " + cpf + " é válido.");
           } else {
               System.out.println("O cpf " + cpf + " não é válido.");
           }
           System.out.println("Deseja testar outro CPF: 1 - Sim / 2 - Não");
           continuar = Integer.parseInt(sc.nextLine());
       }while(continuar == 1);
       System.out.println("Programa encerrado.");
    sc.close();
    }
}
