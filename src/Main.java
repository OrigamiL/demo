import java.util.*;

public class Main {
    public static void main(String[] args) {
       /* ElectricalCar electricalCar = new ElectricalCar("red","mi",1000);
        electricalCar.carry();*/
        // electricalCar.run();
        //隐藏对象的属性和实现细节，仅对外公开接口，控制在程序中属性的读和修改的访问级别；
        // list();
        try {
            System.out.println(compute(12, 0));
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("??");
        }
        System.out.println("要121212");
    }

    public static void list() {
        //集合  Collection    Map  遍历
        //collection下有List接口 迭代器
        Collection coll = new ArrayList<>();
        List<String> list1 = new LinkedList<>();
        list1.add("1");
        list1.add("2");
        list1.add("3");
        Iterator<String> iterator = list1.iterator();//拿到list的迭代器
        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.println(str);
        }//解耦
        list1.add("4");
        String s = list1.get(1);
        for (String str :
                list1) {
            System.out.println(str);
        }
        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }
        //new A()赋值进去了
        System.out.println(/*A.toString()*/);
    }

    //抛异常
    public static int xxService(int a, int b) {
        AA = AList.get(0)
        boolean result = xxMapper.insert(A);
        System.out.println("++++++++++++++++++++++"+result);

        //return Either;
        when() {
            for (

            )
        }
    }
}
