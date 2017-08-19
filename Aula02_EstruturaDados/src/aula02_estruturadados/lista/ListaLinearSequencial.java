package aula02_estruturadados.lista;

public class ListaLinearSequencial {
    
    
    private int [] vetor;
    private int tamanho;
    
    
    public ListaLinearSequencial(int capacidade){
        this.vetor = new int[capacidade];
        this.tamanho = 0;
    }
    
    public int tamanhoVetor(){
        return this.tamanho;
    }
    
    public boolean adicionar(int valor){
        
        if(this.tamanho < this.vetor.length){
            vetor[this.tamanho] = valor;
            this.tamanho++;
            return true;
        }
        return false;
    }
    
    public boolean adicionar(int valor, int posicao) {
        // verificando se o vetor possui espaço
        if(!(posicao >= 0 && posicao < tamanho)){
            throw new IllegalArgumentException("Posicao Inválida");
        }
        
        // movendo elementos
        for(int i = this.tamanho-1; i>=posicao; i++){
            this.vetor[i+1] = this.vetor[i];
            }
            this.vetor[posicao] = valor;
            this.tamanho++;

        return true;
    }
    
    
    public int busca(int valor){
        for (int i=0; i<this.tamanho; i++){
                if (this.vetor[i] == valor){
                        return i;
                }
        }
        return -1;
    }
    
    public String toString() {	
        StringBuilder s = new StringBuilder();
        s.append("[");

        for (int i=0; i<this.tamanho-1; i++){
                s.append(this.vetor[i]);
                s.append(", ");
        }

        if (this.tamanho>0){
                s.append(this.vetor[this.tamanho-1]);
        }

        s.append("]");

        return s.toString();
    }
    
    public boolean remove(int valor){
        int posicao = busca(valor);
        
        if(posicao > 0){
            for (int i=posicao; i<this.tamanho-1; i++){
                        this.vetor[i] = this.vetor[i+1];
            }
            this.tamanho--; 
            return true;
        }
        return false;
    }
}

