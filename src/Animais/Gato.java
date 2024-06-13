package Animais;

public class Gato extends Animal {

    static int numeroDeGatos;

    public Gato(String cor, String nome, double peso) {
        super(cor, nome, peso);
    }

    @Override
    public String toString() {
        return "Gato{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public void soar() {
        System.out.println("Miau");
    }
}
