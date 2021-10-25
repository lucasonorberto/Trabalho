package br.edu.univas;
import java.util.ArrayList;

public class Dicionario {

        private ArrayList <String> palavrasIngles;
	    private ArrayList <String> palavrasPortugues;
	    
	    
	    public Dicionario()
	    {
	        palavrasIngles    = new ArrayList<String>();
	        palavrasPortugues = new ArrayList<String>();
	    }
	    
	    public void preencheDicionario(String palavraPort, String palavraIng)
	    {
	        palavrasPortugues.add (palavraPort);
	        palavrasIngles.add (palavraIng);      
	    }
	    
	    public ArrayList<String> getArrayPalavrasIng() 
	    {
	        return palavrasIngles;
	    }
	    
	    public ArrayList<String> getArrayPalavrasPort()
	    {
	        return palavrasPortugues;
	    }

	    public String traduzIngles_Portugues(String palavra)
	{
	    String traducao = "Palavra não encontrado no diconário";
	    Dicionario dicio = new Dicionario();
	    ArrayList <String> palavrasIng  = dicio.getArrayPalavrasIng();
	    ArrayList <String> palavrasPort = dicio.getArrayPalavrasPort();
	    
	    for (int i = 0; i < palavrasIng.size(); i++) 
	    {  
	        if( palavrasIng.get(i).equals(palavra))
	        {
	          int indice = i;
	          i = palavrasIng.size();
	          traducao = palavrasPort.get(indice);
	        }
	    }
	  System.out.println(traducao);
	  return traducao;
	}
}
