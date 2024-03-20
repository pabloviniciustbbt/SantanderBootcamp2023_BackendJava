package strategy;

public class BibliotecaDeFilmes {

    private GerenciamentoDeFilmes gerenciamento;
    
    public void setGerenciamento(GerenciamentoDeFilmes gerenciamento){
        this.gerenciamento = gerenciamento;
    }

    public void executarGerenciamento(Filme filme){
        gerenciamento.manipularFilme(filme);
    }
}