package domain;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class NamesTest {

    @Test
    @DisplayName("끝에 쉼표가 있으면 빈 이름이라 예외가 발생한다.")
    void 끝에_쉼표가_있으면_예외가_발생한다() {
        assertThatThrownBy(() -> Names.from("neo,brown,"))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
