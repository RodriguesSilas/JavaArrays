public class HelloWorld{
         public static void main(String []args){
         
        Cliente[] clientes = new Cliente[10];
       for(int i = 0; i<clientes.length; i++){
           clientes[i] = new Cliente();
           clientes[i].nome = "Joao";
       }
       
       for(Cliente c : clientes){
           System.out.println(c.nome);
       }
       
       Cliente clientes2[] = new Cliente[5];
       clientes2[0] = new Cliente();
       clientes2[1] = new ClienteEspecial();
       
       Cliente jose = new Cliente();
       jose.nome = "Jose";
       
       clientes2[0] = jose;
       
       System.out.println(jose.nome);
       System.out.println(clientes2[0].nome);
      
       
       jose.nome = "Pedro";
       
       System.out.println(jose.nome);
       System.out.println(clientes2[0].nome);
       

     }
}

class Cliente {
    String nome;
}

class ClienteEspecial extends Cliente{}