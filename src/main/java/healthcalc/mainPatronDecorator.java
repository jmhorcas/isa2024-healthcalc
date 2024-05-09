package healthcalc;

public class mainPatronDecorator {

    public static void main(String[] args) {
        HealthCalc healthCalc = HealthCalcImpl.getInstance();
        HealthHospital adapter = new HealthCalcAdapter(healthCalc);
        HealthStatsProxy proxy = new HealthStatsProxy(adapter);
        HealthHospital calcEuropea = new decoradorEuropeo(proxy);
        HealthHospital calcAmericana = new decoradorAmericano(proxy);


        calcEuropea.bmr('w', 30, 1.65f, 62000);
        calcAmericana.bmr('m', 35, 5.9f, 170);

        int pesoIdealM = calcEuropea.pesoIdeal('w', 1.65f);
        int pesoIdealH = calcAmericana.pesoIdeal('m', 5.9f);

        System.out.println("Peso ideal para mujer (versión europea): " + pesoIdealM);
        System.out.println("Peso ideal para hombre (versión americana): " + pesoIdealH);

        System.out.println("Altura media: " + proxy.alturaMedia() + "metros");
        System.out.println("Peso medio: " + proxy.pesoMedio() + "gramos");
        System.out.println("Edad media: " + proxy.edadMedia());
        System.out.println("BMR medio: " + proxy.bmrMedio());
        System.out.println("Número de hombres: " + proxy.numSexoH());
        System.out.println("Número de mujeres: " + proxy.numSexoM());
        System.out.println("Número total de pacientes: " + proxy.numTotalPacientes());
    }
}
