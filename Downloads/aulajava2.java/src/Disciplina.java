public class Disciplina {

    private String nome;
    private Professor p;
    private Aluno c;

    public Disciplina(String nome) {
        this.nome = nome;

    }

    public Professor getP() {
        return p;
    }

    public void setP(Professor p) {
        this.p = p;
    }

    public Aluno getC() {
        return c;
    }

    public void setC(Aluno c) {
        this.c = c;
    }

    public void associar(Professor p){
        this.p = p;
    }
    public void mostrarDiciplina(){
        System.out.println(p.getNome() + "ministrar"+ nome);
    }
}