package stringsEregex;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
public class validandoSenha {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int continuar;
       do {
           System.out.println("-----------------------------");
           System.out.println("      Validando Senhas");
           System.out.println("-----------------------------");
           System.out.println("As condições para senhar ser valida:\n8 caracteres\nUma letra maiúscula\nUma letra minúscula" +
                   "\nUm número\nUm caractere especial\n-----------------------------");

           System.out.println("Digite Sua senha: ");
           String senha = sc.nextLine();
           Pattern pattern = Pattern.compile("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[@$!%*?&#])[A-Za-z\\d@$!%*?&#]{8,}$");
           Matcher matcher = pattern.matcher(senha);

           if (matcher.find()) {
               System.out.println("Senha válida !!!");
           } else {
               System.out.println("Senha inválida.");
           }

           System.out.println("Deseja tentar outra senha? 1 - Sim 2 - Não");
           continuar = Integer.parseInt(sc.nextLine());
       }while(continuar == 1);

       sc.close();
    }
}
