public class BMExercicio2 {
    String nome = "Flamengo";
    int vitorias = 15;
    int derrotas = 4;
    int empates = 2;
    int resultado = 0;

    public void ganhou() {
        vitorias++;
    }

    public void perdeu() {
        derrotas++;
    }

    public void empatou() {
        empates++;
    }

    public void resultado() {
        resultado = vitorias - derrotas - empates;
        System.out.println(resultado);

    }

}