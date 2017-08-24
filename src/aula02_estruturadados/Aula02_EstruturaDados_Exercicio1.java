package aula02_estruturadados;
import aula02_estruturadados.lista.Exerc_01_ListaLinearSequencial;
import java.util.ArrayList;
import java.util.List;

public class Aula02_EstruturaDados_Exercicio1 {


    public static void main(String[] args) {
        
        Exerc_01_ListaLinearSequencial v1 = new Exerc_01_ListaLinearSequencial(5);
         
        v1.adicionar(8);
        v1.adicionar(6);
        v1.adicionar(9);
        v1.adicionar(3);
        v1.adicionar(15);
        
        v1.remove(8);
        v1.busca(9);
        System.out.println("Tamanho " + v1.tamanhoVetor());
        System.out.println("Maior valor " + v1.maiorTamanho());
        System.out.println("Menor valor " + v1.menorTamanho());
        
        
        
        v1.adicionar(187);
    }
    
}
