public class Point {
    int var1;
    int var2;

    public int var3= 3;
    private int var4= 4;

    public Point(int x,int y){
        var1 = x;
        var2 = y;
    }
    public void publicMethod(){
        System.out.println(var1);
    }

    private void privateMethod(){
        System.out.println(var2);
    }
}
