package Player;

public interface Reprodutor {

    void adicionarMusica(String nome, String artista);

    void selecionarMusica(String nome);
    
    void tocarMusica(String nome);

	void pausarMusica(String nome);

    void pularMusica();

    void antecederMusica();


}
