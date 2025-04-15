public class Pessoa {
    String nome;
    int idade;
    String endereco;

    void welcome() {
        System.out.println("Seja bem-vindo " + nome + " você tem " + idade + " anos");
    }

    void endereco() {
        System.out.println("Você mora em " + endereco);
    }

    public static void main(String[] args) {
        Pessoa newPessoa = new Pessoa();

        newPessoa.nome = "Leandro";
        newPessoa.idade = 23;
        newPessoa.endereco = "Fortaleza";

        newPessoa.welcome();
        newPessoa.endereco();
    }
}