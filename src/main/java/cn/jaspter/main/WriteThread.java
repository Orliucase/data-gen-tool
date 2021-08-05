package cn.jaspter.main;

import cn.jaspter.MemberTemp;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class WriteThread extends Thread {

    private int threadIndex;
    private static String filePath="D:\\yuxin\\huarui\\造数工具\\data.dat";
    public WriteThread(int threadIndex) {
        this.threadIndex = threadIndex;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + "开始写文件");
        List<MemberTemp> list = new ArrayList<MemberTemp>();
        for (int m = 1; m <= 20; m++) {
            write(threadIndex, list);
            FileOutputStream fileOutputStream = null;
            try {
                fileOutputStream = new FileOutputStream(filePath,true);
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream,"UTF-8"));
                for(MemberTemp temp : list){
                    bufferedWriter.write(temp.write2String());
                }
                bufferedWriter.close();
                fileOutputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            list.clear();
            System.out.println(Thread.currentThread().getName()+"线程第"+m+"片写完成");
        }
        System.out.println(Thread.currentThread().getName()+"写文件结束");
    }

    public void write(int threadIndex, List<MemberTemp> list) {
        for (int n = 1; n <= 10000; n++) {
            MemberTemp memberTemp = new MemberTemp();
            memberTemp.setSerno(UUID.randomUUID().toString().replace("-", ""));
            memberTemp.setPartationId(String.valueOf(threadIndex));
            memberTemp.setFirstName("");
            memberTemp.setLastName(Thread.currentThread().getName());
            list.add(memberTemp);
        }
    }
}
