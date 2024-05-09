package healthcalc;

import java.util.ArrayList;
import java.util.List;

public class HealthStatsProxy implements HealthStats {
    private HealthStatsImpl realSubject;
    private HealthCalc healthCalc;
    private List<Paciente> pacientes;

    public HealthStatsProxy() {
        realSubject = new HealthStatsImpl();
        healthCalc = HealthCalcImpl.getInstance();
        pacientes = new ArrayList<>();

    }

    @Override
    public float alturaMedia() {
        registrarUsoCalculadora();
        return realSubject.alturaMedia();
    }

    @Override
    public float pesoMedio() {
        registrarUsoCalculadora();
        return realSubject.pesoMedio();
    }

    @Override
    public float edadMedia() {
        registrarUsoCalculadora();
        return realSubject.edadMedia();
    }

    @Override
    public float bmrMedio() {
        registrarUsoCalculadora();
        return realSubject.bmrMedio();
    }

    @Override
    public int numSexoH() {
        registrarUsoCalculadora();
        return realSubject.numSexoH();
    }

    @Override
    public int numSexoM() {
        registrarUsoCalculadora();
        return realSubject.numSexoM();
    }

    @Override
    public int numTotalPacientes() {
        registrarUsoCalculadora();
        return realSubject.numTotalPacientes();
    }

    private int contadorLlamadas = 0;

    private void registrarUsoCalculadora() {
        contadorLlamadas++;
        System.out.println("La calculadora de salud ha sido utilizada " + contadorLlamadas + " veces.");
    }

    @Override
    public void agregarPaciente(Paciente paciente) {
        pacientes.add(paciente);
        realSubject.agregarPaciente(paciente);

    }
}