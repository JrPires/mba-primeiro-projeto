package br.com.serviceDesk.categorias;

public class ItemCategoria extends Categoria{

	private String acaoRealizada;
	private int idItemCategoria;
	
	public String getAcaoRealizada() {
		return acaoRealizada;
	}
	public void setAcaoRealizada(String acaoRealizada) {
		this.acaoRealizada = acaoRealizada;
	}
	public int getIdItemCategoria() {
		return idItemCategoria;
	}
	public void setIdItemCategoria(int idItemCategoria) {
		this.idItemCategoria = idItemCategoria;
	} 
	
}
