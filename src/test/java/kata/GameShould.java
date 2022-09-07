package kata;


import com.codurance.kata.Board;
import com.codurance.kata.Game;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class GameShould {

    public static final String PLAYER1 = "X";
    public static final String PLAYER2 = "O";

    public Game game = new Game();
    public Board board = new Board();
    @Test
    public void board() {
        Assertions.assertEquals(board.getCurrentBoard().length,game.currentBoard().length);
    }

    @Test
    public void player_x_play(){
        game.play( 0);
        Assertions.assertEquals(PLAYER1, game.currentBoard()[0]);
    }

    @Test
    public void player_o_play(){
        game.play( 1);
        game.play(0);
        Assertions.assertEquals(PLAYER2, game.currentBoard()[0]);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void player_cannot_move_in_position_less_than_0(){
        game.play( -1);
        game.currentBoard();
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void player_cannot_move_in_position_more_than_8(){
        game.play( 20);
        game.currentBoard();
    }

    @Test
    public void player_cannot_add_their_token_where_one_already_exists(){
        game.play( 1);
        Assertions.assertEquals("Position already occupied", game.play( 1));
    }

    @Test
    public void horizontal_match_row_1(){
        game.play(0);
        game.play(5);
        game.play(1);
        game.play(6);
        Assertions.assertEquals("YOU WON", game.play(2));
    }

    @Test
    public void horizontal_match_row_2(){
        game.play(3);
        game.play(0);
        game.play(4);
        game.play(2);
        Assertions.assertEquals("YOU WON", game.play(5));
    }

    @Test
    public void horizontal_match_row_3(){
        game.play(6);
        game.play(0);
        game.play(7);
        game.play(1);
        Assertions.assertEquals("YOU WON", game.play(8));
    }



}
