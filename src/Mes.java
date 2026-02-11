public class Mes {
    private String nome;
    private double temperatura;

    public Mes (String nome, double temperatura){
         this.nome = nome;
         this.temperatura = temperatura;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    private void setTemperatura(double temperatura){
        this.temperatura = temperatura;
    }

    public double getTemperatura(){
        return temperatura;
    }
}
