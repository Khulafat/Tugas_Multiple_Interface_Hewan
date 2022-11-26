package Hewan;

/**
 *
 * @author HP
 */
public class Sapi implements IHewanHerbivora{

    @Override
    public void MemakanTumbuhan() {
        System.out.println("Memakan Rumput");
    }

    @Override
    public void Graham() {
        System.out.println("Memiliki Gigi Graham");
    }
}
