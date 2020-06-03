package jogo_escrita;

import java.util.Random;

public class Palavras_Aleatorias {
	public static String palavraAleatoria() {
		String[] lista = new String[] {
				"empresa", "candidato", "mundo", "pessoas", "partir", "ou", "final"
				 , "Fernando", "disse", "parte", "candidato", "vai", "três", "esta",
				 "José", "pessoas", "programa", "primeira", "sul", "das", "muito", 
				 "será", "antes", "real", "menos", "nos", "local", "vida", "brasileira",
				 "Paulo", "seus", "será", "porque", "lei", "reportagem", "jogo", "entre",
				 "nada", "faz", "seu", "outra", "casa", "governo", "mil", "aos", "eles", 
				 "isso", "cada", "mas", "duas", "que", "de", "contra", "seja", "sempre",
				 "mesmo", "pouco", "aos", "maior", "mesmo", "sua", "banco", "dos", "mundo",
				 "país", "país", "está", "quatro", "pela", "já", "empresas", "parte", "está",
				 "em", "cerca", "têm", "equipe", "primeiro", "tinha", "só", "no",
				 "empresas", "ser", "Carlos", "ao", "bem", "das", "se", "estava", 
				 "e", "sempre", "afirmou", "qualquer", "ontem", "forma", "a", "isso", 
				 "essa", "cotidiano", "outra", "sua", "cidade", "as", "e", "assim", 
				 "sem", "vez", "nacional", "tinha", "ainda", "qual", "foi", "das", 
				 "essa", "dos", "essa", "tempo", "entre", "forma", "vida", "milhões",
				 "primeira", "sistema", "porque", "processo", "pode", "eles", "mês",
				 "só", "novo", "por", "uma", "mil", "processo", "cidade", "duas",
				 "desde", "às", "após", "disse", "da", "dias", "editoria", "podem", 
				 "vez", "tinha", "dia", "com", "entre", "nova", "segundo", "apenas",
				 "como", "esta", "as", "deve", "por", "às", "para", "editoria", "à", 
				 "plano", "nacional", "governo", "com", "na", "mercado", "outro",
				 "partir", "onde", "ter", "afirmou", "você", "milhões", "esporte", 
				 "assim", "sobre", "dos", "tempo", "durante", "à", "ano", "contra",
				 "mesmo", "se", "bem", "foram", "que", "rio", "presidente", "já", 
				 "nova", "qual", "antes", "todo", "desde", "está", "ontem", "polícia",
				 "dia", "estava", "Brasil", "pouco", "preços", "da", "você", "isso",
				 "mais", "hoje", "quem", "onde", "além", "ter", "especial", "do", "têm",
				 "outra", "uma", "alguns", "no", "são", "exemplo", "onde", "mundo", 
				 "número", "casa", "preços", "dias", "número", "caso", "pelos", 
				 "cotidiano", "três", "esse", "pelo", "sul", "foram", "Paulo", 
				 "um", "depois", "qualquer", "é", "nada", "trabalho", "pessoas",
				 "folha", "ele", "eu", "após", "maior", "seus", "apenas", "no", 
				 "agora", "lei", "Brasil", "grupo", "suas", "nos", "trabalho", 
				 "exemplo", "sobre", "Fernando", "hoje", "ele", "deve", "eu", 
				 "aos", "sua", "dois", "esse", "têm", "tudo", "diz", "até", "uma",
				 "a", "folha", "página", "com", "e", "desde", "programa", "me", 
				 "do", "fazer", "pelo", "para", "quando", "porque", "será", "tem",
				 "agora", "estado", "só", "grande", "presidente", "diz", "mês", "depois",
				 "final", "muito", "também", "os", "real", "cada", "à", "exemplo", 
				 "suas", "assim", "suas", "número", "melhor", "governo", 
				 "dinheiro", "era", "e" };
	        Random aleatorio = new Random();
	        int palavraAleatoria = aleatorio.nextInt(lista.length);
	        String palavrasAleatorias = lista[palavraAleatoria];
	        return palavrasAleatorias;
	}
}
