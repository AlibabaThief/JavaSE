package demo01;
//模拟龟兔赛跑



public class Race  implements  Runnable{
    private static String winner;
    @Override
    public void run() {
        for(int i=0;i<=100;i++){
            //模拟兔子休息
            if(Thread.currentThread().getName().equals("rabbit")&&i%10==0){
                try {
                    Thread.sleep(50);
                }catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
            //判断比赛是否结束
            boolean flag = gameover(i);
            if(flag)break;

            System.out.println(Thread.currentThread().getName()+"run" +i+"bu");
        }

    }
    private boolean gameover(int steps){
        //判断是否有胜利者
        if(winner!=null){
            return true;
        }else
        {
            if(steps==100){
                winner=Thread.currentThread().getName();
                System.out.println("winner is"+ winner);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Race race = new Race();
        new Thread(race,"rabbit").start();
        new Thread(race,"wugui").start();
    }
}
