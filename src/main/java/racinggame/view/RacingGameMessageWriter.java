package racinggame.view;

public class RacingGameMessageWriter implements MessageWriter {
    @Override
    public void write(final String message) {
        System.out.println(message);
    }
}