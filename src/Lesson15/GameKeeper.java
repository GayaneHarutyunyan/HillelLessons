package Lesson15;

/**
 * Created by User on 01.04.2016.
 */
public class GameKeeper {

    public void startGame(SecretKeeper secretKeeper, SecretBreaker secretBreaker) {
        int assumeNumber = secretBreaker.assumeNumber();
        int result = secretKeeper.checkNumber(assumeNumber);
        while (result != 0) {
            assumeNumber = secretBreaker.assumeNumber(result);
            result = secretKeeper.checkNumber(assumeNumber);

        }
        System.out.println("secret number was: "+assumeNumber);
    }
}
