import models.Calculadora;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.*;
import java.util.logging.Logger;
import static org.junit.jupiter.api.Assertions.assertEquals;

@DisplayName("Tests Clase Calculadora")
public class CalculadoraTest {

    private static Logger logger = Logger.getLogger("cl.praxis.Calculadora.CalculadoraTest");
    private Calculadora calculadora = new Calculadora();

    @Test
    public void testSuma(){
        final int esperado = 5;
        final int actual = calculadora.sumar(2,3);
        assertEquals(actual, esperado);
    }

    @Test
    public void testResta(){
        final int esperado = 5;
        final int actual = calculadora.restar(8,3);
        assertEquals(actual, esperado);
    }

    @Test
    public void testMultiplicar(){
        final int esperado = 10;
        final int actual = calculadora.multiplicar(2,5);
        assertEquals(actual, esperado);
    }

    @Test
    public void testDividir(){
        final int esperado = 25;
        final int actual = calculadora.dividir(100,4);
        assertEquals(actual, esperado);
    }

}
