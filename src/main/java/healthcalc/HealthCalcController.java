package healthcalc;

import healthcalc.HealthCalc;

public class HealthCalcController {
    private HealthCalc model;
    private HealthCalcView view;

    public HealthCalcController(HealthCalc model, HealthCalcView view) {
        this.model = model;
        this.view = view;

        view.getCalcularPesoIdealBtn().addActionListener(e -> {
            try {
                int altura = Integer.parseInt(view.getAlturaTB().getText());
                char genero = view.getGeneroTB().getText().charAt(0);
                float resultado = model.idealWeight(altura, genero);
                view.getResultadoTB().setText("El peso ideal es: " + resultado);
            } catch (NumberFormatException ex) {
                view.getResultadoTB().setText("Por favor, ingresa valores válidos en las cajas de texto.");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        view.getCalcularBMRBtn().addActionListener(e -> {
            try {
                float peso = Float.parseFloat(view.getPesoTB().getText());
                int altura = Integer.parseInt(view.getAlturaTB().getText());
                char genero = view.getGeneroTB().getText().charAt(0);
                int edad = Integer.parseInt(view.getEdadTB().getText());
                float resultado = model.basalMetabolicRate(peso, altura, genero, edad);
                view.getResultadoTB().setText("El BMR es: " + resultado);
            } catch (NumberFormatException ex) {
                view.getResultadoTB().setText("Por favor, ingresa valores válidos en las cajas de texto.");
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        });

        view.getBorrarBtn().addActionListener(e -> {
            view.getPesoTB().setText("");
            view.getAlturaTB().setText("");
            view.getGeneroTB().setText("");
            view.getEdadTB().setText("");
            view.getResultadoTB().setText("");
        });
    }
}