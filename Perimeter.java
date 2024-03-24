
public class Perimeter {
  public static void main(String[] args) {
    // perimeter of rectangle
    // area = l * b
    // perimeter = l + b + l+b = 2l + 2b = 2(l+b)
    int l = 10;
    int b = 8;
    System.out.println("Perimeter of the rectangel :" + 2 * (l + b));// 36
    // area of Triangle = 0.5 * b * h
    int h = 12;
    System.out.println("area of Triangle : " + 0.5 * b * h);// 48
    // simple interest = ptr/100
    int p = 2000, t = 2, r = 10;
    System.out.println("simple interest : " + (p * t * r) / 100);// 400
    System.out.println("compound interest : " + p * Math.pow((1 + r / 100), t));
    float F = 34.5f;
    System.out.println("fahrenheit to celsius °C: " + (F - 32) * 5 / 9);
  }
}
