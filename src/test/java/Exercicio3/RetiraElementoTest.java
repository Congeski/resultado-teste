package Exercicio3;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

@DisplayName("Test retira o elemento K")
class RetiraElementoTest {
    private RetiraElemento retiraElemento;

    @BeforeEach
    public void init(){
        retiraElemento = new RetiraElemento();
    }

    @Test
    @DisplayName("addAll return void when sucesfull")
    public void addAll_Void_WhenSucesfull(){
        retiraElemento.addAll(1, 2, 3, 4, 5);

        List<Integer> list = retiraElemento.getList();

        Assertions.assertThat(list)
                .isNotNull()
                .hasSize(5)
                .containsOnly(1, 2, 3, 4, 5);
    }

    @Test
    @DisplayName("clean return void when sucesfull")
    public void clean_Void_WhenSucesfull(){
        retiraElemento.addAll(1, 2, 3, 4, 5);
        retiraElemento.clear();

        List<Integer> list = retiraElemento.getList();

        Assertions.assertThat(list)
                .isNotNull()
                .hasSize(0);
    }

    @Test
    @DisplayName("retiraValor return void when sucesfull")
    public void retiraValor_Void_WhenSucesfull(){
        retiraElemento.addAll(1, 2, 3, 4, 5);
        retiraElemento.retiraValor(2);

        List<Integer> list = retiraElemento.getList();

        Assertions.assertThat(list)
                .isNotNull()
                .hasSize(4)
                .containsOnly(1, 3, 4, 5);
    }

    @Test
    @DisplayName("retiraValor return void when integer not found")
    public void retiraValor_Void_WhenIntegerNotFound(){
        retiraElemento.addAll(1, 3, 4, 5);
        retiraElemento.retiraValor(2);

        List<Integer> list = retiraElemento.getList();

        Assertions.assertThat(list)
                .isNotNull()
                .hasSize(4)
                .containsOnly(1, 3, 4, 5);
    }

    @Test
    @DisplayName("retiraValor return void when integer not found")
    public void retiraValor_Void_WhenIntegerRepeated(){
        retiraElemento.addAll(1, 2, 2, 2, 2, 3, 4, 5);
        retiraElemento.retiraValor(2);

        List<Integer> list = retiraElemento.getList();

        Assertions.assertThat(list)
                .isNotNull()
                .hasSize(4)
                .containsOnly(1, 3, 4, 5);
    }

    @Test
    @DisplayName("retiraValor return void when integer not found")
    public void retiraValor_Void_WhenListEmpty(){
        retiraElemento.clear();
        retiraElemento.retiraValor(2);

        List<Integer> list = retiraElemento.getList();

        Assertions.assertThat(list)
                .isNotNull()
                .hasSize(0);
    }

}