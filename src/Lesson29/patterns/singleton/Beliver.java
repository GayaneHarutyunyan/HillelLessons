package Lesson29.patterns.singleton;

/**
 * Created by User on 03.06.2016.
 */
public class Beliver {


    //статиный метод всегда ставитая наверху
    static God god;
    String name;

//так деаеть нельзя
    /*
    public Beliver(God newGod) {

        god = newGod;
    }
*/
    @Override
    public String toString() {
        return "my name is " + name + " I believe in " + god.getName();
    }
}
