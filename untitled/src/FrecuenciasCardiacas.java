public class FrecuenciasCardiacas {
    private String nombre;
    private String apellido;
    private int diaNacimiento;
    private int mesNacimiento;
    private int anioNacimiento;

    public FrecuenciasCardiacas(String nombre, String apellido, int dia, int mes, int anio) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.diaNacimiento = dia;
        this.mesNacimiento = mes;
        this.anioNacimiento = anio;
    }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setApellido(String apellido) { this.apellido = apellido; }
    public void setDiaNacimiento(int dia) { this.diaNacimiento = dia; }
    public void setMesNacimiento(int mes) { this.mesNacimiento = mes; }
    public void setAnioNacimiento(int anio) { this.anioNacimiento = anio; }

    public String getNombre() { return nombre; }
    public String getApellido() { return apellido; }
    public int getDiaNacimiento() { return diaNacimiento; }
    public int getMesNacimiento() { return mesNacimiento; }
    public int getAnioNacimiento() { return anioNacimiento; }

    public int calcularEdad() {
        return 2026 - anioNacimiento;
    }

    public int calcularFrecuenciaMaxima() {
        return 220 - calcularEdad();
    }

    public String calcularFrecuenciaEsperada() {
        int maxima = calcularFrecuenciaMaxima();
        return String.format("%.0f - %.0f pulsos por minuto", (maxima * 0.50), (maxima * 0.85));
    }
}