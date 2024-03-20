package strategy;

public class NaoQueroVer implements GerenciamentoDeFilmes {

    @Override
    public void manipularFilme(Filme filme) {
        System.out.println("\nAdicionando " + filme.getTitulo() + ", " + filme.getDiretor() + ", " + filme.getAnoLancamento() + " à lista 'Não Quero Ver'");
    }
    
}
