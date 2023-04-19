class RegistraAluno {
    private String nome;
    private String endereco;
    private int idade;
    private double notaMatematica;
    private double notaPortugues;
    private double notaGeografia;

    private static int contadorAluno;

    public String getNome() {
        return nome;
    }

    public void setNome(String temp) {
        nome = temp;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String temp) {
        endereco = temp;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int temp) {
        idade = temp;
    }

    public void setNotaMatematica(double temp) {
        notaMatematica = temp;
    }

    public void setNotaPortugues(double temp) {
        notaPortugues = temp;
    }

    public void setNotaGeografia(double temp) {
        notaGeografia = temp;
    }

    public double getMedia() {
        double resultado = 0;
        resultado = (notaMatematica + notaGeografia + notaPortugues) / 3;
        return resultado;
    }

    public static int getQuantidadeAluno() {
        return contadorAluno;
    }

}

public class CBBAtividadePratica04 {
    public static void main(String[] args) {
        RegistraAluno ana = new RegistraAluno();
        RegistraAluno beto = new RegistraAluno();
        RegistraAluno joao = new RegistraAluno();

        ana.setNome("Ana Betriz");
        beto.setNome("Roberto Brito");
        joao.setNome("João Carvalho");

        ana.setIdade(18);
        ana.setEndereco("Rua dos desenvolvedores, num. 123");

        System.out.println(ana.getNome());
        System.out.println(ana.getIdade());
        System.out.println(ana.getEndereco());
        System.out.println("Contador: " + RegistraAluno.getQuantidadeAluno());
    }
}
