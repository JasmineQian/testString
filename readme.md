
String类常用方法
创建实例：
String str = new String();
str = "String";

先来几个简单的热热身：

1. str.getClass()  //返回对象的类型
2. str.substring(int beginIndex, int endIndex)  //返回第beginIndex开始到endIndex结束的字符串
str.substring(0, N) 
str.substring(1, N) 是不一样的，第一位不包含在里面，可以理解为左闭右包

3.	str.length()  //返回字符串的长度

4. 



1、 char charAt(int index)：返回指定索引位置的字符，从0开始，到长度-1
　　

1 　　System.out.println(str.charAt(0));
2 　　//return "S";
 

2、String substring(int beginIndex)：返回指定起始位置至字符串末尾的字符串
　　

1 　　System.out.println(str.substring(1));
2 　　//return "tring";
 

     String substring(int beginIndex, int endIndex)：返回指定起始位置（含）到结束位置（不含）之间的字符串
　   

1 　　System.out.println(str.substring(1, 3));
2 　　//return "tr";
 

3、int indexOf(String str)：返回指定字符串的索引位置
　　

1 　　System.out.println(str.indexOf("i"));
2 　　//return "3";
3 
4 　　System.out.println(str.indexOf("ing"));
5 　　//return "3";
 

　 int indexOf(String str, int fromIndex)：返回从指定索引位置fromIndex开始的str的索引位置,如果没有返回-1

　　

1 　　System.out.println(str.indexOf("ing", 2));
2 　　//return "3";
 

4、String replace(CharSequence oldString, CharSequence newString): 用newString替换字符串中的oldString
　　

1 　　System.out.println(str.replace("g", "gs"));
2 　　//return "Strings";
 

5、String trim()：返回一个去除两头空格的新字符串
复制代码
1 　　String str1 = new String();
2 　　str1 =  " "+"string"+" ";
3 　　System.out.println(str1.length());
4 　　//return "8"
5 　　str1 = str1.trim();
6 　　System.out.println(str.length());
7 　　//return "6"
复制代码
 

6、String[ ] split(String regex)：指定正则表达式分隔符，返回一个字符串数组
复制代码
1 　　String str2 = new String();
2 　　str2 = "A/B/C";
3 　　String s[] = str2.split("/");
4 　　System.out.println("s[0] = "+s[0]);
5 　　//return"A"
6 　　for(String ss: s) {
7 　　System.out.print(ss+" ");
8 　　}
9 　　//return"A B C"
复制代码
 

　String[ ] split(String regex, int limit)：指定正则表达式分隔符regex和分隔份数limit，返回一个字符串数组　

复制代码
1 　　String str2 = new String();
2 　　str2 = "A/B/C";
3 　　String s[] = str2.split("/", 2);
4 　　for(String ss: s) {
5 　　System.out.print(ss+" ");
6 　　}
7 　　//return"A B/C"
复制代码
　　注意： . 、 | 和 * 等转义字符，必须得加 \\

　　注意：多个分隔符，可以用 | 作为连字符

 

7、String toLowerCase()：转换为小写字母
      String toUpperCase()：转换为大写字母

8、boolean startsWith(String prefix)：如果字符串以prefix开头返回true，否则返回false
　  boolean endsWith(String suffix)：如果字符串以suffix结尾返回true，否则返回false

9、boolean equals(Object other)：如果字符串与other相等返回true，否则返回false
　  boolean equalsIgnoreCase(String other)：如果字符串与other相等（忽略大小写）返回true，否则返回false