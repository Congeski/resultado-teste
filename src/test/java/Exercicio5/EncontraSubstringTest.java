package Exercicio5;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test encontra substring exercicio 5")
class EncontraSubstringTest {
    private EncontraSubstring encontraSubstring;

    @BeforeEach
    public void initi(){
        encontraSubstring = new EncontraSubstring();
    }

    @Test
    @DisplayName("countSubstring return int when sucessful")
    public void countSubstring_Int_whenSucessful(){
        int count = encontraSubstring.countSubstring("Programador Programação", "ama");

        Assertions.assertThat(count)
                .isEqualTo(2);
    }


    @Test
    @DisplayName("countSubstring return int when sucessful")
    public void countSubstring_Int_whenNotThereSubstringSucessful(){
        int count = encontraSubstring.countSubstring("Programador Programação", "b");

        Assertions.assertThat(count)
                .isEqualTo(0);
    }
}