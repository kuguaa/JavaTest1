package com.hand;

/**
 * Hello world!
 *
 */
class Tax{
    private static Tax tax=new Tax();
    private Tax(){ }
    public static Tax getTax(){
        return tax;
    }
    public double taxCount(double salary){
        double taxAmount=0;
        double n=salary-3500;
        if(n<=0)
            taxAmount=0;
        else if(n<=1500)
            taxAmount=n*0.03;
        else if(n<=4500)
            taxAmount=1500*0.03+(n-1500)*0.1;
        else if(n<=9000)
            taxAmount=1500*0.03+4500*0.1+(n-4500)*0.2;
        else if(n<=35000)
            taxAmount=1500*0.03+4500*0.1+9000*0.2+(n-9000)*0.25;
        else if(n<=55000)
            taxAmount=1500*0.03+4500*0.1+9000*0.2+35000*0.25+(n-35000)*0.3;
        else if(n<=80000)
            taxAmount=1500*0.03+4500*0.1+9000*0.2+35000*0.25+55000*0.3+(n-55000)*0.35;
        else
            taxAmount=1500*0.03+4500*0.1+9000*0.2+35000*0.25+55000*0.3+80000*0.35+(n-8000)*0.45;

        return taxAmount;
    }
}
public class App 
{
    public static void main( String[] args )
    {
        //userA：5000 userB：10000，userC：15000，userD：60000
        Tax tax=Tax.getTax();
        System.out.println("userA：5000 ，其税费是："+tax.taxCount(5000));
        System.out.println("userB：10000 ，其税费是："+tax.taxCount(10000));
        System.out.println("userC：15000 ，其税费是："+tax.taxCount(15000));
        System.out.println("userD：60000 ，其税费是："+tax.taxCount(60000));
    }
}
