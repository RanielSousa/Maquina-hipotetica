import java.io.BufferedReader;  
	import java.io.FileReader;  
	import java.io.RandomAccessFile;  
	import java.util.StringTokenizer; 
public class teste {
  
	    public void arquivo() {  
	        String linha = null;  
	        try {  
	            // instancia do arquivo que vou ler  
	            FileReader reader = new FileReader("C:\\Users\\RANIEL\\Desktop\\teste.txt");  
	            BufferedReader leitor = new BufferedReader(reader);  
	  
	            // loop que percorrerá todas as  linhas do arquivo.txt que eu quero ler  
	            while ((linha = leitor.readLine()) != null) {  
	                      //No metodo StringTokenizer passo os parametros que quero ler, em seguida o que eu quero descartar no meu caso ( - ) e ( ; ).   
	                StringTokenizer st = new StringTokenizer(linha, "-;" );  
	                    // Aqui determino que enquanto existir tokens que ele faça a leitura  
	                String dados = st.nextToken();  
	                  
	                                System.out.print(dados);  
	                System.out.println("");  
	            }  
	  
	            leitor.close();  
	            reader.close();  
	  
	        } catch (Exception e) {  
	            e.printStackTrace();  
	  
	        }  
	    }  
	  
	    public static void main(String[] args) {  
	       teste t = new teste();  
	        t.arquivo();  
	    }  
	}  
