package healthcalc;

public class mainPatronAdapter {
    public static void main(String[] args) {
        HealthCalc healthCalc = HealthCalcImpl.getInstance();
        HealthHospital adapter = new HealthCalcAdapter(healthCalc);

        double bmr = adapter.bmr('m', 20, 1.83f, 83000);
        System.out.println("Basal Metabolic Rate (BMR): " + bmr);

        int pesoIdeal = adapter.pesoIdeal('m', 1.83f);
        System.out.println("Peso Ideal: " + pesoIdeal);
    }
}

