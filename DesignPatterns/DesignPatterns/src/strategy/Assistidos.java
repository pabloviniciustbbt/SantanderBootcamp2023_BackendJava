package strategy;

public class Assistidos implements GerenciamentoDeFilmes {

    @Override
    public void manipularFilme(Filme filme) {
        System.out.println("\nMarcando " + filme.getTitulo() + ", " + filme.getDiretor() + ", " + filme.getAnoLancamento() + " como 'Assistidos'");
    }
    
}
