package com.itgen.lesson;
public class Trip {
    double temp;
    double dcost=1;
    String fname="";
    double tcost;
    int days;
    public Trip(double dc,String fn,double tc,int d){
        days=d;
        fname=fn;
        dcost=dc;
        tcost=tc;
    }
    public void get_total(){
        temp=dcost*days+tcost;
        System.out.println("the total is "+temp);
    }
    public void Pr(){
        System.out.println(fname+", days: "+days+", daily cost:"+dcost+", transportation cost "+tcost);
    }



}
