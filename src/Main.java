public class Main {
    public static void main(String[] args) {
        Eleicao eleicao = new Eleicao();
       //criando um novo candidato chamando a classe Candidato
        Candidato canditato01 = new Candidato("Leandro Nascimento","PDT",36,12345,"Vereador");
        Candidato candidato02 = new Candidato("Antonio Jao","PDT",45,4515,"Prefeito");
        eleicao.adicionarCandidato(canditato01);
        eleicao.adicionarCandidato(candidato02);
        eleicao.listarCandidatos();


        }
    }
