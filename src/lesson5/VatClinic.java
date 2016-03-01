package lesson5;

import java.util.Arrays;

/**
 * Created by User on 26.02.2016.
 */
public class VatClinic {
    public static void main(String[] args) {

        Cat catTom = new Cat("Tom", "Blue", 2015);
       /*catTom.init("Tom","Blue",2015);
         catTom.color = "Blue";
         catTom.name = "Tom";
         catTom.birthYear = 2015;
         catTom.vaccines = new String[10];
       */
        catTom.vaccinate("SACC");


      // catTom.birthYear=2014;
       // System.out.println(catTom.birthYear);
        System.out.println(catTom.getBirthYear());
        String name=catTom.getName();
        name.replace('T', 'K');
        System.out.println(name);
        String newName=name.replace('T', 'K');
        System.out.println(newName);





        /* catTom.vaccines[0] = "ASCC";
         vaccinate(catTom);
         System.out.println(Arrays.toString(catTom.vaccines));



    public static void vaccinate(Cat cat){
        cat.vaccines[cat.vaccineCount]="SACC";
        // нельзя так делать  cat.vaccines[cat.vaccineCount++]="SACC";
       cat.vaccineCount++;

    }
    */
}
    }