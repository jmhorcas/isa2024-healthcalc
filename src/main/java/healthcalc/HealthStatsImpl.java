package healthcalc;

import java.util.ArrayList;
import java.util.List;

public class HealthStatsImpl implements HealthStats {
    private List<Paciente> pacientes;

    public HealthStatsImpl() {
        pacientes = new ArrayList<>();
    }

    public void agregarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    @Override
    public float alturaMedia() {
        if (pacientes.isEmpty()) {
            return 0;
        }
        float sumaAlturas = 0;
        for (Paciente paciente : pacientes) {
            sumaAlturas += paciente.getAltura();
        }
        return sumaAlturas / pacientes.size();
    }

    @Override
    public float pesoMedio() {
        if (pacientes.isEmpty()) {
            return 0;
        }
        float sumaPesos = 0;
        for (Paciente paciente : pacientes) {
            sumaPesos += paciente.getPeso();
        }
        return sumaPesos / pacientes.size();
    }

    @Override
    public float edadMedia() {
        if (pacientes.isEmpty()) {
            return 0;
        }
        float sumaEdades = 0;
        for (Paciente paciente : pacientes) {
            sumaEdades += paciente.getEdad();
        }
        return sumaEdades / pacientes.size();
    }

    @Override
    public float bmrMedio() {
        if (pacientes.isEmpty()) {
            return 0;
        }
        float sumaBMRs = 0;
        for (Paciente paciente : pacientes) {
            try {
                sumaBMRs += paciente.calcularBMR();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return sumaBMRs / pacientes.size();
    }

    @Override
    public int numSexoH() {
        int count = 0;
        for (Paciente paciente : pacientes) {
            if (paciente.getGenero() == 'm') {
                count++;
            }
        }
        return count;
    }

    @Override
    public int numSexoM() {
        int count = 0;
        for (Paciente paciente : pacientes) {
            if (paciente.getGenero() == 'w') {
                count++;
            }
        }
        return count;
    }

    @Override
    public int numTotalPacientes() {
        return pacientes.size();
    }
}

