package jikexueyuan;

import java.sql.Date;
import java.text.SimpleDateFormat;

public class classTest {

    public static void main(String[] args) {
    	 
        long timeStamp = 1531782000;//ֱ����ʱ���
        // long timeStamp = System.currentTimeMillis();  //��ȡ��ǰʱ���,Ҳ�����������Ѹ���һ������Ļ��Ǳ��˸����ʱ���(һ����long�͵�����)
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//�������Ҫת�ɺ��ʱ��ĸ�ʽ
        String sd = sdf.format(new Date(timeStamp));   // ʱ���ת����ʱ��
        System.out.println(sd);//��ӡ����Ҫ��ʱ��
    }

}
