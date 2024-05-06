package healthcalc;

public class mainPatronAdapter {
    public static void main(String[] args) {
        HealthCalc healthCalc = HealthCalcImpl.getInstance();
        HealthHospital adapter = new HealthCalcAdapter(healthCalc);

        double bmr = adapter.bmr('m', 20, 183.0f, 83);
        System.out.println("Basal Metabolic Rate (BMR): " + bmr);

        int pesoIdeal = adapter.pesoIdeal('m', 183.0f);
        System.out.println("Peso Ideal: " + pesoIdeal);
    }
}

