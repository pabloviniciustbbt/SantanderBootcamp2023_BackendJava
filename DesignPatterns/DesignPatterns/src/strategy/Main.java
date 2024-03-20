package strategy;

public class Main {
    
    public static void main(String[] args) {
        
        //Criação lista de filmes
        Filme filme1 = new Filme("Star Wars", "George Lucas", 1977);
        Filme filme2 = new Filme("Arrival", "Denis Villeneuve", 2016);
        Filme filme3= new Filme("Ex Machina", "Alex Garland", 2014);
        Filme filme4= new Filme("Eternals", "Chloé Zhao", 2021);

        //Criação da Biblioteca de Filmes
        BibliotecaDeFilmes biblioteca = new BibliotecaDeFilmes();

        System.out.println("-------------------------------");
        System.out.println("    Gerenciamento de Filmes");
        System.out.println("-------------------------------");

         //Marcando filmes como 'Assistidos'
         biblioteca.setGerenciamento(new Assistidos());
         biblioteca.executarGerenciamento(filme1);
         biblioteca.executarGerenciamento(filme2);

         // Adicionando filmes à lista 'Quero Assistir'
         biblioteca.setGerenciamento(new QueroAssistir());
         biblioteca.executarGerenciamento(filme3);

          // Adicionando filmes à lista 'Não Quero Ver'
          biblioteca.setGerenciamento(new NaoQueroVer());
          biblioteca.executarGerenciamento(filme4);

          System.out.println();




    }
}
