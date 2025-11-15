class DiaTemperatura {
    private String diaSemana;
    private double temperatura;

    public DiaTemperatura(String diaSemana, double temperatura) {
        this.diaSemana = diaSemana;
        this.temperatura = temperatura;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public double getTemperatura() {
        return temperatura;
    }
}