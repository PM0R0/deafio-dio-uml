package model;

/**
 * Classe com o intuido de resolução do desafio proposto do modulo de UML da dio
 * 
 * Implementa as interfaces de AparelhoTelefonico, NavegadorInternet e ReprodutorMusical
 * 
 * @author PM0R0
 */

public class Iphone implements NavegadorInternet, AparelhoTelefonico, ReprodutorMusical{
	
	private final String cor;
	private final String modelo;
	
	public Iphone(String modelo,String cor) {
		this.cor = cor;
		this.modelo = modelo;
	}
	

	public String getCor() {
		return cor;
	}


	public String getModelo() {
		return modelo;
	}


	@Override
	public void reproduzirMusica() {
		System.out.println("Reproduzindo Musica");
		
	}

	@Override
	public void pausarMusica() {
		System.out.println("Pausando Musica");
		
	}

	@Override
	public void avançarMusica() {
		System.out.println("Avançando Musica");
		
	}

	@Override
	public void retrocederMusica() {
		System.out.println("Voltando Musica");
		
	}

	@Override
	public void fazerligação() {
		System.out.println("Fazendo ligação");
		
	}

	@Override
	public void receberligação() {
		System.out.println("Recebendo Ligação");
		
	}

	@Override
	public void enviarMensagem() {
		System.out.println("Enviando Mensagem");
		
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo Mensagem");
		
	}

	@Override
	public void navegarInternet() {
		System.out.println("Acessando Internet");
		
	}

	@Override
	public void abrirPaginaWeb() {
		System.out.println("Abrindo pagina na internet");
		
	}

	@Override
	public void fecharPaginaWeb() {
		System.out.println("Fechando pagina da web");
		
	}

}
