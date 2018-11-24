import java.util.ArrayList;
public class HelloWorld{

     public static void main(String []args){
        
       ArrayList<String> nomes = new ArrayList<>();
       
       nomes.add("Java");
       nomes.add("Ruby");
       nomes.add("Php");
       nomes.add("JavaScript");
       
       System.out.println(nomes.contains("Java"));
       System.out.println(nomes.contains("C#"));
       
       boolean removido = nomes.remove("Php");
       /* Remove apenas uma ocorrencia do objeto, caso exista dois .add com o mesmo nome, removera apenas o primeiro
       */
       
       System.out.println(removido);
       System.out.println(nomes.contains("Php"));
       
       System.out.println(nomes.size());
       /* Em ArrayList utiliza-se o método size() para ver o tamanho, ao invés de length nos arrays comuns
       */
       nomes.toArray(); /*Converte ArrayList para um Array do tipo Object*/
       
       String[] nomesArray = nomes.toArray(new String[nomes.size()]);
       
       String[] nomesArray2 = nomes.toArray(new String[0]);
       
       ArrayList<String> paises = new ArrayList<>();
       paises.add("Brasil");
       paises.add("Argentina");
       
       ArrayList<String> tudo = new ArrayList<>();
       tudo.addAll(nomes);
       tudo.addAll(paises);
       
       System.out.println(tudo.size());
       
       System.out.println(nomes.get(0));
       nomes.add(0,"Phyton");
       System.out.println(nomes.get(0));
       System.out.println(nomes.get(2));
       
       nomes.remove(0); /*Remove a posição 0 e recompacta todas as posições novamente*/

      nomes.set(0, "JavaScript");
      System.out.println(nomes.get(0)); /*Troca um elemento por outro*/
      
      System.out.println(nomes.indexOf("JavaScript"));
      /*Percorre a lista do inicio ao fim*/
      System.out.println(nomes.lastIndexOf("JavaScript"));
      /*Percorre a lista do fim ao inicio*/
     System.out.println(nomes.indexOf("C++"));
      /*Devolve -1 sempre que um elemento não estiver na lista*/

       
         }

}
