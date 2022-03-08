package demo01;
//创建线程的第二种方式  实现 runable  重写run   执行线程需要丢如runabel借口实现类 调用 start方法
public class TestThread3 implements Runnable{
    @Override
    public void run(){
        for(int i=0;i<200;i++){
            System.out.println("look code"+i);
        }
    }

    public static void main(String[] args) {
        //创建runnbale接口的实现类对象
        TestThread3 testThread3=new TestThread3();
        //创建线程对象  通过线程对象来开启我们的线程 代理
//        Thread thread = new Thread(testThread3);
//        thread.start(); 第17行是简化版本的代码
        new Thread(testThread3).start();//传入了一个对象  丢进了start
        for (int i=0;i<1000;i++){
            System.out.println("learning "+i);
        }
    }
}
