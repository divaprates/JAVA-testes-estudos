import org.example.model.Pessoa;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class ContaTeste {

    @Test
    void validarLancamento() {
        int[] primeiro = {10, 34, 23, 4,90};
        int[] segundo = {10, 34, 23, 4,90};

        assertArrayEquals(primeiro, segundo);
    }

    @Test
    void validarObjetoNulo() {
        Pessoa p = null;
        assertNull(p);

        p = new Pessoa("Khaleesi", LocalDateTime.of(2000, 12, 1, 15, 0, 0));
        assertNotNull(p);
    }

    @Test
    void validarNumerosTiposDiferentes() {
        double x = 9.0;
        double y = 9.0;

        assertEquals(x, y);
    }

}
