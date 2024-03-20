import java.util.Locale;
import java.util.Scanner;

public class DadosCliente {

    String agencia;
    int numero;
    String nomeCliente;
    double saldo;

    Scanner scan = new Scanner(System.in).useLocale(Locale.US);

    private String validarStringComLimite(int limiteString){

        String entradaString = scan.next();

        while (entradaString.length() > limiteString){
            System.out.println("\nEntrada Invalida! Digite novamente (limite de " + limiteString + " caracteres):");
            entradaString = scan.next();
        }
        
        return entradaString;

    }

    private int validarIntComLimite(int limiteInt){

        int entradaInt = scan.nextInt();

        while (String.valueOf(entradaInt).length() > limiteInt){
            System.out.println("\nEntrada Invalida! Digite novamente (limite de " + limiteInt + " caracteres):");
            entradaInt = scan.nextInt();
        }

        return entradaInt;

    }

    public void acessarConta(){

        System.out.println("\nDigite as informações solicitadas abaixo corretamente para poder acessar a sua conta");

        System.out.println("\nDigite o número da sua agência (4 CARACTERES): ");
        agencia = validarStringComLimite(4);

        System.out.println("\nDigite o número da sua conta (6 CARACTERES): ");
        numero = validarIntComLimite(6);

        System.out.println("\nDigite o seu nome: ");
        scan.nextLine();
        nomeCliente = scan.nextLine();

        System.out.println("\nDigite valor do saldo da sua conta: ");
        saldo = scan.nextDouble();
    }

    
    public void imprimirConta(){
        System.out.println("\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo de R$ " + saldo + " já está disponivel para saque");
    }
    
}