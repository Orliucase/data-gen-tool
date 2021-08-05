package cn.jaspter.main;

public class GenerDataMain {
    public static void main(String[] args) {
        for(int i=1;i<11;i++){
            WriteThread writeThread = new WriteThread(i);
            writeThread.start();
            System.out.println(writeThread.getName()+"启动");
        }
    }
}
