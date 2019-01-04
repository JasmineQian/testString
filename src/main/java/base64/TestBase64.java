package base64;

import org.testng.annotations.Test;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class TestBase64 {


    @Test
    public void Test2() throws UnsupportedEncodingException {

        base64Util base = new base64Util();
        System.out.println(base.encode("Jasmine"));
        System.out.println(base.decode("aGVsbG8="));
        System.out.println(base.decode(base.encode("Jasmine")));
    }


    @Test
    public void Test3() throws UnsupportedEncodingException {

        base64Util base = new base64Util();
        System.out.println(base.encode("a"));
        System.out.println(base.decode("YQ=="));
        System.out.println(base.decode(base.encode("a")));
    }

    @Test
    public void Test4() throws UnsupportedEncodingException {

        base64Util base = new base64Util();
        String a = "NWx/vruji2wrs3EpBN4ja6OMQqAW8ed4HuK2c7BM4v5wEi28qSJLiAiVItAGlxsJKztIZYcQ+VgpBnAt2IvlWw6jTZxlu4Jw/wJI+jh2W//aB750p4NuIH/kpmBkwmBRhF3A9aGTFmpwPJbf49X+8CXEi64KKYa0UKdzpNHd8og=";
        String b = "B8466250D3FF208C6E26A7E8A85B3F6DE92C93F7479A0756E5B8FB3A75F30EE9598D05BFEA8DA4845E1F4E506F92F40686065E9F000E1D1B9EB7522855DFC4763626A32FBA4D625B1B063A54773016E4A4E1CBBD43674A19B91BE887DA3F41D0FECD31487CD6CB787E269AFFBF5B9746E18CE5F66E40E08466E5E5828AB29DDF";
        System.out.println(base.decode(a));
        System.out.println(base.decode(b));
    }


    @Test
    public void Test5() throws IOException {


        String a = "a";
        String b = "B8466250D3FF208C6E26A7E8A85B3F6DE92C93F7479A0756E5B8FB3A75F30EE9598D05BFEA8DA4845E1F4E506F92F40686065E9F000E1D1B9EB7522855DFC4763626A32FBA4D625B1B063A54773016E4A4E1CBBD43674A19B91BE887DA3F41D0FECD31487CD6CB787E269AFFBF5B9746E18CE5F66E40E08466E5E5828AB29DDF";
        String res = new sun.misc.BASE64Encoder().encode(a.getBytes("GBK"));
        System.out.println(res);

        byte[] decoder = new sun.misc.BASE64Decoder().decodeBuffer(b);
        String result = new String(decoder, "GBK");

        byte[] decoder2 = new sun.misc.BASE64Decoder().decodeBuffer(result);
        String result2 = new String(decoder2, "GBK");

        System.out.println(result2);
    }


    @Test
    public void Test6() throws IOException {

        String a = "哈哈";
        String b = "uf65/g==";

        String encode = new sun.misc.BASE64Encoder().encode(a.getBytes("GBK"));
        System.out.println(encode);

        byte[] decoder = new sun.misc.BASE64Decoder().decodeBuffer(b);
        String result = new String(decoder, "GBK");
        System.out.println(result);
    }


    @Test
    public void Test7() throws IOException {

        String a = "哈哈";
        String b = "B8466250D3FF208C6E26A7E8A85B3F6DE92C93F7479A0756E5B8FB3A75F30EE9598D05BFEA8DA4845E1F4E506F92F40686065E9F000E1D1B9EB7522855DFC4763626A32FBA4D625B1B063A54773016E4A4E1CBBD43674A19B91BE887DA3F41D0FECD31487CD6CB787E269AFFBF5B9746E18CE5F66E40E08466E5E5828AB29DDF";

        BASE64Encoder encoder = new BASE64Encoder();
        String content = new String(encoder.encodeBuffer(a.getBytes("UTF-8")));

        BASE64Decoder decoder = new BASE64Decoder();

        String content2 = new String(decoder.decodeBuffer(b), "UTF-8");

        System.out.println(content);
        System.out.println(content2);

    }
}
