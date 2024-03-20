public class ContaTerminal {

    public static void main(String[] args) {

        DadosCliente cliente = new DadosCliente();
        
        System.out.println("-----------------------------------");
        System.out.println("     Bem-vindo ao Banco DIO!");
        System.out.println("-----------------------------------");

        cliente.acessarConta(); 
        
        cliente.imprimirConta();

    }

    
}