package strategy;

public class QueroAssistir implements GerenciamentoDeFilmes {

    @Override
    public void manipularFilme(Filme filme) {
        System.out.println("\nAdicionando " + filme.getTitulo() + ", " + filme.getDiretor() + ", " + filme.getAnoLancamento() + " à lista 'Quero Assistir'");
    }
    
}
