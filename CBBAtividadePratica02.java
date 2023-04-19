class TesteIgualdade2 {
    void teste() {
        String frase3;
        String frase4;

        frase3 = new String("Testando a igualdade");
        frase4 = frase3;

        System.out.println("Frase 3: " + frase3);
        System.out.println("Frase 4: " + frase4);
        System.out.println("Frase 3 e Frasse 4 são igauis? R: " + (frase3 == frase4));
    }
}

public class CBBAtividadePratica02 {
    public static void main(String[] args) {
        TesteIgualdade2 teste = new TesteIgualdade2();
        teste.teste();
    }
}
