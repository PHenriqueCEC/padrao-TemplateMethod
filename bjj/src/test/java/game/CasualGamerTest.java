package game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CasualGamerTest {

    @Test
    void deveRetornarDanoAlto(){
        CasualGamer game = new CasualGamer();
        game.setDanoArma(25);
        game.setDanoEspecial(35);
        assertEquals("Dano Alto", game.verificarDano());

    }

    @Test
    void deveRetornarDanoMedio(){
        CasualGamer game = new CasualGamer();
        game.setDanoArma(18);
        game.setDanoEspecial(20);
        assertEquals("Dano Médio", game.verificarDano());

    }

    @Test
    void deveRetornarDados(){
        CasualGamer gamer = new CasualGamer();
        gamer.setDanoArma(22);
        gamer.setDanoEspecial(32);
        gamer.setGametag("PHenriqueCEC");
        gamer.setId(254);

        assertEquals("Dano Alto", gamer.verificarDano());

    }

}
