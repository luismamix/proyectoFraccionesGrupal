package Cheesecake.proyectoFraccionesGrupal;
import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class FraccionTest {
	
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
	@CsvSource(value = { "1,2,1,2", "2,4,1,2", "5,20,1,4", "100,1000,1,10" })
	public void simplificarTest(int numOr, int denOr, int numEs, int denEs) {
	
		Fraccion f = new Fraccion(numOr, denOr);
		f.simplificar();
		
		assertEquals(numEs, f.getNumerador());
		assertEquals(denEs, f.getDenominador());
	}
	
	@ParameterizedTest
	@CsvSource(value = { "2,5,3,4,8,15", "4,3,1,3,4,1", "1,4,1,5,5,4", "1,2,3,4,2,3", "3,7,9,14,2,3" })
	public void divisionTest(int num1, int den1, int num2, int den2, int numEs, int denEs) {
	
		Fraccion f1 = new Fraccion(num1, den1);
		Fraccion f2 = new Fraccion(num2, den2);
		
		assertEquals(numEs, Fraccion.division(f1, f2).simplificar().getNumerador());
		assertEquals(denEs, Fraccion.division(f1, f2).simplificar().getDenominador());
	}
	
	@DisplayName(value = "MultiplicacionTest")
	@ParameterizedTest
	@CsvSource(value = {  "1,3,2,5,2,15", "3,5,2,3,2,5", "1,3,9,16,3,16", "1,5,1,10,1,50", "2,4,1,5,1,10" })
	public void multiplicacionTest(int numf1, int denf1, int numf2, int denf2, int numEsperado, int denEsperado) {
		Fraccion f1 = new Fraccion(numf1, denf1);
		Fraccion f2 = new Fraccion(numf2, denf2);
		
		assertEquals(numEsperado, Fraccion.multiplicacion(f1, f2).simplificar().getNumerador());
		assertEquals(denEsperado, Fraccion.multiplicacion(f1, f2).simplificar().getDenominador());
	}


}
