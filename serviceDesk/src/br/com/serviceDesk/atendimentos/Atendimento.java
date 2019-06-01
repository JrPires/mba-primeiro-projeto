package br.com.serviceDesk.atendimentos;

import java.util.Date;

public class Atendimento {
	
	private String situacao;
	private Date dataRegistro;
	private String historicoAtendimento;
	private OrdemServico ordemServico;
	
	public String getSituacao() {
		return situacao;
	}
	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}
	public Date getDataRegistro() {
		return dataRegistro;
	}
	public void setDataRegistro(Date dataRegistro) {
		this.dataRegistro = dataRegistro;
	}
	public String getHistoricoAtendimento() {
		return historicoAtendimento;
	}
	public void setHistoricoAtendimento(String historicoAtendimento) {
		this.historicoAtendimento = historicoAtendimento;
	}
	public OrdemServico getOrdemServico() {
		return ordemServico;
	}
	public void setOrdemServico(OrdemServico ordemServico) {
		this.ordemServico = ordemServico;
	}

	
}
