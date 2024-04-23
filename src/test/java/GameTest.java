import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GameTest {
    Game repo = new Game();

    @BeforeEach
    public void beforTest() {


        Player player1 = new Player(11, "Dima", 5);
        Player player2 = new Player(12, "Shoma", 10);
        Player player3 = new Player(21, "Axa", 1000);
        Player player4 = new Player(18, "Terra", 10);
        repo.register(player1);
        repo.register(player2);
        repo.register(player3);
        repo.register(player4);

    }

    @Test
    public void roundTest() {

        int expected = 2;
        int actual = repo.round("Dima", "Axa");

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void roundTest1() {


        int expected = 1;
        int actual = repo.round("Shoma", "Dima");

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void roundTest2() {


        int expected = 0;
        int actual = repo.round("Shoma", "Terra");

        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void roundTest3() {
        Player player5 = new Player(48, "Sara", 12);


        Assertions.assertThrows(RuntimeException.class, () -> repo.round("Shoma", "Sara"));


    }

    @Test
    public void roundTest4() {
        Player player5 = new Player(4, "Rai", 56);


        Assertions.assertThrows(RuntimeException.class, () -> repo.round("Rai", "Terra"));


    }

}

