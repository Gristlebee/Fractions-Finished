class fraction {
    private int n;
    private int d;
    public fraction(){
      this.n=0;
      this.d=1;
    }
    public fraction(int n, int d) {
     this.n=n;
     if(d==0) {
       System.out.println("Error");
       d=1;
        } else{
          this.d=d;  
            
        }
       // gcf(n,d);
        //setNum(3);
       // reduce();
        //System.out.println(n+","+d);
    }
    public fraction(String f){
        int slashindex=f.indexOf("/");
        String num =f.substring(0,slashindex);
        String dem =f.substring(slashindex+1);
        this.n= Integer.parseInt(num);
        this.d= Integer.parseInt(dem);
        if(d==0) {
          System.out.println("Error");
          d=1;
        } else{
          this.d=d;  
            
        }
        
        
    }
    public fraction(fraction f) {
        this.n=f.n;
        this.d=f.d;
    }
    public int getN() {
        return this.n;
    }
    public int getD() {
        return this.d;
    }
    public String toStr() {
        return n+"/"+d;
    }
    public double dec(int n, int d) {
        this.n=n;
        this.d=d;
        double n2=n;
        double d2=d;
        if(d==0) {
          System.out.println("Error");
          d=1;
        } else{
          this.d=d;  
            
        }
        double q;
        q=n2/d2;
        System.out.println(q);
        return q;
    }
    public void reduce () {
        int gcd = gcf(this.n, this.d);
        this.n = this.n / gcd;
        this.d = this.d / gcd; 
        /* n = Math.abs(n);
        d = Math.abs(d);
        int gcf=0;
        int d2=d;
       if (n == 0 || d == 0)
        {
            return 1;
        }

        while (n != d)
        {
            if (n > d) {
                n = n - d; gcf=n;}
            else {
                d = d - n; gcf=d;}
        } 
        System.out.println(n+","+d2);
        System.out.println(gcf);
        //n=n/gcf;
        //d=d/gcf;
        System.out.println(n/gcf+","+d2/gcf);
        return n;
        */
    }
    public void setNum(int n2) {
        this.n=n2;
        this.d=d;
        System.out.println("New Fraction "+n+","+d);
    }
    public void setDem(int d2) {
        this.n=n;
        this.d=d2;
        System.out.println("New Fraction "+n+","+d);
    }
    public int gcf(int n,int d) {
        n = Math.abs(n);
        d = Math.abs(d);

        if (n == 0 || d == 0)
        {
            return 1;
        }

        while (n != d)
        {
            if (n > d)
                n = n - d;
            else
                d = d - n;
        }
       // System.out.println(n);
        return n;
        
    }
    public static fraction multipy(fraction a, fraction b) {
        int nprod=a.n=a.n*b.n;
        int dprod =a.d *= b.d;
        fraction prod=new fraction(nprod,dprod);
        prod.reduce();
        System.out.println(prod);
        return prod;
    }
    public static fraction div(fraction a, fraction b) {
        int nprod=a.n=a.n*b.d;
        int dprod =a.d *= b.n;
        fraction div=new fraction(nprod,dprod);
        div.reduce();
        System.out.println(div);
        return div;
    }
    public static fraction add(fraction a,fraction b) {
        int NA=a.n;
        int DA=a.d;
        int NB=b.n;
        int DB=b.d;
        int finD=DA*DB;
        int finN=(NA*DB)+(NB*DA);
        fraction FinSum=new fraction(finN,finD);
        FinSum.reduce();
        return FinSum;
    }
    public static fraction sub(fraction a,fraction b) {
        int NA=a.n;
        int DA=a.d;
        int NB=b.n;
        int DB=b.d;
        int finD=DA*DB;
        int na2=a.n*DB;
        int nb2=b.n*DA;
        int finN=0;
        if(na2==nb2) {
            finN=0;
        } else if(na2>nb2) {
            finN=na2-nb2;
        } else if(na2<nb2){
            finN=nb2-na2;
        }
        fraction FinSum=new fraction(finN,finD);
        FinSum.reduce();
        return FinSum;
    }
  }