package bc.com.mh.Arquitetura;



import javax.swing.JOptionPane;



public class Automato {
  
  public static int     ESTADOINICIAL;
  public static String  ESTADOASSECOMEMORIA1;
  public static String  ESTADOASSECOMEMORIA2;
  public static String  ESTADOASSECOMEMORIA3;
  public static String  ESTADOASSECOMEMORIA4;
  public static String  reg = "";
 
  	public  void memoria () {
  		
  		reg= JOptionPane.showInputDialog(null,"Infome o Registrador: ");
		ESTADOASSECOMEMORIA1 = JOptionPane.showInputDialog(null,"Informe o endereço de memoria ");
		
	}
  	
  	public void registrador (){
  		reg = JOptionPane.showInputDialog(null,"Infome o Registrador: ");
  		ESTADOASSECOMEMORIA2 = JOptionPane.showInputDialog(null," Informe o valor a ser amazenado ");
  		
  	}
  	
  	 public void operação (){
 	
  		  
  		 
  	 }

	

	

}
