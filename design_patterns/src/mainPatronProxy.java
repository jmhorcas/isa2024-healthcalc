package healthcalc;

public class mainPatronProxy {

    public static void main(String[] args) {
        HealthCalc healthCalc = HealthCalcImpl.getInstance();
        HealthHospital adapter = new HealthCalcAdapter(healthCalc);
        HealthStatsProxy proxy = new HealthStatsProxy(adapter);

        int pesoIdealMujer = proxy.pesoIdeal('w', 1.65f);
        System.out.println("Peso ideal para mujer: " + pesoIdealMujer);

        double bmrMujer = proxy.bmr('w', 20, 1.59f, 55000);
        System.out.println("BMR para mujer: " + bmrMujer);

        int pesoIdealHombre = proxy.pesoIdeal('m', 1.83f);
        System.out.println("Peso ideal para hombre: " + pesoIdealHombre);

        double bmrHombre = proxy.bmr('m', 30, 1.80f, 75000);
        System.out.println("BMR para hombre: " + bmrHombre);

        System.out.println("Altura media: " + proxy.alturaMedia() + "metros");
        System.out.println("Peso medio: " + proxy.pesoMedio() + "gramos");
        System.out.println("Edad media: " + proxy.edadMedia());
        System.out.println("BMR medio: " + proxy.bmrMedio());
        System.out.println("Número de hombres: " + proxy.numSexoH());
        System.out.println("Número de mujeres: " + proxy.numSexoM());
        System.out.println("Número total de pacientes: " + proxy.numTotalPacientes());
    }
}
