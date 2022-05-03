public class Main {
    public static void main(String[] args) {
        /**
         * for (int i=0;i<1000;i++){
            int a=i%10;                 //通过取余运算符，求个位数
            int b=i/10%10;              //求十位数
            int c=i/10/10%10;           //求百位数
            if(i==a*a*a+b*b*b+c*c*c)
                System.out.println(i+"是水仙花数");
        }
         **/
        for (int i=0;i<1000;i++){
            int a=i,sum=0;
            while(a>0){             //利用while循环，当商大于0时，取得个位数，利用sum做累加器，每做一次循环将a的值更新。整数相除得到的结果还是整数，153/10=15，就可以实现a的更新
                int b=a%10;
                sum+=b*b*b;
                a=a/10;
            }
            if (sum==i)
                System.out.println(i+"是水仙花数");
        }
    }

}
