import java.io.*;
import java.util.*;
import java.lang.*;
class Main 
{ 
    
    public static void main(String [] args)
    {
       Scanner in=new Scanner(System.in);
        String s=in.next(),p=in.next();
        while(in.hasNext())
        {
            System.out.println("[\n");
            if(s.length()==p.length())
                stack(s,"","","",s,p,0);
            System.out.println("]\n");
        }
    }
    static void stack(String a,String b,String c,String d,String s,String p,int n)
    {
        if(n==a.length()*2)
        {
            if(b==p)
                System.out.println(d);
            return ;
        }
        if(a.length() > 0)
            stack(a.substring(1, a.length() - 1), b, c + a.charAt(0),d + (n == 0? "i" : " i"), s, p, n + 1);
        if(c.length()>0 && c.charAt(c.length()-1)==p.charAt(b.length()))
            stack(a,b+c.charAt(c.length()-1),c.substring(0,c.length()-1),d+"o",n+1);

    }
    
}
