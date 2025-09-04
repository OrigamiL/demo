public class ElectricalCar extends Car{
    private Integer energy;
    private String type;

    public ElectricalCar(){
        //super();
        this.type="用电驱动的";
    }

    public ElectricalCar(String color,String brand,int energy){
        super(color,brand);
        this.energy = energy;
        this.type="用电驱动的";
    }

    @Override
    public String getColor(){
        return super.getColor();
    }

    public String getType(){
        return this.type;
    }
    public void setEnergy(int energy){
        this.energy = energy;
    }
    public int getEnergy(){
        return this.energy;
    }
    //定义方法 提供有限的访问

    public void print(){
        System.out.println("打印  public");
    }

    protected void print1(){
        System.out.println("打印 protected");
    }

    void print2(){
        System.out.println("打印 默认");
    }

    private void print3(){
        System.out.println("打印 private");
    }

    @Override
    public void run(){
        System.out.println("功率是500w");
    }

}



