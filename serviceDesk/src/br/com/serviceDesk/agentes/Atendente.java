package br.com.serviceDesk.agentes;

import br.com.serviceDesk.agentesInterface.GerenciarAtendente;

public class Atendente extends Pessoa implements GerenciarAtendente {
	
	private String loginServiceDesk;
	private String senhaServiceDesk;
	private int idAtendente;
	
	public String getLoginServiceDesk() {
		return loginServiceDesk;
	}
	public void setLoginServiceDesk(String loginServiceDesk) {
		this.loginServiceDesk = loginServiceDesk;
	}
	public String getSenhaServiceDesk() {
		return senhaServiceDesk;
	}
	public void setSenhaServiceDesk(String senhaServiceDesk) {
		this.senhaServiceDesk = senhaServiceDesk;
	}
	public int getIdAtendente() {
		return idAtendente;
	}
	public void setIdAtendente(int idAtendente) {
		this.idAtendente = idAtendente;
	}
	
	@Override
	public void abreOs() {
		
		
	}
	@Override
	public void fazAniversario() {
		// TODO Auto-generated method stub
		
	}
	
}
