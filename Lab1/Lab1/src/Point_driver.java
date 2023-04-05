import com.sun.security.jgss.GSSUtil;

public class Point_driver {

    public static void main(String[] args) {
        Point p1 = new Point(1,2);
        p1.publicMethod();
        // p1.privateMethod(); ---- This error is printed: "java: privateMethod() has private access in Point"
        System.out.println(p1.var3);
        // System.out.println(p1.var4); Error: "java: var4 has private access in Point"
    }
}
