package lesson5;

/**
 * Created by User on 26.02.2016.
 */
public class Rectangle {
    //статистически эллемент принадлежит всем классам и будет менятся
    static int sides = 4;
     private  int with;
     private int height;
    private   int area;
    String color;
public Rectangle (){}
    public int calculateArea() {
        return with * height;
    }

    public void changesidesconunt() {
        sides = sides + 1;
    }

    public void stetHeight(int height) {
        this.height = height;
        area=height*with;

    }

    public void stetWith(int with) {
        this.with = with;
        area=height*with;
    }

public String toString(){
    String result="Rectangle(a= "+with+", b= "+height+")";
    return result;
}
public Rectangle(int with, int height){
    this.with=with;
    this.height=height;
}
   /* public boolean equals(Rectangle first,Rectangle second){
        return first.with==second.with&&first.height==first.height;
    }
    */
   public boolean equals(Rectangle other){
       //Если моя длинна ровна твоей и мой висота тоже ровна твоей то мы равны !!
   return  with==other.with&&height==other.height;
   }
}