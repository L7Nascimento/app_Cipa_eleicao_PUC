import java.util.ArrayList;
public class Eleicao {
    //criando uma Arraylisy para armazenas os candidatos
    private ArrayList<Candidato> candidatos;
    public ArrayList<Eleitores> eleitores;



    public Eleicao() {
        candidatos = new ArrayList<>();
    }

    public void adicionarCandidato(Candidato candidato) {
        candidatos.add(candidato);
    }

    public void listarCandidatos() {
        for (Candidato candidato : candidatos) {
            candidato.mostraInfo();
        }
    }

}


