package lista06;

import lista02.Livro;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class LivroTest {
    @Test
    public void testLivroConstructor() {
        Livro livro = new Livro("Dom Casmurro", "Machado de Assis", 1899);
        assertEquals("Dom Casmurro", livro.getTitulo(), "Erro no getter de título");
        assertEquals("Machado de Assis", livro.getAutor(), "Erro no getter de autor");
        assertEquals(1899, livro.getAnoPublicacao(), "Erro no getter de ano de publicação");
    }
}
