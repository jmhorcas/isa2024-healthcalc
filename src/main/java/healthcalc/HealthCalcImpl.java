package healthcalc;

import java.text.DecimalFormat;

public class HealthCalcImpl implements HealthCalc {
    public HealthCalcImpl(){
        
    }

    @Override
    public float idealWeight(int height, char gender) throws Exception {
        float pesoIdeal;
        if (gender == 'w'){
            pesoIdeal = (float) (height-100-(height-150)/2.5);
        }
        else if (gender == 'm'){
            pesoIdeal = height-100-(height-150)/4f;
            if(height < 100){
                throw new Exception("Con esta altura los resultados no serán coherentes.");
            }
        }
        else {
            throw new Exception("El género no es correcto.");
        }

        if(height <= 0){
            throw new Exception("Altura negativa o 0.");
        }

        if(height > 300){
            throw new Exception("Altura excesiva.");
        }

        return pesoIdeal;
    }

    @Override
    public float basalMetabolicRate(float weight, int height, char gender, int age) throws Exception{
        float bmr;
        if (gender == 'w'){
            bmr = (float) (10f * weight + 6.25 * height - 5f * age - 161f);
        }
        else if (gender == 'm'){
            bmr = (float) (10f * weight + 6.25 * height - 5f * age + 5f);
        }
        else {
            throw new Exception("El género introducido no es correcto.");
        }

        if(age<0){
            throw new Exception("Edad menor de 0.");
        }

        if(weight<=0){
            throw new Exception("Peso menor o igual de 0.");
        }

        if(height<=0){
            throw new Exception("Altura menor o igual de 0.");
        }

        if(height>300){
            throw new Exception("Altura excesiva.");
        }
        return bmr;
    }
}