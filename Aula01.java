public class MyClassArray {
    public static void main(String args[]) {
        int[] idades = {0,2,4,6,8};
        
        idades[4] = 10;

        System.out.println(idades.length);
        
        for(int i = 0; i<idades.length; i++){
            System.out.println(idades[i]);
        } // for tradicional (permite escrever no array)
        
        for(int idade : idades){
            System.out.println(idade);
        } //foreach (apenas leitura do array)
    }
}
