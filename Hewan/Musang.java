package Hewan;

/**
 *
 * @author HP
 */
public class Musang implements IHewanHerbivora, IHewanCarnivora{

    @Override
    public void MemakanTumbuhan() {
        System.out.println("Memakan Buah-buahan");
    }

    @Override
    public void Graham() {
        System.out.println("Memiliki gigi Graham");
    }

    @Override
    public void MemakanDaging() {
        System.out.println("Memakan Daging");
    }

    @Override
    public void Taring() {
        System.out.println("Memiliki Gigi Taring");
    }
    
}
