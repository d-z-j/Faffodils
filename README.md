# Faffodils
最近重新学习JavaSE，在水仙花数这个程序中又有新的体会。

首先对int类型有了新的认识，在Java中int类型的整数相除'/'，结果还是int类型，向下取整。

对整数取得个位、十位、百位等的方法，有了更深刻的理解。

![image](https://user-images.githubusercontent.com/101461459/166395063-e8aab118-6405-42c4-b50a-527b4ce1528d.png)

代码利用while循环，当商（a）大于0时，取得个位数，例如：153%10=3。

利用sum做累加器，例如：sum=3 * 3 * 3=27。

每做一次循环将a的值更新。整数相除得到的结果还是整数，例如：153/10=15，这样就可以实现a的更新。

当只剩下最高位，例如：a=153循环至a=1时，a/10=0，不满足while循环条件，跳出循环。

跳出循环后if判断即可。
