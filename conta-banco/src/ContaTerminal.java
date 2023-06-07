import java.util.Scanner;
public class ContaTerminal{
    public static void main(String[] args) throws Exception {
        //criar Scanner
        Scanner sc = new Scanner(System.in);

        //Pedir  inputs do úsuario e armazenar os valores em suas respectivas variaveis
        System.out.println("Por favor, digite seu nome: ");
        String nomeCliente = sc.nextLine();
        

        System.out.println("Por favor, digite o número da Conta: ");
        //resolvendo o problema do nextInt() não pegar a linha inteira assim pulando o nextLine()
        int numero = Integer.parseInt(sc.nextLine());
       

        System.out.println("Por favor, digite o número da agencia: ");
        String agencia = sc.nextLine();
        


        System.out.println("Por favor, digite o valor que gostaria de depositar: ");
        double saldo = sc.nextDouble();
        

    }
}
