package healthcalc;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Tests para la calculadora de salud.")
public class HealthCalcTest {

	private final HealthCalcImpl calculadora = new HealthCalcImpl();

	/////    idealWeight() /////
	@Test 
	@DisplayName("Test de Altura Negativa IW")
	public void testAlturaNegativaIW() {
		assertThrows(IllegalArgumentException.class, 
		() -> calculadora.idealWeight(-79, 'M'), 
		"La altura introducida es negativa");
	}
	@Test
	@DisplayName("Altura inferior a la esperada IW")
	public void testAlturaMenor(){
		assertThrows(IllegalArgumentException.class,
		()->calculadora.idealWeight(109,'M'),
		"La altura es demasiado pequeña, recuerda que se introduce en centímetros.");
		assertThrows(IllegalArgumentException.class,
		()->calculadora.idealWeight(99,'W'),
		"La altura es demasiado pequeña, recuerda que se introduce en centímetros.");
		

	}
	@Test
	@DisplayName("Error en la introduccion del sexo.")
	public void testGenderProblemIW(){
		assertThrows(IllegalArgumentException.class,
		 ()-> calculadora.idealWeight(130, 'j'),
		"No se acepta una entrada distinta de 'W' (Woman) o 'M' (Men)");
	}
	@Test
	@DisplayName("Entrada correcta del Sexo")
	public void CorrectGender(){
		assertDoesNotThrow( () -> calculadora.idealWeight(150, 'm'));
		assertDoesNotThrow(() -> calculadora.idealWeight(150, 'M'));
		assertDoesNotThrow(() -> calculadora.idealWeight(150, 'W'));
		assertDoesNotThrow(() -> calculadora.idealWeight(150, 'w'));

	}
	@Test
	@DisplayName("Altura superior a lo esperado IW")
	public void testAlturaMayor(){
		assertThrows(IllegalArgumentException.class,
		()-> calculadora.idealWeight(261, 'M'),
		"Valor excesivamente grande para la entrada de la altura, recuerde que está en cm");
	}
	@Test
	@DisplayName("Test Hombre promedio IW")
	public void HombrePromedioIW() throws Exception{
		float IW = 110 - 100 - (110 - 150) / 4f;
		assertEquals(IW, calculadora.idealWeight(110, 'm'));

		IW = 168 - 100 - (168 - 150) / 4f;
		assertEquals(IW, calculadora.idealWeight(168, 'm'));

		IW = 259 - 100 - (259 - 150) / 4f;
		assertEquals(IW, calculadora.idealWeight(259, 'm'));
	}
	@Test
	@DisplayName("Test mujer uso promedio IW")
	public void testMujerPromedioIW() throws Exception{
		float IW = 100 - 100 - (100 - 150) / 2.5f;
		assertEquals(IW, calculadora.idealWeight(100, 'w'));

		IW = 168 - 100 - (168 - 150) / 2.5f;
		assertEquals(IW, calculadora.idealWeight(168, 'w'));

		IW = 259 - 100 - (259 - 150) / 2.5f;
		assertEquals(IW, calculadora.idealWeight(259, 'w'));
	}
	///// basalMetabolicRate() ////
	@Test 
	@DisplayName("Valores de Peso inferiores a lo permitido o negativos")
	public void PesoIncorrecto(){
		assertThrows(IllegalArgumentException.class, 
		() -> calculadora.basalMetabolicRate(-10, 168, 'M', 22),
		"No se aceptarán valores que salgan del rango (20Kg, 650gk)");

		assertThrows(IllegalArgumentException.class,
		() -> calculadora.basalMetabolicRate(19, 168, 'W', 22),
		"No se aceptarán valores que salgan del rango (20Kg, 650gk)");
		
		assertThrows(IllegalArgumentException.class,
		() -> calculadora.basalMetabolicRate(651, 168, 'W', 22),
		"No se aceptarán valores que salgan del rango (20Kg, 650gk)");
	}
	@Test
	@DisplayName("Valores para la altura incorrectos o negativos")
	public void alturaIncorrecta(){
		assertThrows(IllegalArgumentException.class,
		() -> calculadora.basalMetabolicRate(80, -5, 'M', 22),
		"No se van a aceptar valores que salgan del rango (40cm, 275cm)");

		assertThrows(IllegalArgumentException.class,
		() -> calculadora.basalMetabolicRate(80, 39, 'W', 22),
		"No se van a aceptar valores que salgan del rango (40cm, 275cm)");

		assertThrows(IllegalArgumentException.class,
		() -> calculadora.basalMetabolicRate(80, 276, 'W', 22),
		"No se van a aceptar valores que salgan del rango (40cm, 275cm)");
	}
	@Test
	@DisplayName("Test Incorrecto Sexo BRM")
	public void IncorrectoSexo(){
		assertThrows(IllegalArgumentException.class,
		() -> calculadora.basalMetabolicRate(80, 168, 'J', 22),
		"Valor de sexo incorrecto (solo se aceptarán valores correspondientes a 'M' y 'W')");
	}
	@Test
	@DisplayName("Comprobacion de Todos Los Sexos")
	public void ComprobacionSexo(){
		assertDoesNotThrow(()-> calculadora.basalMetabolicRate(60, 160, 'm', 22));
		assertDoesNotThrow(()-> calculadora.basalMetabolicRate(60, 160, 'M', 22));
		assertDoesNotThrow(()-> calculadora.basalMetabolicRate(60, 160, 'W', 22));
		assertDoesNotThrow(()-> calculadora.basalMetabolicRate(60, 160, 'w', 22));
	}

	@Test 
	@DisplayName("Entradas sin sentido")
	public void NoSense(){
		assertThrows(IllegalArgumentException.class,
		() -> calculadora.basalMetabolicRate(21, 41, 'W', 99),
		"Valores introducidos no son correctos para el cálculo");
	}

	@Test 
	@DisplayName("Test mujer promedio BMR")
	public void testWomanBMR() throws Exception{
		float BMR = (float) (10 * 21 + 6.25 * 150 - 5 * 13 - 161);
		assertEquals(BMR, calculadora.basalMetabolicRate(21, 150, 'w', 13));

		BMR = (float) (10 * 65 + 6.25 * 167 - 5 * 22 - 161);
		assertEquals(BMR, calculadora.basalMetabolicRate(65, 167, 'w', 22));

		BMR = (float) (10 * 80 + 6.25 * 170 - 5 * 55 - 161);
		assertEquals(BMR, calculadora.basalMetabolicRate(80, 170, 'w', 55));
	}
	@Test 
	@DisplayName("Test hombre promedio BMR")
	public void testMenBMR() throws Exception{
		float BMR = (float) (10 * 21 + 6.25 * 150 - 5 * 13 + 5);
		assertEquals(BMR, calculadora.basalMetabolicRate(21, 150, 'M', 13));

		BMR = (float) (10 * 65 + 6.25 * 167 - 5 * 22 + 5);
		assertEquals(BMR, calculadora.basalMetabolicRate(65, 167, 'M', 22));

		BMR = (float) (10 * 80 + 6.25 * 170 - 5 * 55 + 5);
		assertEquals(BMR, calculadora.basalMetabolicRate(80, 170, 'M', 55));
	}

}
