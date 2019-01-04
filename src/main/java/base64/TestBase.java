package base64;

import org.testng.annotations.Test;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;

public class TestBase {

    String base64Code = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/";
    String aaa = "SmFzbWluZQ==";


    @Test
    public void Test() {
        System.out.println(aaa);
        aaa = aaa.replaceAll("\r\n", "");
        aaa = aaa.replaceAll("=", "");
        System.out.println(aaa);

        String indexBin = null;
        char[] srcStrCh = aaa.toCharArray();
        System.out.println(base64Code.indexOf(2));

        for (int i = 0; i < srcStrCh.length; i++) {
            System.out.println("第" + (i + 1) + "个数base64：" + srcStrCh[i]);
            System.out.println("第" + (i + 1) + "个数base64：" + (int)srcStrCh[i]);
            indexBin = Integer.toBinaryString(base64Code.indexOf((int) srcStrCh[i]));
            System.out.println("第" + (i + 1) + "个数对应的ASCII码十进制是：" + indexBin);
            base64Code.indexOf(2);

        }

    }

}
