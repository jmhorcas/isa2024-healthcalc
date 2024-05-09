package healthcalc;

public class mainPatronProxy {
    public static void main(String[] args) {
        // Crear una instancia del proxy HealthStatsProxy
        HealthStatsProxy proxy = new HealthStatsProxy();

        // Crear pacientes de prueba y agregarlos al proxy
        Paciente paciente1 = new Paciente(170, 70, 30, 'm');
        Paciente paciente2 = new Paciente(160, 65, 25, 'w');

        proxy.agregarPaciente(paciente1);
        proxy.agregarPaciente(paciente2);

        // Ejemplo de cálculo de estadísticas
        System.out.println("Altura media de los pacientes: " + proxy.alturaMedia());
        System.out.println("Peso medio de los pacientes: " + proxy.pesoMedio());
        System.out.println("Edad media de los pacientes: " + proxy.edadMedia());
        System.out.println("BMR medio de los pacientes: " + proxy.bmrMedio());
        System.out.println("Número total de pacientes: " + proxy.numTotalPacientes());
        System.out.println("Número de pacientes de sexo masculino: " + proxy.numSexoH());
        System.out.println("Número de pacientes de sexo femenino: " + proxy.numSexoM());
    }
}
