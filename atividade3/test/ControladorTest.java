import java.util.List;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author White
 */
public class ControladorTest {
    
    public ControladorTest() {
    }
    
    @Before
    public void setUp() {
    }

    @Test
    public void testDadosUsuario() {
        Cliente cli = new Cliente("nome", 20, 200.0, 1500.0);
        Controlador c = new Controlador();
        List<Proposta> propostas = c.processar(cli);
        assertEquals(3, propostas.size());
    }

    @Test (expected = IllegalArgumentException.class)
    public void testDadosUsuarioInvalido() {
        Cliente cli = new Cliente("", 20, 200.0, 1500.0);
        Controlador c = new Controlador();
        c.processar(cli);
    }
}
