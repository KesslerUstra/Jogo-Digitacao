package jogo_escrita;

import java.util.Scanner;

public class LogicaDoJogo implements Jogo{
	private long keystrokesCorretas;
	private long keystrokesIncorretas;
	private long palavrasCorretas;
	private long palavrasIncorretas;
	Scanner palavraNova = new Scanner(System.in);
	
	public static final int QUANTIDADE_KEYSTROKES = 5;
	public static final int TEMPO_JOGO = 60;
	
	Temporizador duracao = new Temporizador();
	
	public LogicaDoJogo() {
		duracao.setTempo(TEMPO_JOGO);
	}

	public String lerPalavraDigitada() {
		return palavraNova.next();
	}
	
	public void imprimirResultados() {
		int wpm;
		wpm = (int) (keystrokesCorretas/QUANTIDADE_KEYSTROKES);
		System.out.println("_________Resultado Final_________\nWPM: "+wpm+"\nKeystrokes Corretas: "
		+keystrokesCorretas+"\nKeystrokes Icorretas: "+keystrokesIncorretas+"\nPalavras Corretas: "+
				palavrasCorretas+"\nPalavras Incorretas: "+palavrasIncorretas);
	}

	@Override
	public void jogar() {
		duracao.comecar();
		String palavrinha;
		String palavrona;
		while(duracao.jogoAtivo()) {
			System.out.println(duracao.tempoRestante());
			System.out.println();
			duracao.comecoPalavra();
			palavrona = Palavras_Aleatorias.palavraAleatoria();
			System.out.println(palavrona);
			palavrinha = lerPalavraDigitada();
			if(palavrinha.equals(palavrona) ) {
				palavrasCorretas = palavrasCorretas +1;
				keystrokesCorretas = keystrokesCorretas + palavrinha.length();
				}else {
				palavrasIncorretas = palavrasIncorretas +1;
				keystrokesIncorretas = keystrokesIncorretas + palavrinha.length();
			}
			duracao.terminoPalavra();
			
		}
		imprimirResultados();
	}
	
}
