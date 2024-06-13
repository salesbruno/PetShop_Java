package Animais;

public class Passaro extends Animal {

    static int numeroDePassaros;


    public Passaro(String cor, String nome, double peso) {
        super(cor, nome, peso);
    }

    @Override
    public void soar() {
        System.out.println("PI PIU");
    }
}
