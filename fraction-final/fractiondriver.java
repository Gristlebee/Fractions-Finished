public class fractiondriver {
    
    public static void main (String[] args) {
        System.out.println("Testing constructors");
        fraction f1 = new fraction();
        fraction f2 = new fraction(10,5);
        fraction f3 = new fraction("3/4");
        fraction f4 = new fraction(f2);
        System.out.println(f1.toStr());
        System.out.println(f2.toStr());
        System.out.println(f3.toStr());
        System.out.println(f4.toStr());
         System.out.println("Testing arthmetic");
        System.out.println(fraction.add(f2,f3).toStr());
        System.out.println(fraction.sub(f2,f3).toStr());
        System.out.println(fraction.multipy(f2,f3).toStr());
        System.out.println(fraction.div(f2,f3).toStr());
    }
    
    
}