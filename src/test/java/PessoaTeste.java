import org.example.model.Pessoa;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class PessoaTeste {

    @Test
    void deveCalcularIdadeCorretamente() {
        Pessoa lua = new Pessoa("Lua", LocalDateTime.of(2000, 12, 1, 15, 0, 0));
        Assertions.assertEquals(22, lua.getIdade());
    }

    @Test
    void deveRetornarSeMaiorIdade() {
        Pessoa lua = new Pessoa("Lua", LocalDateTime.of(2000, 12, 1, 15, 0, 0));
        Assertions.assertTrue(lua.eMaiorIdade());

        Pessoa sol = new Pessoa("Sol", LocalDateTime.of(2013, 12, 1, 15, 0, 0));
        Assertions.assertFalse(sol.eMaiorIdade());
    }

}
