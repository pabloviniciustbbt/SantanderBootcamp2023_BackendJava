package Phone;

public interface Telefone {

    
    public void adicionarContato(String nome, int numero);

    public void exibirContato();

    public void realizarChamada(String nome);

    public void atenderChamada(int numero);

	public void desligarChamada();

}
