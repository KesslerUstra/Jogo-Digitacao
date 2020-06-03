package jogo_escrita;

public class Temporizador {
	private boolean ligado;
	private long tempo;
	private long duracaoPalavra;
	private String tempoRestante;
	
	public Temporizador() {
		
	}
	
	public  boolean  jogoAtivo() {
		if (this.tempo<=1){
			ligado = false;
			
		}else {
			ligado= true;
		}
		return ligado;
	}
	
	public String tempoRestante() {
			this.tempoRestante = "Tempo Restante--- "+ tempo + "s";
		return this.tempoRestante;
	}
	
	public void comecar() {
		System.out.println("Começando o Jogo\nTempo: "+this.tempo);
	}
	
	public void comecoPalavra() {
		duracaoPalavra = System.currentTimeMillis();
	}
	
	public void terminoPalavra() {
		duracaoPalavra =  System.currentTimeMillis()- duracaoPalavra;
		this.tempo = (this.tempo*1000)- duracaoPalavra;
		this.tempo = (this.tempo/1000);
		
	}
	public double tempoQueFalta() {
		return tempo;
	}
	
	public long getTempo() {
		return tempo;
	}


	public void setTempo(long tempo) {
		this.tempo = tempo;
	}
}
