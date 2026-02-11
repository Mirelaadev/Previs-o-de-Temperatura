public class Ano {
    //representa o valor do ano (ex: 2010)
    private int valor;

    private Mes [] meses = new Mes[12];

    public Ano(int valor){
        this.valor = valor;
    }

    public void setMeses(Mes[] meses) {
        this.meses = meses;
    }

    public Mes[] getMeses() {
        return meses;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
}
