package br.com.mh.MaquinaEstado;


import java.awt.Image;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;


public class LerArquivo {


public static void main(String[] args)throws IOException , InterruptedException {
	int Estado = 0;
  
	String Arquivo = "C:\\Users\\Wena Barreto\\workspace\\MaquinaHipotetica\\src\\br\\com\\mh\\MaquinaEstado\\Arquivo.txt";
  InputStream is = new FileInputStream(Arquivo);
  InputStreamReader isr = new InputStreamReader(is);
  BufferedReader br = new BufferedReader(isr);
  String imprimir = br.readLine();
  
  while(imprimir != null){
	  char simbolo = ' ';
			  
	  for (int i = 0; i < imprimir.length(); i++) {
		 simbolo = imprimir.charAt(i);
		 System.out.print(simbolo +  "  ");
		
		
	}
	
 Estado = (Estado +1);
 if (Estado == 4) {
	 Estado = 0;
	 Estado = (Estado +1);
	
}
 
	  System.out.println(imprimir+ "  " + "Estado " + Estado );
 Thread.sleep( 1 * 1000 );
imprimir = br.readLine();

	

}
}
}

