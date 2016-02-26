package lesson5;

public class RectangleExample {
    public static void main(String[] args) {
        Rectangle firstRectangle = new Rectangle();

        firstRectangle.height = 2;
        firstRectangle.with = 3;
        firstRectangle.color = "red";
        int w = firstRectangle.with;
        //в calculateArea создали метод calculateArea  берет значение ретурн ширина умножить на длину
        int a = firstRectangle.calculateArea();

        System.out.println(firstRectangle.height);
        System.out.println(firstRectangle.color);


        Rectangle secondRectangle = new Rectangle();
        secondRectangle.height = 5;
        secondRectangle.with = 10;
        secondRectangle.area=50;
       //secondRectangle.color = "Blue";
        System.out.println("rectangle is colo r=" + secondRectangle.color);


        int firstRectangleWith = 3;
        int firstRectangleHeight = 4;
        int secondRectangleWith = 5;
        int secondRectangleHeight = 10;
        //умножили высата одного  прямоугольника на ширину другого прямоугольника это е коректно !! ошибка
        int area = calculateArea(firstRectangleHeight, secondRectangleWith);
        //вычсление первого прямоугольника и теперь в ареан будет 20 а будет 6
        area = calculateArea(firstRectangle);
//вывод 6
        System.out.println(area);


        Rectangle thirdRectangle = null;
       // thirdRectangle.calculateArea();
        firstRectangle.with=4;

    }

    public static int calculateArea(int height, int with) {
        return height * with;
    }

    public static int calculateArea(Rectangle rectangle) {
        return rectangle.height * rectangle.with;
    }

}
