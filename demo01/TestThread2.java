package demo01;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class TestThread2 extends Thread{
    private String url;
    private String name;
    public TestThread2(String url,String name){
        this.url=url;
        this.name=name;
    }
    @Override
    public void run(){
        WebDownloader webd= new WebDownloader();
        webd.downloader("","1");
        System.out.println("downloader name is :"+name);
    }

    public static void main(String[] args) {
        TestThread2 t1=new TestThread2("https://github.com/fluidicon.png","1");
        TestThread2 t2= new TestThread2("https://pic3.zhimg.com/v2-3b218b9a4edc645bd14c7f059e59d091_im.jpg?","2");

        t1.start();
        t2.start();

    }
}

class WebDownloader{

    public void downloader(String url,String name){
        try{
            FileUtils.copyURLToFile(new URL(url),new File(name));
        }catch(IOException e){
            e.printStackTrace();
            System.out.println("IO异常 方法出现问题");
        }
    }

}
