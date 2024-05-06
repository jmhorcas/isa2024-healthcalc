package healthcalc;

public class HealthCalcApp {
    public static void main(String[] args) {
        HealthCalcImpl model = HealthCalcImpl.getInstance();
        HealthCalcView view = new HealthCalcView();
        HealthCalcController controller = new HealthCalcController(model, view);

        view.setVisible(true);
    }
}