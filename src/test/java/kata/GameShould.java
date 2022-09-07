package kata;


import com.codurance.kata.Game;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class GameShould {

    public Game game;
    @Test
    public void board(){
        Assertions.assertEquals("...\n...\n...", game.board());
    }
}
