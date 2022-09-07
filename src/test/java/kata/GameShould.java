package kata;


import com.codurance.kata.Game;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class GameShould {

    public Game game = new Game();
    @Test
    public void empty_board(){
        String board = "...\n...\n...";
        Assertions.assertEquals(board, game.board());
    }
    @Test
    public void one_person_on_first_position_on_the_board(){
        String board = "X..\n...\n...";
        Assertions.assertEquals(board, game.board());
    }
}
