package singleton;

public class Main {
    
    public static void main(String[] args) {
        
        //Criação lista de filmes
        Filme filme1 = new Filme("Star Wars", "George Lucas", 1977);
        Filme filme2 = new Filme("Arrival", "Denis Villeneuve", 2016);
        Filme filme3= new Filme("Ex Machina", "Alex Garland", 2014);
        Filme filme4= new Filme("Eternals", "Chloé Zhao", 2021);

        //Obtendo a instância única da biblioteca de filmes
        BibliotecaDeFilmes biblioteca = BibliotecaDeFilmes.getInstancia();

        System.out.println("-------------------------------");
        System.out.println("    Gerenciamento de Filmes");
        System.out.println("-------------------------------");

        //Marcando filmes como 'Assistidos'
        biblioteca.adicionarAAssistidos(filme1);
        biblioteca.adicionarAAssistidos(filme2);
        biblioteca.imprimirAssistidos();
        
        // Adicionando filmes à lista 'Quero Assistir'
        biblioteca.adicionarAQueroAssistir(filme3);
        biblioteca.imprimirQueroAssistir();

        // Adicionando filmes à lista 'Não Quero Assistir'
        biblioteca.adicionarANaoQueroAssistir(filme4);
        biblioteca.imprimirNaoQueroAssistir();

        System.out.println();
    }
}
