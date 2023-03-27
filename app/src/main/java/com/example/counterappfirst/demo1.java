// java class named demo1 no main method
class demo1
{
    int a,b;
    demo1(int x,int y)
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
    void bitshiftleft()
    {
        System.out.println("a<<b="+(a<<b));
    }
    void bitshiftright()
    {
        System.out.println("a>>b="+(a>>b));
    }
}
