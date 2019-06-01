package br.com.serviceDesk.categorias;

public class SubCategoria extends Categoria{
	
	private String tipoPecaEquipamento;
	private int idSubCategoria;
	
	public String getTipoPecaEquipamento() {
		return tipoPecaEquipamento;
	}
	public void setTipoPecaEquipamento(String tipoPecaEquipamento) {
		this.tipoPecaEquipamento = tipoPecaEquipamento;
	}
	public int getIdSubCategoria() {
		return idSubCategoria;
	}
	public void setIdSubCategoria(int idSubCategoria) {
		this.idSubCategoria = idSubCategoria;
	}
}
