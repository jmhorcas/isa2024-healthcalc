package healthcalc;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class HealthStatsProxy implements HealthHospital, HealthStats {

    private HealthHospital calculadora;
    private List<Integer> Lista_Peso;
    private List<Integer> Lista_Edad;
    private List<Float> Lista_Altura;
    private int Numero_Mujeres;
    private int Numero_Hombres;
    private List<Double> Lista_BMR;

    public HealthStatsProxy(HealthHospital healthCalcAdapter) {
        calculadora = healthCalcAdapter;
        Lista_Peso = new ArrayList<>();
        Lista_Edad = new ArrayList<>();
        Lista_Altura = new ArrayList<>();
        Numero_Mujeres = 0;
        Numero_Hombres = 0;
        Lista_BMR = new ArrayList<>();
    }
    @Override
    public int pesoIdeal(char genero, float altura) {
        int pesoIdeal = calculadora.pesoIdeal(genero, altura);

        Lista_Altura.add(altura);
        if (genero == 'w') {
            Numero_Mujeres += 1;
        } 
        
        else {
            Numero_Hombres += 1;
        }

        return pesoIdeal;
    }
    @Override
    public double bmr(char genero, int edad, float altura, int peso) {
        double bmr = calculadora.bmr(genero, edad, altura, peso);

        Lista_Peso.add(peso);
        Lista_Altura.add(altura);
        Lista_Edad.add(edad);

        Lista_BMR.add(bmr);

        if (genero == 'w') {
            Numero_Mujeres+= 1;
        } 
        
        else {
            Numero_Hombres += 1;
        }

        return bmr;
    }


    @Override
    public float pesoMedio(){
        float suma = 0;

        if (Lista_Peso.size()==0){
            return 0;
        }

        for (float valor : Lista_Peso) {
            suma += valor;
        }

        return suma / Lista_Peso.size();
    }

    @Override
    public float edadMedia(){
        float suma = 0;

        if (Lista_Edad.size()==0){
            return 0;
        }

        for (float valor : Lista_Edad) {
            suma += valor;
        }

        return suma / Lista_Edad.size();
    }

    @Override
    public float alturaMedia(){
        float suma = 0;

        if (Lista_Altura.size()==0){
            return 0;
        }

        for (float valor : Lista_Altura) {
            suma += valor;
        }

        return suma / Lista_Altura.size();
    }
    
    @Override
    public float bmrMedio(){
        float suma = 0;

        if (Lista_BMR.size()==0){
            return 0;
        }

        for (double valor : Lista_BMR) {
            suma += valor;
        }

        return suma / Lista_BMR.size();
    }

    @Override
    public int numSexoH(){
        return Numero_Hombres;
    }

    @Override
    public int numSexoM(){
        return Numero_Mujeres;
    }

    @Override
    public int numTotalPacientes(){
        return Numero_Mujeres+Numero_Hombres;
    }

}