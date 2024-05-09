package healthcalc;

public class Paciente {
    private float altura;
    private float peso;
    private int edad;
    private char genero;

    public Paciente(float altura, float peso, int edad, char genero) {
        this.altura = altura;
        this.peso = peso;
        this.edad = edad;
        this.genero = genero;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public float calcularBMR() throws Exception {
        HealthCalc healthCalc = HealthCalcImpl.getInstance();
        return healthCalc.basalMetabolicRate(peso, (int) altura, genero, edad);
    }
}