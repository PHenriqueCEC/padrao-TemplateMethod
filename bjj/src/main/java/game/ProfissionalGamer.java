package game;

public class ProfissionalGamer extends Gamer {

    @Override
    public String verificarDano() {
        if (this.totalDano() >= 50){
            return "Dano Alto";
        }
        else{
            return "Dano Médio";
        }

    }
}
