package lesson9.polymorfism.abstraction;

/**
 * Created by User on 11.03.2016.
 */
public class AbstractionMain {
    public static void main(String[] args) {
        Auto auto = new Lada(1995);
        System.out.println(auto);

        Repairable repairable = new Lada(1999);
        //repair((Lada) aoto))
        repair((Repairable)auto);
    }

    public static void repair(Repairable toRepair) {
        toRepair.repair();
    }
}
