package aula02_estruturadados;
import aula02_estruturadados.lista.ListaLinearSequencial;

public class Aula02_EstruturaDados {


    public static void main(String[] args) {
        
        ListaLinearSequencial v1 = new ListaLinearSequencial(2);
         
        v1.adicionar(1);
        System.out.println("Tamanho vetor " + v1.tamanhoVetor());
        v1.adicionar(2);
        System.out.println("Tamanho vetor " + v1.tamanhoVetor());
        v1.adicionar(5);
        v1.adicionar(8);
        
        //System.out.println("Tamanho vetor " + v1.tamanhoVetor());
        
        //v1.adicionar(1,1);        
        
        //System.out.println("Localizando vetor " + v1.busca(2));
        //System.out.println(v1);
        
        
        //System.out.println(v1.remove(5));
        //System.out.println(v1);
        
    }
    
}
