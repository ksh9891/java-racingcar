package racinggame.controller;

import racinggame.domain.RacingCars;
import racinggame.domain.RacingGame;
import racinggame.domain.RacingGameResults;
import racinggame.ui.RacingGameInputView;
import racinggame.ui.RacingGameResultView;
import racinggame.ui.RacingGameViewFactory;

public class RacingRunner {
    public void start() {
        final RacingGame racingGame = settingRacingGame();

        final RacingGameResults results = racingGame.play();

        final RacingGameResultView racingGameResultView = RacingGameViewFactory.createResultView(results);
        racingGameResultView.display();
    }

    private RacingGame settingRacingGame() {
        final RacingGameInputView racingGameInputView = RacingGameViewFactory.createInputView();
        final RacingCars racingCars = racingGameInputView.inputRacingCarNames();
        final int roundCount = racingGameInputView.inputRacingRoundCount();
        return new RacingGame(racingCars, roundCount);
    }
}