import java.io.*;

public class copyFloder {
    public static void main(String[] args) throws Exception{
        InputStream in = new FileInputStream("src//test.txt");
        OutputStream out = new FileOutputStream("target//test.txt");
        int len;

        long begintime = System.currentTimeMillis();
        while((len=in.read())!=-1){
            out.write(len);
        }
        long endtime = System.currentTimeMillis();
        System.out.println("copy floder spent:"+(endtime-begintime)+"s");
    }
}
