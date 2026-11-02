package domain;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PrizeTest {

    @Test
    @DisplayName("5글자를 넘으면 예외가 발생한다.")
    void 다섯_글자를_넘으면_예외가_발생한다() {
        assertThatThrownBy(() -> new Prize("sixsix"))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
