package racinggame.input;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class RacingTryCountInputTest {

    @ParameterizedTest
    @ValueSource(ints = { 0, -1 })
    @DisplayName("게임에 필요한 최소 시도회수보다 적은 입력이 들어온 경우 예외가 발생한다")
    void testMinimumCarCount(final int input) {
        assertThatThrownBy(() -> RacingTryCountInput.from(input))
            .isExactlyInstanceOf(IllegalArgumentException.class);
    }
}