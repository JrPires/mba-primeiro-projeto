package br.com.serviceDesk.agentes;

import br.com.serviceDesk.agentesInterface.GerenciarTecnico;

public class Tecnico extends Pessoa implements GerenciarTecnico{
	
	private String registroAtendimento;
	private Atendente atendimento;
	
	public String getRegistroAtendimento() {
		return registroAtendimento;
	}
	public void setRegistroAtendimento(String registroAtendimento) {
		this.registroAtendimento = registroAtendimento;
	}
	public Atendente getAtendimento() {
		return atendimento;
	}
	public void setAtendimento(Atendente atendimento) {
		this.atendimento = atendimento;
	}
	
	@Override
	public void atenderChamada() {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void fazAniversario() {
		// TODO Auto-generated method stub
		
	}
}
