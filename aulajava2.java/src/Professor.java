public final class Professor extends Pessoa{
    public Cargo cargo;

    public Cargo getCargo() {
        return cargo;
    }

    public void setCargo(Cargo cargo) {
        this.cargo = cargo;
    }

    @Override
    public void quemSouEu() {
        System.out.println("Eu sou o professor!");

    }

    @Override
    public void minhaAtividade() {

    }

    public Professor() {
    }

    public Professor(String nome) {
        super(nome);
    }
}