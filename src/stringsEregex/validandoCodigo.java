package stringsEregex;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class validandoCodigo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int continuar;
        do {
           System.out.println("-----------------------------");
           System.out.println(" Validando código com regex");
           System.out.println("-----------------------------");

           System.out.println("Modelo de código ABC-1234\nDigite seu código: ");
           String codigo = sc.nextLine();
           Pattern pattern = Pattern.compile("^[A-Z]{3}-\\d{4}$");
           Matcher matcher = pattern.matcher(codigo);

           if (matcher.find()) {
               System.out.println("Código Válido.");
           } else {
               System.out.println("Código inválido.");
           }

           System.out.println("Deseja inserir outro código? 1 - Sim / 2 - Não");
           continuar = Integer.parseInt(sc.nextLine());
        }while(continuar == 1);

        sc.close();
    }
}
