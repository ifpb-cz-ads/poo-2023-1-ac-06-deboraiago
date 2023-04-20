class TesteIgualdade3 {
    void teste() {
        String frase1;
        String frase2;

        frase1 = new String("Testando a igualdade");
        frase2 = new String("Testando a igualdade");

        System.out.println("Frase 1: " + frase1);
        System.out.println("Frase 2: " + frase2);
        System.out.println("O conteúdo da Frase 1 e Frase 2 são iguais? R: " + frase1.equals(frase2));
    }
}

public class CBBAtividadePratica03 {
    public static void main(String[] args) {
        TesteIgualdade3 teste = new TesteIgualdade3();
        teste.teste();
    }
}
