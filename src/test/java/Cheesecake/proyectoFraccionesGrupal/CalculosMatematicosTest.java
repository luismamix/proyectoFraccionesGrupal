package Cheesecake.proyectoFraccionesGrupal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Iterator;
import java.util.SortedMap;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

public class CalculosMatematicosTest {
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@DisplayName(value = "Potencia")
	@ParameterizedTest
	@CsvSource(value = { "1,1,1", "2,2,4", "2,10,1024", "5,11,48828125" })
	public void potenciaTest(int base, int exponente, int resultadoEsperado) {
		assertEquals(resultadoEsperado, CalculosMatematicos.potencia(base, exponente));
	}

	@ParameterizedTest
	@ValueSource(ints = { 2, 5, 19, 79, 199 })
	void esPrimoTest(int numero) {
		assertTrue(CalculosMatematicos.esPrimo(numero));
	}

	@ParameterizedTest
	@ValueSource(ints = { 4, 8, 100, 49, 25, 777555222, 1991, 1115 })
	void esNoPrimoTest(int numero) {
		assertFalse(CalculosMatematicos.esPrimo(numero));
	}


	@DisplayName(value = "Maximo Comun Divisor")
	@ParameterizedTest
	@CsvSource(value = { "273,182,91", "12,4,4", "0,7,7", "12,0,12","12,3,3","180,2700,180"})
	void mcdTest(int a, int b, int resultadoesperado) {
		assertEquals(resultadoesperado,CalculosMatematicos.mcd(a, b));
	}

	@DisplayName(value = "Minimo Comun Multiplo")
	@ParameterizedTest
	@CsvSource(value = { "2,3,6", "4,8,8", "0,7,0", "3,0,0"})
	void mcmTest(int a, int b, int resultadoesperado) {
		assertEquals(resultadoesperado,CalculosMatematicos.mcm(a, b));
	}

	@ParameterizedTest
	@ValueSource(ints = { 0, 1 , 7, 18,2700 })
	void divisoresTest(int numero) {
		if(numero == 0) {
			assertTrue(CalculosMatematicos.divisores(numero).isEmpty());
		}else {
			SortedMap<Integer,Integer> divisores = CalculosMatematicos.divisores(numero);
			Iterator<Integer> itkeys=divisores.keySet().iterator();
			int aux= 1;
			while(itkeys.hasNext()) {
				int divisor=itkeys.next();
				aux *= CalculosMatematicos.potencia(divisor, divisores.get(divisor));
			}
			assertEquals(aux,numero);	
		}
	}

	

	
}
