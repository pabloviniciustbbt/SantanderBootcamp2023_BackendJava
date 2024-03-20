import java.util.Scanner;

public class Contador {
    
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("-----------------------------");
        System.out.println("    Contador Incremental");
        System.out.println("-----------------------------");

        System.out.println("\nDigite o primeiro parâmetro:");
        int parametroum = scan.nextInt();
        System.out.println("\nDigite segundo parâmetro:");
        int parametrodois = scan.nextInt();

        try {
            System.out.println("\n");
            contar(parametroum, parametrodois);
            System.out.println("\n");
        } catch (ParametrosInvalidosException e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }

        scan.close();
    }

    static void contar(int parametroum, int parametrodois) throws ParametrosInvalidosException{
        if (parametroum >= parametrodois){
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro!\n");
        } 
        
        int contagem = parametrodois - parametroum;

        for(int i = 1; i <= contagem; i++){
            System.out.println("Imprimindo o número " + i);
        }
    }
}
