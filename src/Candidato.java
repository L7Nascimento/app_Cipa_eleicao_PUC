public class Candidato extends Pessoa{
    //criando classe instanciavel
    int numero;
    String cargo;

    //criando contrutor + o super que invoca atributos da classe Pessoa (herança)
    public Candidato(String nome, String partido, int idade, int numero, String cargo){
        super(nome,partido,idade);
        this.numero = numero;
        this.cargo = cargo;
    }
//criando getter
    public int getNumero() {
        return numero;
    }
    public String getCargo(){
        return cargo;
    }
    public void setNumero(){
        this.numero = numero;

    }
     //criando setter
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    //criando Metodo que mostra informações do candidato.
    public void mostraInfo(){

        System.out.println(" Nome do Candidato: " + getNome());
        System.out.println(" Cargo: " + getCargo());
        System.out.println(" Numero: " + getNumero());
        System.out.println(" Partido: " + getPartido());
        System.out.println(" Idade do candidato: " + getIdade());
        System.out.println("--------------------------------------------------------");
    }
}
