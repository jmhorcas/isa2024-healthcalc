package healthcalc;

public class HealthCalcAdapter implements HealthHospital {
    private HealthCalc healthCalc;

    public HealthCalcAdapter(HealthCalc healthCalc) {
        this.healthCalc = healthCalc;
    }

    @Override
    public double bmr(char gender, int age, float height, int weight) {
        try {
            return healthCalc.basalMetabolicRate(weight, (int) height, gender, age);
        } catch (Exception e) {
            e.printStackTrace();
            return 0.0;
        }
    }

    @Override
    public int pesoIdeal(char gender, float height) {
        try {
            return (int) healthCalc.idealWeight((int) height, gender);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
