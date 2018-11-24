import java.util.ArrayList;
import java.util.Iterator;
public class HelloWorld{

     public static void main(String []args){
        
       ArrayList<String> nomes = new ArrayList<>();
       
       nomes.add("Java");
       nomes.add("Ruby");
       nomes.add("Php");
       nomes.add("JavaScript");
       
       Iterator<String> it = nomes.iterator(); /*Objeto que percorre toda coleção*/
       
       while(it.hasNext()){
           String atual = it.next();
           System.out.println(atual);
           //it.remove(); /*Remove o elemento atual*/
       }
       System.out.println(nomes.size());
       
       for(String nome : nomes){
           System.out.println(nome);
       }
       
       Cliente joao = new Cliente();
       joao.nome = "Joao";
       
       ArrayList<Cliente> clientes = new ArrayList<>();
       
       clientes.add(joao);
       
       System.out.printn(joao.nome);
       System.out.printn(clientes.get(0).nome);
    
       joao.nome = "Jose";
       
       System.out.printn(joao.nome);
       System.out.printn(clientes.get(0).nome);
       
    
}
}
