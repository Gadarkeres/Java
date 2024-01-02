package entities;

public class Triangle {
       public float a;
    public float b;
    public float c;

  
    public float calculateArea() {
        float p = (a + b + c) / 2.0f;
        return (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
