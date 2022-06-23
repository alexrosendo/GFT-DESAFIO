package questionThree;

public class Usuarios {
    public static void main(String[] args) {
        Pessoa Mario = new Pessoa();
        Mario.setNome("Mario Fernandes");
        Mario.setEndereco("Rua liz Mayer");
        Mario.setTelefone("(87) 9 - 99999-8888");
        System.out.println(Mario.toString());
    }
}
