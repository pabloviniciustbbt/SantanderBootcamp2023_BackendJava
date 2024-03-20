package facade;

import java.util.ArrayList;
import java.util.List;

public class BibiliotecaDeFilmes {

    private List<Filme> queroAssistir;
    private List<Filme> assistidos;
    private List<Filme> naoQueroAssistir;

    public BibiliotecaDeFilmes(){
        queroAssistir = new ArrayList<>();
        assistidos = new ArrayList<>();
        naoQueroAssistir = new ArrayList<>();
    }

    public void adicionarAQueroAssistir(Filme filme){
        queroAssistir.add(filme);
    }

    public void adicionarAAssistidos(Filme filme){
        assistidos.add(filme);
    }

    public void adicionarANaoQueroAssistir(Filme filme){
        naoQueroAssistir.add(filme);
    }
    
    public void removerDeQueroAssistir(Filme filme){
        queroAssistir.remove(filme);
    }

    public void removerDeAssistido(Filme filme){
        assistidos.remove(filme);
    }

    public void removerDeNaoQueroAssistir(Filme filme){
        naoQueroAssistir.remove(filme);
    }

    public Filme buscarEmQueroAssistir(String titulo){
        return queroAssistir.stream()
        .filter(filme -> filme.getTitulo().equals(titulo))
        .findFirst()
        .orElse(null);
    }

    public Filme buscarEmAssistidos(String titulo){
        return assistidos.stream()
        .filter(filme -> filme.getTitulo().equals(titulo))
        .findFirst()
        .orElse(null);
    }

    public Filme buscarEmNaoQueroAssistir(String titulo){
        return naoQueroAssistir.stream()
        .filter(filme -> filme.getTitulo().equals(titulo))
        .findFirst()
        .orElse(null);
    }

    public void imprimirQueroAssistir(){
        System.out.println("\nFilmes que quero assistir:");
        for (Filme filme : queroAssistir) {
            System.out.println(filme.getTitulo() + ", " + filme.getDiretor() + ", " + filme.getAnoLancamento());
        }
    }

    public void imprimirAssistidos(){
        System.out.println("\nFilmes assistidos:");
        for (Filme filme : assistidos) {
            System.out.println(filme.getTitulo() + ", " + filme.getDiretor() + ", " + filme.getAnoLancamento());
        }
    }

    public void imprimirNaoQueroAssistir(){
        System.out.println("\nFilmes que não quero assistir:");
        for (Filme filme : naoQueroAssistir) {
            System.out.println(filme.getTitulo() + ", " + filme.getDiretor() + ", " + filme.getAnoLancamento());
        }
    }
}
