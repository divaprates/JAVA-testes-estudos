import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.DisplayName.class)
public class OrdemDisplayTeste {

    @DisplayName("Teste a")
    @Test
    void validaFluxoA() {
        Assertions.assertTrue(true);
    }

    @DisplayName("Teste c")
    @Test
    void validaFluxoC() {
        Assertions.assertTrue(true);
    }

    @DisplayName("Teste b")
    @Test
    void validaFluxoB() {
        Assertions.assertTrue(true);
    }

}
