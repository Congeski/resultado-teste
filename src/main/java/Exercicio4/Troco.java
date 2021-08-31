package Exercicio4;

public class Troco {
    private static int[] notas = new int[]{
            100, 50, 20, 10, 5, 2
    };
    private int[] quantidadeNotas;


    public int[] getQuantidadeNotas() {
        return quantidadeNotas;
    }

    public void setQuantidadeNotas(int[] quantidadeNotas) {
        this.quantidadeNotas = quantidadeNotas;
    }

    public void clean(){
        quantidadeNotas = new int[notas.length];
    }

    public Troco() {
        quantidadeNotas = new int[notas.length];
    }

    public void calculaNota( int valor){
        calculaNota(0, valor);
    }

    private void calculaNota(int posNota, int valor){
        if(posNota>=notas.length)
            return;

        quantidadeNotas[posNota] = valor/notas[posNota];
        calculaNota(posNota+1, valor%notas[posNota]);
    }
}
