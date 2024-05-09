package healthcalc;

public class HealthCalcAdapter implements HealthHospital {
    private HealthCalc healthCalc;

    public HealthCalcAdapter(HealthCalc healthCalc) {
        this.healthCalc = healthCalc;
    }

    @Override
    public double bmr(char gender, int age, float height, int weight) {
        try {
            float peso = weight/1000;
            float altura = height * 100;
            return healthCalc.basalMetabolicRate(peso, (int)altura, gender, age);
        } catch (Exception e) {
            e.printStackTrace();
            return 0.0;
        }
    }

    @Override
    public int pesoIdeal(char gender, float height) {
        try {
            float altura = height * 100;
            return (int)healthCalc.idealWeight((int)altura, gender);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }
}
