import java.util.Scanner;
public class validacaoSenha {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int continuar;
     do {
         int senhaCadastrada = 12345, senhaIserida;

         System.out.println("------------------------");
         System.out.println("    Bem vindo           ");
         System.out.println("------------------------");

         System.out.println("Digite sua senha para entrar: ");
         senhaIserida = sc.nextInt();

         if (senhaIserida != senhaCadastrada) {
             System.out.println("Senha incorreta, acesso negado.");
         } else {
             System.out.println("Senha correta, acesso permitido.");
             break;
         }
         System.out.println("Deseja tentar de novo?: 1 - Sim / 2 - Não");
         continuar = sc.nextInt();
     }while(continuar == 1 );
        sc.close();
    }
}
