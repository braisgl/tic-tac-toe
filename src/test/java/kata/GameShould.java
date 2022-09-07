package kata;


import com.codurance.kata.Board;
import com.codurance.kata.Game;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class GameShould {

    public Game game = new Game();
    public Board board = new Board();
    @Test
    public void board() {
        Assertions.assertEquals(board.getCurrentBoard().length,game.currentBoard().length);
    }

    @Test
    public void player_x_play(){
        String token = "X";
        Assertions.assertEquals(token, board.getCurrentBoard()[0]);
    }

}
