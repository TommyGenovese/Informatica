public class Data {
    public int g;
    private int m;
    private int a;

    public Data(int g, int m, int a){
        int []v={31,28,31,30,31,30,31,31,30,31,30,31};
        if (m>0 && m<13)
            this.m = m;
        else
            this.m = 1;
        if(v[m-1] >= g && g>0)
            this.g = g;
        else
            this.g = 1;
        if(a>0)
            this.a=a;
        else
            this.a = 1;
    }
    public  String toString(){
        String s;

        s = g + "/" + m + "/" + a; // creerà  21/10/2019
        return s;
    }
    public  void setG(int g){
        int []v={31,28,31,30,31,30,31,31,30,31,30,31};
        if(v[m-1] >= g && g>0)
            this.g = g;
        else
            this.g = 1;

    }

    public int setA(int a) {
        if(a>0)
            this.a=a;
        else
            this.a = 1;
        return a;
    }

    public int setM(int m){
        if (m>0 && m<13)
            this.m = m;
        else
            this.m = 1;
        return m;
    }
}
