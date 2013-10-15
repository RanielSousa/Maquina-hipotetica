package bc.com.mh.Arquitetura;
import javax.swing.JOptionPane;
public class Start extends Automato {

	/**
	 * @author RANIEL SOUSA 
	 * @param args
	 */
public static void main(String[] args) {
	Automato a = new Automato();
	
	ESTADOINICIAL= Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o OPCODE"));  

				 /**
				  * IF PARA O MENU DE OPCOES  
				   */ 
				if( ESTADOINICIAL == 1){
					  a.memoria();
					  JOptionPane.showMessageDialog(null, ESTADOINICIAL+ reg+ESTADOASSECOMEMORIA1+"\n"
								+ ESTADOINICIAL+" "+"Esse opcode busca o valor do endereco: \n" + ESTADOASSECOMEMORIA1+"  "+" e armazena no Registrador: " + " "+reg);
										
				}
				 if( ESTADOINICIAL == 2){
					 a.registrador();
					 JOptionPane.showMessageDialog(null, ESTADOINICIAL+ reg+ESTADOASSECOMEMORIA2+"\n"
					+ ESTADOINICIAL+" "+"Esse opcode carrega o valor:  \n" + ESTADOASSECOMEMORIA2+"  "
				    + " e armazena no Registrador: " + " "+reg);
				
				 }

				 if ( ESTADOINICIAL == 3 ){
					 a.memoria();
					 JOptionPane.showMessageDialog(null, ESTADOINICIAL+ reg+ESTADOASSECOMEMORIA1+"\n"
					+ ESTADOINICIAL+" "+"Esse opcode armazena o valor do registrador:\n" + reg+"  "
				    +"  no endereco de memoria: " + " "+ESTADOASSECOMEMORIA1);
									
				 }
				  if( ESTADOINICIAL == 4){
						ESTADOASSECOMEMORIA4 = JOptionPane.showInputDialog(null,"Informe  o  registrador  que esta o valor a ser copiado  ");
				 		reg = JOptionPane.showInputDialog(null,"Informe  o  registrador que ira receber o valor:");
				 		JOptionPane.showMessageDialog(null, ESTADOINICIAL+ "0"+ ESTADOASSECOMEMORIA4+reg+"\n"
						+ ESTADOINICIAL+" "+"Esse opecode efetua a copia do registrador: \n" + ESTADOASSECOMEMORIA4+"  "
				 		+"  para o registrador: " + " "+reg);
									
				  }
		         if (ESTADOINICIAL == 5){
		        	 ESTADOASSECOMEMORIA3 = JOptionPane.showInputDialog(null,"informe  o  registrador que ira receber o valor da soma    ");
		        	 ESTADOASSECOMEMORIA4 = JOptionPane.showInputDialog(null,"informe  o  primeiro  registrador a ser somado    ");
		        	 
				 		reg = JOptionPane.showInputDialog(null,"Informe  o  segundo registrador a ser somado ");
				 		JOptionPane.showMessageDialog(null, ESTADOINICIAL+ ESTADOASSECOMEMORIA3+ ESTADOASSECOMEMORIA4+reg+"\n"
						+ ESTADOINICIAL+" "+"Esse opcode efetua a  soma, dos padrões de bits dos registradores \n" + ESTADOASSECOMEMORIA4+"  "
				 		 + "e "+reg +""+" em complemento de dois, e coloca  no registrador"+" "+ESTADOASSECOMEMORIA3);
		         } 
		         if (ESTADOINICIAL == 6){
		        	
		        	 ESTADOASSECOMEMORIA3 = JOptionPane.showInputDialog(null,"informe  o  registrador que ira receber o valor da soma    ");
		        	 ESTADOASSECOMEMORIA4 = JOptionPane.showInputDialog(null,"informe  o  primeiro  registrador a ser somado    ");
		        	 reg = JOptionPane.showInputDialog(null,"informe  o  segundo registrador a ser somado ");
				 		JOptionPane.showMessageDialog(null, ESTADOINICIAL+ ESTADOASSECOMEMORIA3+ ESTADOASSECOMEMORIA4+reg+"\n"
						+ ESTADOINICIAL+" "+"Esse opecode efetua a  soma, dos padrões de bits dos registradores \n" + ESTADOASSECOMEMORIA4+"  "
				 		 + "e "+reg +""+"  em notação de vírgula flutuante (ponto flutuante)e coloca  no registrador"+" "
						 +ESTADOASSECOMEMORIA3);
		         if (ESTADOINICIAL == 7){
		        	
		        	 ESTADOASSECOMEMORIA3 = JOptionPane.showInputDialog(null,"informe  o  registrador que ira receber o valor    ");
		        	 ESTADOASSECOMEMORIA4 = JOptionPane.showInputDialog(null,"informe  o  primeiro  registrador   ");
		     		reg = JOptionPane.showInputDialog(null,"informe  o  segundo registrador a ser  ");
				 		JOptionPane.showMessageDialog(null, ESTADOINICIAL+ ESTADOASSECOMEMORIA3+ ESTADOASSECOMEMORIA4+reg+"\n"
						+ ESTADOINICIAL+" "+"Esse opecode efetua a  soma, dos padrões de bits dos registradores \n" + ESTADOASSECOMEMORIA4+"  "
				 		 + "e "+reg +""+"  executa a operação lógica OR e coloca  no registrador"+" "
						 +ESTADOASSECOMEMORIA3);
			 
		         }
		         if (ESTADOINICIAL == 8){
		        	 ESTADOASSECOMEMORIA3 = JOptionPane.showInputDialog(null,"informe  o  registrador que ira receber o valor    ");
		        	 ESTADOASSECOMEMORIA4 = JOptionPane.showInputDialog(null,"informe  o  primeiro  registrador   ");
		     		reg = JOptionPane.showInputDialog(null,"informe  o  segundo registrador a ser  ");
				 		JOptionPane.showMessageDialog(null, ESTADOINICIAL+ ESTADOASSECOMEMORIA3+ ESTADOASSECOMEMORIA4+reg+"\n"
						+ ESTADOINICIAL+" "+"Esse opecode efetua a  soma, dos padrões de bits dos registradores \n" + ESTADOASSECOMEMORIA4+"  "
				 		 + "e "+reg +""+"  executa a operação lógica AND e coloca  no registrador"+" "
						 +ESTADOASSECOMEMORIA3);
		        	 
			 
		          }
		         if (ESTADOINICIAL == 9){
		        	 ESTADOASSECOMEMORIA3 = JOptionPane.showInputDialog(null,"informe  o  registrador que ira receber o valor    ");
		        	 ESTADOASSECOMEMORIA4 = JOptionPane.showInputDialog(null,"informe  o  primeiro  registrador   ");
		     		reg = JOptionPane.showInputDialog(null,"informe  o  segundo registrador a ser  ");
				 		JOptionPane.showMessageDialog(null, ESTADOINICIAL+ ESTADOASSECOMEMORIA3+ ESTADOASSECOMEMORIA4+reg+"\n"
						+ ESTADOINICIAL+" "+"Esse opecode efetua a  soma, dos padrões de bits dos registradores \n" + ESTADOASSECOMEMORIA4+"  "
				 		 + "e "+reg +""+"  executa a operação de OU EXCLUSIVOe coloca  no registrador"+" " +ESTADOASSECOMEMORIA3);
			 
		         }
		         /**
		          *  SO FIZ ATE O NOVE PORQQUE  TEREI  QUER FAZER A COM STRING PARA RECEBER "A", "B" e " C"
		          * 
		          * */
	
		         }
			}
}

		 

	


