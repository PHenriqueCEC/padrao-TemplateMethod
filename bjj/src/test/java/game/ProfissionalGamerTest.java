package game;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProfissionalGamerTest {

    @Test
    void deveRetornarDanoAlto(){
        ProfissionalGamer game = new ProfissionalGamer();
        game.setDanoArma(25);
        game.setDanoEspecial(35);
        assertEquals("Dano Alto", game.verificarDano());

    }

    @Test
    void deveRetornarDanoMedio(){
        ProfissionalGamer game = new ProfissionalGamer();
        game.setDanoArma(18);
        game.setDanoEspecial(20);
        assertEquals("Dano Médio", game.verificarDano());

    }

    @Test
    void deveRetornarDados(){
        ProfissionalGamer gamer = new ProfissionalGamer();
        gamer.setDanoArma(22);
        gamer.setDanoEspecial(32);
        gamer.setGametag("PHenriqueCEC");
        gamer.setId(254);

        assertEquals("Dano Alto", gamer.verificarDano());

    }
}
