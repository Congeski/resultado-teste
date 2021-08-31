package Exercicio1;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@DisplayName("Primeiro exercicio")
class menorRecorrenciaEmUmaListaTest {
    private menorRecorrenciaEmUmaLista menorRecorrenciaEmUmaLista;

    @BeforeEach
    void initial(){
        menorRecorrenciaEmUmaLista = new menorRecorrenciaEmUmaLista();
    }

    @Test
    @DisplayName("lowestRecurrenceInArrayInteger return int when sucessfull")
    void lowestRecurrenceInArrayInteger_int_WhenSucessfull(){
        Integer[] test = {
                1,2,3,3,1,5,2
        };

        Assertions.assertThat(menorRecorrenciaEmUmaLista.lowestRecurrenceInArrayInteger(test))
                .isEqualTo(3);
    }

    @Test
    @DisplayName("lowestRecurrenceInArrayInteger return int when not have recurrence")
    void lowestRecurrenceInArrayInteger_int_WhenNotHaveRecurrence(){
        Integer[] test = {
                2,4,3,5,1
        };

        Assertions.assertThat(menorRecorrenciaEmUmaLista.lowestRecurrenceInArrayInteger(test))
                .isEqualTo(-1);
    }

    @Test
    @DisplayName("lowestRecurrenceInArrayInteger return int when to there two elements equals")
    void lowestRecurrenceInArrayInteger_int_WhenToThereTwoElementsEquals(){
        Integer[] test = {
                2, 2
        };

        Assertions.assertThat(menorRecorrenciaEmUmaLista.lowestRecurrenceInArrayInteger(test))
                .isEqualTo(2);
    }

    @Test
    @DisplayName("lowestRecurrenceInArrayInteger return int when array size equals one")
    void lowestRecurrenceInArrayInteger_int_WhenArraySizeEqualsOne(){
        Integer[] test = {
                2
        };

        Assertions.assertThat(menorRecorrenciaEmUmaLista.lowestRecurrenceInArrayInteger(test))
                .isEqualTo(-1);
    }

    @Test
    @DisplayName("lowestRecurrenceInArrayInteger return int when array size equals zero")
    void lowestRecurrenceInArrayInteger_int_WhenArraySizeEqualsZero(){
        Integer[] test = {

        };

        Assertions.assertThat(menorRecorrenciaEmUmaLista.lowestRecurrenceInArrayInteger(test))
                .isEqualTo(-1);
    }

    @Test
    @DisplayName("lowestRecurrenceInListInteger return int when sucessfull")
    void lowestRecurrenceInListInteger_int_WhenSucessfull(){
        List<Integer> test = Arrays.asList(1, 2, 3, 3, 1, 5, 2);

        Assertions.assertThat(menorRecorrenciaEmUmaLista.lowestRecurrenceInListInteger(test))
                .isEqualTo(3);
    }

    @Test
    @DisplayName("lowestRecurrenceInListInteger return int when not have recurrence")
    void lowestRecurrenceInListInteger_int_WhenNotHaveRecurrence(){
        List<Integer> test = Arrays.asList(2,4,3,5,1);

        Assertions.assertThat(menorRecorrenciaEmUmaLista.lowestRecurrenceInListInteger(test))
                .isEqualTo(-1);
    }

    @Test
    @DisplayName("lowestRecurrenceInListInteger return int when to there two elements equals")
    void lowestRecurrenceInListInteger_int_WhenToThereTwoElementsEquals(){
        List<Integer> test =Arrays.asList(2, 2);

        Assertions.assertThat(menorRecorrenciaEmUmaLista.lowestRecurrenceInListInteger(test))
                .isEqualTo(2);
    }


    @Test
    @DisplayName("lowestRecurrenceInListInteger return int when list size equals one")
    void lowestRecurrenceInListInteger_int_WhenListSizeEqualsOne(){
        List<Integer> test = Collections.singletonList(2);

        Assertions.assertThat(menorRecorrenciaEmUmaLista.lowestRecurrenceInListInteger(test))
                .isEqualTo(-1);
    }

    @Test
    @DisplayName("lowestRecurrenceInListInteger return int when list size equals zero")
    void lowestRecurrenceInListInteger_int_WhenListSizeEqualsZero(){
        List<Integer> test = Collections.emptyList();

        Assertions.assertThat(menorRecorrenciaEmUmaLista.lowestRecurrenceInListInteger(test))
                .isEqualTo(-1);
    }

}