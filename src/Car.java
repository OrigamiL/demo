import java.util.Objects;

public class Car {
    private String color;
    private String brand;
    String abc;

    public Car(){
        this.color = "yellow";
        this.abc = "abc";
    }
    public Car(String c, String b){
        this.color = c;
        this.brand = b;
    }
    public void run(){
        System.out.println(brand+"牌的，"+color+"颜色的小汽车启动！");
    }
    public void loading(int num){
        System.out.println("小汽车装了"+num+"kg东西！");
    }
    public void carry(int num){
        System.out.println("小汽车载了"+num+"个人！");
    }
    public void carry(){
        System.out.println("小汽车载了1个人");
    }
    public void addEnergy(){

    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}