package base64;

import org.testng.annotations.Test;

import static java.lang.Integer.parseInt;

public class Test123 {

    @Test
    public void Test() {

        char a = 'H';
        char b = 'e';
        char c = 'l';
        char d = 'l';
        char e = 'o';
        char f = '!';

        System.out.println((byte) a);
        System.out.println((byte) b);
        System.out.println((byte) c);
        System.out.println((byte) d);
        System.out.println((byte) e);
        System.out.println((byte) f);

        int numasc = parseInt("72", 2);
        System.out.println((char) numasc);

    }


    @Test
    public void Test2() {

        String base64Code = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
        String abc = "Jasmine";
        char[] chars = abc.toCharArray();
        System.out.println(chars);//char
        System.out.println(chars.toString());//char 2 String
        System.out.println("chars is"+chars);//char 2! String
        String Binary =null;
        //将字符串转化为字符数组
        StringBuilder asciiBinStrA = new StringBuilder();
        StringBuilder asciiBinStrB = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
            System.out.println("第"+(i+1)+"个数对应的ASCII码十进制是："+(byte) chars[i]);
            Binary = Integer.toBinaryString(chars[i]);
            while (Binary.length()<8){
                Binary="0"+Binary;
            }

            asciiBinStrB.append(Integer.toBinaryString(chars[i]));
            asciiBinStrA.append(Binary);
            //将字符数组中每一个字符转化为ascii值
        }
        System.out.println(asciiBinStrA);
        System.out.println(asciiBinStrB);
        if(asciiBinStrA.length()%6==1)
            asciiBinStrA.append("00000");
                else if(asciiBinStrA.length()%6==2)
            asciiBinStrA.append("0000");
        else if(asciiBinStrA.length()%6==3)
            asciiBinStrA.append("000");
        else if(asciiBinStrA.length()%6==4)
            asciiBinStrA.append("00");
        else if(asciiBinStrA.length()%6==5)
            asciiBinStrA.append("0");
        else asciiBinStrA=asciiBinStrA;
        System.out.println(asciiBinStrA.length());
        System.out.println(asciiBinStrA);

        char[] codeCh = new char[asciiBinStrA.length() / 6];

        String bbb = String.valueOf(asciiBinStrA);
        System.out.println(bbb);
        System.out.println(asciiBinStrA);

        int index = 0;
        for (int i = 0; i < codeCh.length; i++) {
            index = parseInt(bbb.substring(0, 6), 2);
            System.out.println("第"+(i+1)+"ge index是："+(int) index);
            bbb = bbb.substring(6);
            codeCh[i] = base64Code.charAt(index);
            System.out.println("第"+(i+1)+"："+codeCh[i]);}
        System.out.println(codeCh);
        StringBuilder code = new StringBuilder(String.valueOf(codeCh));

        while(code.length()%3!=0)
            code.append("=");
            System.out.println(code.toString());
    }

    @Test
    public void test3(){
        //将2进制字符串，每6位进行截取，再将截取后的2进制字符串，换算成10进制的
        String aaa = "010010100110000101110011011011010110100101101110011001010000";
        String bbb=aaa.substring(0, 6);
        System.out.println(Integer.toBinaryString(72));
        aaa=aaa.substring(6);
        //aaa=aaa.substring(6);
        System.out.println(bbb);
        System.out.println(aaa);
        int ccc= parseInt("010010",2);
        System.out.println(ccc);



    }

}
