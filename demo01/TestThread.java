package demo01;

public class TestThread extends Thread {
//  创建 线程方式 继承Thread 类 重写run方法，调用thread.start()
    @Override
    public void run() {
        //run方法
        for (int i = 0; i < 20; i++) {
            System.out.println("look code" + i);
        }
    }

    public static void main(String[] args) {
        //main主线程

        TestThread testthread1 = new TestThread();//创建一个县城对象
        testthread1.start();
        for (int i = 0; i < 20; i++) {
            System.out.println("learning " + i);
        }
    }
}
