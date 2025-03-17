import Calculadora.Calculadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class AssertTest {

    Calculadora calc = new Calculadora();

    // Teste 1: Validar que a soma não é nula
    @Test
    public void testSomarNotNull() {
        int resultado = calc.somar(5, 3);
        assertNotNull(resultado); // int nunca será null, mas mantém o requisito
    }

    // Teste 2: Validar que objetos diferentes não são os mesmos
    @Test
    public void testNotSameObjetos() {
        Calculadora a = new Calculadora();
        Calculadora b = new Calculadora();
        assertNotSame(a, b);
    }

    // Teste 3: Validar resultado da subtração com assertEquals
    @Test
    public void testSubtrair() {
        int esperado = 2;
        int resultado = calc.subtrair(5, 3);
        assertEquals(esperado, resultado);
    }

    // Teste 4: Validar resultado da multiplicação com arrays de bytes
    @Test
    public void testMultiplicarArrayBytes() {
        byte[] esperado = {15};
        byte[] resultado = {(byte) calc.multiplicar(5, 3)};
        assertArrayEquals(esperado, resultado);
    }

    // Teste 5: Validar se retorno da divisão por zero gera exceção (assertNull não se aplica diretamente aqui)
    @Test
    public void testDivisaoPorZeroThrows() {
        assertThrows(ArithmeticException.class, () -> calc.dividir(10, 0));
    }

    // Teste 6: Validar booleano com resultado incorreto
    @Test
    public void testResultadoIncorretoEhFalse() {
        boolean resultadoCorreto = calc.somar(2, 2) == 5;
        assertFalse(resultadoCorreto);
    }

    // Teste 7: Validar assertSame com o mesmo objeto calculadora
    @Test
    public void testSameObjeto() {
        Calculadora mesmaCalculadora = calc;
        assertSame(calc, mesmaCalculadora);
    }

    // Extra 1: Usando Try/Catch
    @Test
    public void testTryCatchDivisaoPorZero() {
        try {
            calc.dividir(5, 0);
            fail("Era esperada uma ArithmeticException");
        } catch (ArithmeticException e) {
            assertTrue(true);
        }
    }

    // Extra 2: Usando Lambda Expression para capturar exceção
    @Test
    public void testLambdaExpressionDivisaoPorZero() {
        assertThrows(ArithmeticException.class, () -> calc.dividir(8, 0));
    }
}