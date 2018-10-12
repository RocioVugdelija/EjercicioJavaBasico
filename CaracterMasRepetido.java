
import java.util.Scanner;

public class CaracterMasRepetido {

	public static void main(String[] args) {

	    Scanner in = new Scanner(System.in);
	    String frase = "";
	    char [] letras;

	    int maxRepe = 0;
	    char letRepeMax = 0;

	    System.out.println("Escribe un texto o frase: ");

	    frase = in.nextLine();
	    letras = frase.toCharArray();

	    for(int i=0; i<letras.length; i++){

	        char letraAct = letras[i];
	        int cont = 0;

	        for (int j =0; j<letras.length; j++){
	            if (letras[j] == letraAct)
	                cont++;
	        }

	        if(maxRepe < cont)
	        {
	            maxRepe = cont;
	            letRepeMax = letraAct;
	        }
	    }
	    System.out.println(letRepeMax+": Se repite "+maxRepe); 
	    in.close();
	}
	
	
	
}

