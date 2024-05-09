package healthcalc;

public class decoradorEuropeo implements HealthHospital {
    private HealthHospital calculadora;

    public decoradorEuropeo(HealthHospital calc) {
        this.calculadora = calc;
    }

    @Override
    public int pesoIdeal(char genero, float altura) {
        return calculadora.pesoIdeal(genero, altura);
    }

    @Override
    public double bmr(char genero, int edad, float altura, int peso) {
        double bmr = calculadora.bmr(genero, edad, altura, peso);

        System.out.printf("La persona con altura %.2f metros y %.2f kg tiene un BMR de %.2f.%n",
                altura, peso / 1000.0, bmr);
        System.out.printf("The person with height %.2f meters and %.2f lb has a BMR of %.2f.%n",
                altura, (peso / 1000.0)*2.20462, bmr);

        return bmr;
    }
}
