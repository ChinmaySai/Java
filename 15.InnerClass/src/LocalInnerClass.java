class OuterClass
{
    int x=10;
    static int y=20;
    
    static class My
    {
        public void show()
        {
            System.out.println(y);
        }
    }
    
    
}

public class LocalInnerClass 
{
    public static void main(String[] args) 
    {
        OuterClass.My m=new OuterClass.My();
        m.show();

    }
    
}