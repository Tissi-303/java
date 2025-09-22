    public class Cliente {

    private String nome;
    private String rg;
    private String num;
    private String end;
    private Double peso, alt;
    private Double IMC;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAlt() {
        return alt;
    }

    public void setAlt(Double alt) {
        this.alt = alt;
    }

    public Double getIMC() {
        return IMC;
    }

    public void setIMC(Double IMC) {
        this.IMC = IMC;
    }

    public void calc(){
        IMC = (peso / (alt*alt));

    }

}
