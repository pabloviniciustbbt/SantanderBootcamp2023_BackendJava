package singleton;

import java.util.ArrayList;
import java.util.List;

public class BibliotecaDeFilmes {

    private static BibliotecaDeFilmes instancia;
    private List<Filme> queroAssitir;
    private List<Filme> assistidos;
    private List<Filme> naoQueroAssistir;

    private BibliotecaDeFilmes(){
        queroAssitir = new ArrayList<>();
        assistidos = new ArrayList<>();
        naoQueroAssistir = new ArrayList<>();
    }

    public static synchronized BibliotecaDeFilmes getInstancia(){
        if (instancia == null) {
            instancia = new BibliotecaDeFilmes();
        }
        return instancia;
    }

    public void adicionarAQueroAssistir(Filme filme) {
        queroAssitir.add(filme);
    }
    
    public void adicionarAAssistidos(Filme filme) {
        assistidos.add(filme);
    }

    public void adicionarANaoQueroAssistir(Filme filme) {
        naoQueroAssistir.add(filme);
    }

    public void removerDeQueroAssistir(Filme filme){
        queroAssitir.remove(filme);
    }

    public void removerDeAssistido(Filme filme){
        assistidos.remove(filme);
    }

    public void removerDeNaoQueroAssistir(Filme filme){
        naoQueroAssistir.remove(filme);
    }

    public Filme buscarEmQueroAssistir(String titulo){
        return queroAssitir.stream()
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
        for (Filme filme : queroAssitir) {
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
