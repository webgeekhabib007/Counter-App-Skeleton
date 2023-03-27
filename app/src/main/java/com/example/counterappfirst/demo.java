//java class with constructor,destructors and methods named demo
class demo
{
    int a,b;
    demo(int x,int y)
    {
        a=x;
        b=y;
    }
    void display()
    {
        System.out.println("a="+a+" b="+b);
    }
    void add()
    {
        System.out.println("a+b="+(a+b));
    }
    void sub()
    {
        System.out.println("a-b="+(a-b));
    }
    void mul()
    {
        System.out.println("a*b="+(a*b));
    }
    void div()
    {
        System.out.println("a/b="+(a/b));
    }
    void mod()
    {
        System.out.println("a%b="+(a%b));
    }
    void inc()
    {
        System.out.println("a++="+(a++));
    }
    void dec()
    {
        System.out.println("b--="+(b--));
    }
    void eq()
    {
        System.out.println("a==b="+(a==b));
    }
    void neq()
    {
        System.out.println("a!=b="+(a!=b));
    }
    void gt()
    {
        System.out.println("a>b="+(a>b));
    }
    void lt()
    {
        System.out.println("a<b="+(a<b));
    }
    void gte()
    {
        System.out.println("a>=b="+(a>=b));
    }
    void lte()
    {
        System.out.println("a<=b="+(a<=b));
    }
    void and()
    {
        System.out.println("a&&b="+(a&&b));
    }
    void or()
    {
        System.out.println("a||b="+(a||b));
    }
    void not()
    {
        System.out.println("!a="+(!a));
    }
    void bitand()
    {
        System.out.println("a&b="+(a&b));
    }
    void bitor()
    {
        System.out.println("a|b="+(a|b));
    }
    void bitxor()
    {
        System.out.println("a^b="+(a^b));
    }
    void bitnot()
    {
        System.out.println("~a="+(~a));
    }
    void bitlshift()
    {
        System.out.println("a<<b="+(a<<b));
    }
    void bitrshift()
    {
        System.out.println("a>>b="+(a>>b));
    }
    void biturshift()
    {
        System.out.println("a>>>b="+(a>>>b));
    }
    void assign()
    {
        System.out.println("a=b="+(a=b));
    }
    void addassign()
    {
        System.out.println("a+=b="+(a+=b));
    }
    void subassign()
    {
        System.out.println("a-=b="+(a-=b));
    }
    void mulassign()
    {
        System.out.println("a*=b="+(a*=b));
    }
    void divassign()
    {
        System.out.println("a/=b="+(a/=b));
    }
    void modassign()
    {
        System.out.println("a%=b="+(a%=b));
    }
    void bitandassign()
    {
        System.out.println("a&=b="+(a&=b));
    }
    void bitorassign()
    {
        System.out.println("a|=b="+(a|=b));
    }
    void bitxorassign()
    {
        System.out.println("a^=b="+(a^=b));
    }
    void bitlshiftassign()
    {
        System.out.println("a<<=b="+(a<<=b));
    }
    void bitrshiftassign()
    {
        System.out.println("a>>=b="+(a>>=b));
    }
}