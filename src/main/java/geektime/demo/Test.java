package geektime.demo;

import java.util.function.Consumer;

public class Test {
        public static void main(String[] args) {
            Runnable rm = new Runnable() {
                @Override
                public void run() {
                    System.out.println("asdahsd");
                }
            };
            rm.run();
            MyNum myNum =()-> {
        System.out.println("asd");
        return 9; };
        System.out.println(myNum.getValue());
        System.out.println("sadasdas");
        Consumer<String> su = (x)-> System.out.println(x);
        su.accept("我");
    }
}
