package jogo_escrita;

import java.util.Random;

public class Palavras_Aleatorias {
	public static String palavraAleatoria() {
		String[] lista = new String[] {
				"empresa", "candidato", "mundo", "pessoas", "partir", "ou", "final"
				 , "Fernando", "disse", "parte", "candidato", "vai", "tr�s", "esta",
				 "Jos�", "pessoas", "programa", "primeira", "sul", "das", "muito", 
				 "ser�", "antes", "real", "menos", "nos", "local", "vida", "brasileira",
				 "Paulo", "seus", "ser�", "porque", "lei", "reportagem", "jogo", "entre",
				 "nada", "faz", "seu", "outra", "casa", "governo", "mil", "aos", "eles", 
				 "isso", "cada", "mas", "duas", "que", "de", "contra", "seja", "sempre",
				 "mesmo", "pouco", "aos", "maior", "mesmo", "sua", "banco", "dos", "mundo",
				 "pa�s", "pa�s", "est�", "quatro", "pela", "j�", "empresas", "parte", "est�",
				 "em", "cerca", "t�m", "equipe", "primeiro", "tinha", "s�", "no",
				 "empresas", "ser", "Carlos", "ao", "bem", "das", "se", "estava", 
				 "e", "sempre", "afirmou", "qualquer", "ontem", "forma", "a", "isso", 
				 "essa", "cotidiano", "outra", "sua", "cidade", "as", "e", "assim", 
				 "sem", "vez", "nacional", "tinha", "ainda", "qual", "foi", "das", 
				 "essa", "dos", "essa", "tempo", "entre", "forma", "vida", "milh�es",
				 "primeira", "sistema", "porque", "processo", "pode", "eles", "m�s",
				 "s�", "novo", "por", "uma", "mil", "processo", "cidade", "duas",
				 "desde", "�s", "ap�s", "disse", "da", "dias", "editoria", "podem", 
				 "vez", "tinha", "dia", "com", "entre", "nova", "segundo", "apenas",
				 "como", "esta", "as", "deve", "por", "�s", "para", "editoria", "�", 
				 "plano", "nacional", "governo", "com", "na", "mercado", "outro",
				 "partir", "onde", "ter", "afirmou", "voc�", "milh�es", "esporte", 
				 "assim", "sobre", "dos", "tempo", "durante", "�", "ano", "contra",
				 "mesmo", "se", "bem", "foram", "que", "rio", "presidente", "j�", 
				 "nova", "qual", "antes", "todo", "desde", "est�", "ontem", "pol�cia",
				 "dia", "estava", "Brasil", "pouco", "pre�os", "da", "voc�", "isso",
				 "mais", "hoje", "quem", "onde", "al�m", "ter", "especial", "do", "t�m",
				 "outra", "uma", "alguns", "no", "s�o", "exemplo", "onde", "mundo", 
				 "n�mero", "casa", "pre�os", "dias", "n�mero", "caso", "pelos", 
				 "cotidiano", "tr�s", "esse", "pelo", "sul", "foram", "Paulo", 
				 "um", "depois", "qualquer", "�", "nada", "trabalho", "pessoas",
				 "folha", "ele", "eu", "ap�s", "maior", "seus", "apenas", "no", 
				 "agora", "lei", "Brasil", "grupo", "suas", "nos", "trabalho", 
				 "exemplo", "sobre", "Fernando", "hoje", "ele", "deve", "eu", 
				 "aos", "sua", "dois", "esse", "t�m", "tudo", "diz", "at�", "uma",
				 "a", "folha", "p�gina", "com", "e", "desde", "programa", "me", 
				 "do", "fazer", "pelo", "para", "quando", "porque", "ser�", "tem",
				 "agora", "estado", "s�", "grande", "presidente", "diz", "m�s", "depois",
				 "final", "muito", "tamb�m", "os", "real", "cada", "�", "exemplo", 
				 "suas", "assim", "suas", "n�mero", "melhor", "governo", 
				 "dinheiro", "era", "e" };
	        Random aleatorio = new Random();
	        int palavraAleatoria = aleatorio.nextInt(lista.length);
	        String palavrasAleatorias = lista[palavraAleatoria];
	        return palavrasAleatorias;
	}
}
