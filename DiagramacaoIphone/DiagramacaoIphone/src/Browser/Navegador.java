package Browser;

public interface Navegador{
    
    public void abriSite(String url);

	public void adicionarNovaAba(String url);

	public void atualizarPagina(String url);

	public void fecharPagina(String url);

}
