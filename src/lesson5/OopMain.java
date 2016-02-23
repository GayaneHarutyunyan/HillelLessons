package lesson5;
public class OopMain {
    public static void main(String[] args) {
      // passPrimitives();
      // passObjects();
      // passlmmutableObjecs();
      // equalsExample();

        Human i=new Human();
        System.out.println("hands "+ Human.handsAmout);
        Human.handsAmout=1;
        System.out.println("hands "+Human.handsAmout);
        i.handsAmout=2;
        System.out.println(Human.handsAmout);
        i.name=" Gay ";
        System.out.println("My name is "+i.name);
        Human you=new Human();
        you.name=" Gay 2";
        System.out.println("Your name is "+you.name);
        System.out.println("We are == "+ (i==you));
        System.out.println("we are equals "+ i.equals(you));
        System.out.println("Names are == "+(i.name==you.name));
        System.out.println("Names are == "+i.name.equals(you.name));
        System.out.println(Human.sayhello());
        System.out.println(i.introduece()+" ");
        System.out.println(you.introduece());

    }

    private static void equalsExample() {
        Integer a=33;
        Integer b=10;
        System.out.println("== "+( a==b));
        boolean aEqualsB=a.equals(b);
        System.out.println("equals " +aEqualsB);
    }
    private static void passlmmutableObjecs() {
        Integer i=10;
        modifyInteger(i);
        System.out.println(i);
    }
    public static void modifyInteger(Integer i) {

       i=new Integer(12);
    }
    private static void passObjects() {
        int[] ints= new int[3];

        Utils.printArray(ints);
        modifyArray(ints);
        Utils.printArray(ints);
    }
    private static void passPrimitives() {
        int a=10;
        print(a);
        System.out.println("after " +a);
    }
    public static void print(int a){
        System.out.println(a);
        a=3;
    }
    public static void modifyArray(int[] array) {
        array[0]=10;
        array[1]=20;
    }
}
