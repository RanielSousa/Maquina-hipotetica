
package com.br.MH;
// importação das classes
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;


public class LerArquivo {
	//estaciação da classe File e Buff	
	FileReader FileR;
	BufferedReader BuffR;
	// metodo contrutor 
	public LerArquivo(){
	
		// execão de caracterios 
		try {
			//estaciação 
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
		 
		 //exeção
		 catch (FileNotFoundException e) {
		
			
		}
		
		///exeção 
		catch(IOException ex){
			
		}
		
	}

}


