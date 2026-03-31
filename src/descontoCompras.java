import java.util.Scanner;
public class descontoCompras {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        double valorCompra,desconto,valorComDesconto;



        System.out.println("----------------------------------------------");
        System.out.println("Digite o valor da sua compra.\ncompras acima de $100, possuem desconto.");
        System.out.println("----------------------------------------------");

        System.out.println("Valor da compra: ");
        valorCompra  = sc.nextDouble();

        if(valorCompra >= 100){
            desconto = valorCompra * 0.10;
            valorComDesconto = valorCompra - desconto;
            System.out.println("Desconto de 10% aplicado.");
            System.out.println("Novo valor: "+valorComDesconto);
        }else{
            System.out.println("Nenhum desconto aplicado.");
            System.out.println(valorCompra);
        }

        sc.close();
    }
}
