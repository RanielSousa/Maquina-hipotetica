
package com.br.MH;
// importa��o das classes
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;


public class LerArquivo {
	//estacia��o da classe File e Buff	
	FileReader FileR;
	BufferedReader BuffR;
	// metodo contrutor 
	public LerArquivo(){
	
		// exec�o de caracterios 
		try {
			//estacia��o 
			FileR = new FileReader("C:\\Users\\RANIEL\\workspace\\Maquina Hipotetica\\src\\com\\br\\MH\\Arquivos\\Arquivo Teste.txt");
	        BuffR = new BufferedReader(FileR);
	        // equnto estiver caracterios no aquivo ele vai ler 
	        while( BuffR.ready()){
	        	// imprimir o  arquivo.txt
	        	
	        	JOptionPane.showInternalMessageDialog(null, BuffR.readLine());
	        }
		  
		 // feixamento do BuffR 
		 BuffR.close();
		 
		 
		 } 
		 
		 //exe��o
		 catch (FileNotFoundException e) {
		
			
		}
		
		///exe��o 
		catch(IOException ex){
			
		}
		
	}

}


