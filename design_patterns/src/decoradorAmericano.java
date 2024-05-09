package healthcalc;

public class decoradorAmericano implements HealthHospital {
    private HealthHospital calculadora;

    public decoradorAmericano(HealthHospital calc) {
        this.calculadora = calc;
    }

    @Override
    public int pesoIdeal(char genero, float altura) {
        double alturaM = altura * 0.3048;
        return calculadora.pesoIdeal(genero, (float) alturaM);
    }

    @Override
    public double bmr(char genero, int edad, float altura, int peso) {
        double pesoKg = (peso / 2.20462) * 1000;
        double alturaM = altura * 0.3048;
        float alturaM2 = (float) alturaM;
        int pesoKg2 = (int) pesoKg;
        double bmr = calculadora.bmr(genero, edad, alturaM2, pesoKg2);

        System.out.printf("La persona con altura %.2f metros y %.2f kg tiene un BMR de %.2f.%n",
                alturaM2, pesoKg2 / 1000.0, bmr);
        System.out.printf("The person with height %.2f ft and %d lb has a BMR of %.2f.%n",
                altura, peso, bmr);

        return bmr;
    }
}
