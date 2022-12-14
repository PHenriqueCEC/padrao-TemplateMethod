package game;

public class CasualGamer extends Gamer {

    @Override
    public String verificarDano() {
        if (this.totalDano() >= 40){
            return "Dano Alto";
        }
        else{
            return "Dano Médio";
        }

    }
}
