package org.lessons.java.christmas;

import java.util.Comparator;

public class Regalo implements Comparator<Regalo> {
	private String nome;
	private String destinatario;
	public Regalo(String nome, String destinatario) {
		setNome(nome);
		setDestinatario(destinatario);
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDestinatario() {
		return destinatario;
	}
	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}
	
	public int compare(Regalo o1,Regalo o2) {
		
		return o1.nome.compareTo(o2.destinatario);
	}
	
	@Override
	public String toString() {
		return "Regalo [nome=" + nome + ", destinatario=" + destinatario + "]";
	}
}
