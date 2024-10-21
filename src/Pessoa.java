public class Pessoa {
   //criando classes instanciaveis
    String nome;
    String partido;
    int idade;
//criando construtor da classe
    public Pessoa (String nome, String partido, int idade){
        this.nome = nome;
        this.partido = partido;
        this.idade = idade;
    }
//criando getter
    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public String getPartido() {
        return partido;
    }

    //criando setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }
}
