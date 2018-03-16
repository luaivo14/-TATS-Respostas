import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author White
 */
public class ClienteValidadorTest {
    
    public ClienteValidadorTest() {
    }
    
    @Before
    public void setUp() {
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testNomeVazio(){
        Cliente c = new Cliente("", 20, 100.0,7000);
        
        ClienteValidador.Validar(c);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testSalarioMenorQueZero(){
        Cliente c = new Cliente("Joselito", 20, 100.0, -7000);
        
        ClienteValidador.Validar(c);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testIdadeIncorreta(){
        Cliente c = new Cliente("Joselito", 10, 100.0, 7000);
        
        ClienteValidador.Validar(c);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testValorDeFinanciamentoIncorreto(){
        Cliente c = new Cliente("Joselito", 20, 90.0, 7000);
        
        ClienteValidador.Validar(c);
    }
}
