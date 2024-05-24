import java.util.Scanner;


public class ContaTerminal{
    public static void main(String[] args){
        //ClasseScaner
        Scanner sc = new Scanner(System.in);


        //Exibir mensagem e obter a mensagem

        //xxx.xxx.xxx
        System.out.println("Numero da conta");
        int numero = sc.nextInt();
        //xxx-x
        System.out.println("Agência");
        String agencia = sc.nextLine();
        //Nome Sobrenome
        System.out.println("Nome Cliente");
        String nomeCliente = sc.nextLine();
        //x.xx
        System.out.println("Saldo");
        int saldo = sc.nextFloat();

        System.out.println("Ola " + nomeCliente + " sua conta " + numero + " / " + agencia + " Seu saldo é de R$" + saldo);
    }
}