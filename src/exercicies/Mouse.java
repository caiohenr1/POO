package exercicies;

public class Mouse {

    private String modelo;
    private String marca;
    private String cor;
    private int botoes;

    public Mouse(String modelo, String marca, String cor, int botoes) {
        this.modelo = modelo;
        this.marca = marca;
        this.cor = cor;
        this.botoes = botoes;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getBotoes() {
        return botoes;
    }

    public void setBotoes(int botoes) {
        this.botoes = botoes;
    }

    public void Status() {
        System.out.println(String.format("""
                MODELO: %s
                MARCA: %s
                BOTOES: %.0f
                COR: %s
                """, getModelo(), getMarca(), getBotoes(), getCor()));
    }
}
