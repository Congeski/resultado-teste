package Exercicio2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EscadaTest {
    private Escada escada;

    @BeforeEach
    public void initial(){
        escada = new Escada();
    }

    @Test
    public void geraEscada_string_WhenTrheeStep(){
        Assertions.assertThat(escada.geraEscada(3))
                .isEqualTo(
                                "  #\n" +
                                " ##\n" +
                                "###\n"
                );
    }

    @Test
    public void geraEscada_string_WhenOneStep(){
        Assertions.assertThat(escada.geraEscada(1))
                .isEqualTo(
                        "#\n"
                );
    }

    @Test
    public void geraEscada_string_WhenTwoStep(){
        Assertions.assertThat(escada.geraEscada(2))
                .isEqualTo(
                                " #\n"+
                                "##\n"
                );
    }


    @Test
    public void geraEscada_string_WhenFourStep(){
        Assertions.assertThat(escada.geraEscada(4))
                .isEqualTo(
                                "   #\n"+
                                "  ##\n"+
                                " ###\n"+
                                "####\n"
                );
    }

}