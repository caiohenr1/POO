package Aula04;

public class Caneta {

    public String modelo;
    private double ponta;

    private boolean tampada = false;

    public Caneta(String modelo, double ponta, boolean tampada) {
        this.modelo = modelo;
        this.ponta = ponta;
        this.tampada = tampada;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPonta() {
        return this.ponta;
    }

    public void setPonta(double ponta) {
        this.ponta = ponta;
    }

    public void status() {
        System.out.println(String.format("""
                MODELO: %s
                PONTA: %.1f
                TAMPADA ? : %b
                """, getModelo(), getPonta(), isTampada()));
    }



}
