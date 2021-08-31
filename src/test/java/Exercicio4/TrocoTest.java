package Exercicio4;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test exercicio 4")
class TrocoTest {
    private Troco troco;

    @BeforeEach
    public void initi(){
        troco = new Troco();
    }

    @Test
    @DisplayName("calculaNota return void when sucessful")
    public void calculaNota_Void_WhenSucessful(){
        troco.calculaNota(70);

        Assertions.assertThat(troco.getQuantidadeNotas())
                .isNotNull()
                .containsExactly(0, 1, 1, 0, 0, 0);
    }

}