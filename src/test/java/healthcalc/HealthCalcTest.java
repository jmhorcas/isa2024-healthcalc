package healthcalc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Tests para la calculadora de salud.")
public class HealthCalcTest {

	@Test
	@DisplayName("Esto es un test de ejemplo.")
	public void bmi() {
		assertEquals(true, true);
	}

	@Test
	public void generoCorrectoIdealWeight(){
		HealthCalc calculadora = new HealthCalcImpl();
        try {
            float resultado1 = calculadora.idealWeight(160, 'w');
            assertEquals(56, resultado1, 0.0001);

			float resultado2 = calculadora.idealWeight(160, 'm');
			assertEquals(57.5, resultado2, 0.0001);

			assertThrows(Exception.class, () ->calculadora.idealWeight(160, 'c'));
        } catch (Exception e) {
            // Manejo de excepciones si es necesario
            System.out.println("Error: " + e.getMessage());
        }
    }

	@Test
	public void cuentasCorrectasMujerIdealWeight(){
		HealthCalc calculadora = new HealthCalcImpl();
		try{
			float resultado1 = calculadora.idealWeight(183, 'w');
			assertEquals(69.8, resultado1, 0.0001);
			
			float resultado2 = calculadora.idealWeight(157, 'w');
			assertEquals(54.2, resultado2, 0.0001);

			float resultado3 = calculadora.idealWeight(159, 'w');
			assertEquals(55.4, resultado3, 0.0001);

			float resultado4 = calculadora.idealWeight(140, 'w');
			assertEquals(44, resultado4, 0.0001);

			float resultado5 = calculadora.idealWeight(90, 'w');
			assertEquals(14, resultado5, 0.0001);
		}
		catch (Exception e){
			System.out.println("Error: "+ e.getMessage());
		}
	}

	@Test
	public void cuentasCorrectasHombreIdealWeight(){
		HealthCalc calculadora = new HealthCalcImpl();
		try{
			float resultado1 = calculadora.idealWeight(183, 'm');
			assertEquals(74.75, resultado1, 0.0001);
			
			float resultado2 = calculadora.idealWeight(157, 'm');
			assertEquals(55.25, resultado2, 0.0001);

			float resultado = calculadora.idealWeight(159, 'm');
			assertEquals(56.75, resultado, 0.0001);

			float resultado4 = calculadora.idealWeight(140, 'm');
			assertEquals(42.5, resultado4, 0.0001);

			float resultado5 = calculadora.idealWeight(100, 'm');
			assertEquals(12.5, resultado5, 0.0001);
		}
		catch (Exception e){
			System.out.println("Error: "+ e.getMessage());
		}
	}

	@Test
	public void generoCorrectobasalMetabolicRate(){
		HealthCalc calculadora = new HealthCalcImpl();
        try {
            float resultado1 = calculadora.basalMetabolicRate(50f, 160, 'w', 17);
            assertEquals(1254, resultado1, 0.0001);

			float resultado2 = calculadora.basalMetabolicRate(50f, 160, 'm', 17);
			assertEquals(1420, resultado2, 0.0001);

			assertThrows(Exception.class, () ->calculadora.basalMetabolicRate(50f, 160, 'c', 17));
        } catch (Exception e) {
            // Manejo de excepciones si es necesario
            System.out.println("Error: " + e.getMessage());
        }
    }

	@Test
	public void cuentasCorrectasMujerbasalMetabolicRate(){
		HealthCalc calculadora = new HealthCalcImpl();
		try{
			float resultado1 = calculadora.basalMetabolicRate(80.3f, 184, 'w', 20);
			assertEquals(1692, resultado1, 0.0001);
			
			float resultado2 = calculadora.basalMetabolicRate(92, 167, 'w', 65);
			assertEquals(1477.75, resultado2, 0.0001);

			float resultado3 = calculadora.basalMetabolicRate(20, 98, 'w', 3);
			assertEquals(636.5, resultado3, 0.0001);

			float resultado4 = calculadora.basalMetabolicRate(58, 174, 'w', 80);
			assertEquals(1106.5, resultado4, 0.0001);

			float resultado5 = calculadora.basalMetabolicRate(90, 190, 'w', 76);
			assertEquals(1546.5, resultado5, 0.0001);
		}
		catch (Exception e){
			System.out.println("Error: "+ e.getMessage());
		}
	}

	@Test
	public void cuentasCorrectasHombrebasalMetabolicRate(){
		HealthCalc calculadora = new HealthCalcImpl();
		try{
			float resultado1 = calculadora.basalMetabolicRate(80.3f, 184, 'm', 20);
			assertEquals(1858, resultado1, 0.0001);
			
			float resultado2 = calculadora.basalMetabolicRate(92, 167, 'm', 65);
			assertEquals(1643.75, resultado2, 0.0001);

			float resultado3 = calculadora.basalMetabolicRate(20, 98, 'm', 3);
			assertEquals(802.5, resultado3, 0.0001);

			float resultado4 = calculadora.basalMetabolicRate(58, 174, 'm', 80);
			assertEquals(1272.5, resultado4, 0.0001);

			float resultado5 = calculadora.basalMetabolicRate(90, 190, 'm', 76);
			assertEquals(1712.5, resultado5, 0.0001);
		}
		catch (Exception e){
			System.out.println("Error: "+ e.getMessage());
		}
	}

	@Test
	public void alturaNoNegativaPesoIdeal(){
		HealthCalc calculadora = new HealthCalcImpl();
        try {
            assertThrows(Exception.class, () ->calculadora.idealWeight(0, 'w'));
			assertThrows(Exception.class, () ->calculadora.idealWeight(-2, 'm'));
        } catch (Exception e) {
            // Manejo de excepciones si es necesario
            System.out.println("Error: " + e.getMessage());
        }
	}

	@Test
	public void alturaNoMayor300PesoIdeal(){
		HealthCalc calculadora = new HealthCalcImpl();
        try {
            assertThrows(Exception.class, () ->calculadora.idealWeight(301, 'w'));
			assertThrows(Exception.class, () ->calculadora.idealWeight(400, 'm'));
        } catch (Exception e) {
            // Manejo de excepciones si es necesario
            System.out.println("Error: " + e.getMessage());
        }
	}

	@Test
	public void edadNoNegativa(){
		HealthCalc calculadora = new HealthCalcImpl();
        try {
            assertThrows(Exception.class, () ->calculadora.basalMetabolicRate(50, 160, 'w', -2));
			assertThrows(Exception.class, () ->calculadora.basalMetabolicRate(50, 170, 'm', -1));
        } catch (Exception e) {
            // Manejo de excepciones si es necesario
            System.out.println("Error: " + e.getMessage());
        }
	}

	@Test
	public void pesoNoNegativo(){
		HealthCalc calculadora = new HealthCalcImpl();
        try {
            assertThrows(Exception.class, () ->calculadora.basalMetabolicRate(0, 160, 'w', 77));
			assertThrows(Exception.class, () ->calculadora.basalMetabolicRate(-50, 170, 'm', 56));
        } catch (Exception e) {
            // Manejo de excepciones si es necesario
            System.out.println("Error: " + e.getMessage());
        }
	}

	@Test
	public void alturaNoNegativaBMR(){
		HealthCalc calculadora = new HealthCalcImpl();
        try {
            assertThrows(Exception.class, () ->calculadora.basalMetabolicRate(50, 0, 'w', 77));
			assertThrows(Exception.class, () ->calculadora.basalMetabolicRate(50, -170, 'm', 56));
        } catch (Exception e) {
            // Manejo de excepciones si es necesario
            System.out.println("Error: " + e.getMessage());
        }
	}

	@Test
	public void alturaNoExcesivaBMR(){
		HealthCalc calculadora = new HealthCalcImpl();
        try {
            assertThrows(Exception.class, () ->calculadora.basalMetabolicRate(50, 400, 'w', 77));
			assertThrows(Exception.class, () ->calculadora.basalMetabolicRate(50, 500, 'm', 56));
        } catch (Exception e) {
            // Manejo de excepciones si es necesario
            System.out.println("Error: " + e.getMessage());
        }
	}

	@Test
	public void alturaNoMenor100PesoIdealHombres(){
		HealthCalc calculadora = new HealthCalcImpl();
        try {
            assertThrows(Exception.class, () ->calculadora.idealWeight(99, 'm'));
        } catch (Exception e) {
            // Manejo de excepciones si es necesario
            System.out.println("Error: " + e.getMessage());
        }
	}
}
