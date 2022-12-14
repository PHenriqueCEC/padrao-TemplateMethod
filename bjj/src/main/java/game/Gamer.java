package game;

public abstract class Gamer {
    private int id;
    protected String gametag;
    private int danoArma;
    private int danoEspecial;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGametag() {
        return gametag;
    }

    public void setGametag(String gametag) {
        this.gametag = gametag;
    }

    public int getDanoArma() {
        return danoArma;
    }

    public void setDanoArma(int danoArma) {
        this.danoArma = danoArma;
    }

    public int getDanoEspecial() {
        return danoEspecial;
    }

    public void setDanoEspecial(int danoEspecial) {
        this.danoEspecial = danoEspecial;
    }

    public float totalDano(){
        return (this.danoArma + this.danoEspecial);
    }

    public abstract String verificarDano();

    public String getTipo(){
        return "Gamer";
    }

    public String getInfo() {
        return getTipo() + "Gamer:" + this.id +
                "Nome:" + this.gametag +
                "Total de Dano:" + this.verificarDano();

    }
}