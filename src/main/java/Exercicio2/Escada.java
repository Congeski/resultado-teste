package Exercicio2;

public class Escada {
    public void printEscada(int n){
        System.out.println(geraEscada(n));
    }
    public String geraEscada(int n){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<n;i++){
            sb.append(geraDegrau(i, n));
            sb.append('\n');
        }
        return sb.toString();
    }

    public String geraDegrau(int i, int n){
        StringBuilder sb = new StringBuilder();
        i++;
        for(int j = 0;j<n-i; j++ ) {
            sb.append(" ");
        }
        for(int j = 0;j<i; j++ ) {
            sb.append("#");
        }

        return sb.toString();
    }
}
