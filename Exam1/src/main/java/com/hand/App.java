package com.hand;
/**
 * 判断101-200之间有多少个素数，并输出所有素数。
 * Output:101-200间总共有xx个素数，分别是:xxx,xxx,xxx
 */
public class App 
{
    public static void sushu(int min,int max){
        int count=0;
        int i,j;
        String str="";
        for (i=min;i<=max;i++){
            for(j=2;j<i;j++){
                if(i%j==0)
                    break;
            }
            if(j==i){
                count++;
                str+=i+",";
            }
        }
        if(str.length()!=0)
            str = str.toString().substring(0,str.length() - 1);
        System.out.println(min+"-"+max+"间总共有"+count+"个素数，分别是:"+str);
    }
    public static void main( String[] args )
    {
        sushu(101,200);
    }

}
