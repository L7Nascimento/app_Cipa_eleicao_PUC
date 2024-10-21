import java.util.ArrayList;

public class Eleitores extends Pessoa {
    boolean titulo;
    ArrayList<Eleitores>eleitores;
    public Eleitores() {
        eleitores = new ArrayList<>();
    }

    public void adicionarEleitores(Eleitores eleitores) {
        eleitores.add(eleitor);
    }

    public void listarCandidatos() {
        for (Candidato candidato : candidatos) {
            candidato.mostraInfo();
        }
    }



    public Eleitores(String nome, String partido, int idade, boolean titulo) {
        super(nome, partido, idade);
        this.titulo = titulo;
    }

    public void setTitulo(boolean titulo) {
        this.titulo = titulo;
    }
    public boolean getTitulo(){
        return titulo;
    }
}



