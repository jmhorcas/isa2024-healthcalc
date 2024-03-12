package healthcalc;

public class HealthCalcImpl {

    public float idealWeight(int height, char gender) throws Exception {
        Character sexo = Character.toUpperCase(gender);
        if (sexo != 'W' && sexo != 'M') {
            throw new IllegalArgumentException("No se acepta una entrada distinta de 'W' (Woman) o 'M' (Men)");
        } else if (height > 260) {
            // Altura máxima del ser humano más alto: 2,51
            throw new IllegalArgumentException("Valor excesivamente grande para la entrada de la altura, recuerde que está en cm");
        } else {
            if (sexo == 'M') {
                if (height >= 110) {
                    return height - 100 - (height - 150) / 4f;
                }
            } else {
                if (height >= 100) {
                    return height - 100 - (height - 150) / 2.5f;
                }
            }
            throw new IllegalArgumentException("La altura es demasiado pequeña, recuerda que se introduce en centímetros.");
        }
    }

    public float basalMetabolicRate(float weight, int height, char gender, int age) throws Exception {
        if (20 > weight || weight > 650) {
            throw new IllegalArgumentException("No se aceptarán valores que salgan del rango (20Kg, 650gk)");
        } else if (height < 40 || height > 275) {
            throw new IllegalArgumentException("No se van a aceptar valores que salgan del rango (40cm, 275cm)");
        } else {
            Character sexo = Character.toUpperCase(gender);
            if (sexo != 'W' && sexo != 'M') {
                throw new IllegalArgumentException("Valor de sexo incorrecto (solo se aceptarán valores correspondientes a 'M' y 'W')");
            }else if (0 > age || age > 100) {
                throw new IllegalArgumentException("edad incorrecto (solo se aceptaran valores dentro del umbral 0<X<100 años)");
            }else if (sexo == 'M') {
            	float BMR = 10 * weight + 6.25f * height - 5 * age + 5;
            	if (BMR > 0) {return BMR;} 
            	else {throw new IllegalArgumentException("valores introducidos no son adecuados para el calculo");}	
        }else {
        	float BMR = 10 * weight + 6.25f * height - 5 * age - 161;
        	if (BMR > 0) {return BMR;} 
        	else {throw new IllegalArgumentException("valores introducidos no son adecuados para el calculo");}	
        }	
        }
	}
}
