package demo01;
//多个线程同时操作同一个对象
//买火车票的例子

//问题  多个线程操作同一个资源的情况下 线程不安全  数据紊乱
public class TestThread5 implements Runnable {
    private int ticketNums=10;
    @Override
    public void run(){
        while(true){
            if(ticketNums<0){
                break;
            }
            System.out.println(Thread.currentThread().getName()+"take ticket"+ticketNums+"p" );//Thread.currentThread().getName(获得当前线程的名字
       ticketNums--;
        }
    }

    public static void main(String[] args) {
        TestThread5 ticket=new TestThread5();
        new Thread(ticket,"xiaoming").start();
        new Thread(ticket,"xiaohong").start();
        new Thread(ticket,"huangniu").start();
    }
}
