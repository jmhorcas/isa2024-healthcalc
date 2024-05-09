package healthcalc;

import java.util.ArrayList;
import java.util.List;

public interface HealthStats {
    float alturaMedia();
    float pesoMedio();
    float edadMedia();
    float bmrMedio();
    int numSexoH();
    int numSexoM();
    int numTotalPacientes();
}
