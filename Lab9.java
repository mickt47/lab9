import java.util.*;

public class Lab9{
    public static <K extends Comparable<K>, V extends Comparable<V>>MyPair<K, V> 
    maxOfThreePairs(MyPair pair1, MyPair pair2, MyPair pair3){
        /* 
     if a<c then a,b is less than c,d
    a>c then c,d is less than a,b
    a=c and b<d then a,b < c,d
    else c,d < a,b
    */
   
   //this is a comment to see if i can push.
   if(pair1.compareTo(pair2) < 0){
           if(pair2.compareTo(pair3) < 0){
               System.out.println(pair3.toString());
               return pair3;
           }else{
               System.out.println(pair2.toString());
               return pair2;
           }
       }else if(pair1.compareTo(pair2) > 0){
           if(pair1.compareTo(pair3) < 0){
               System.out.println(pair3.toString());
               return pair3;
           }else{
               System.out.println(pair1.toString());
               return pair1;
           }
       }else{
           if(pair1.compareTo(pair3) > 0){
               System.out.println(pair1.toString());
               return pair1;
           }else{
               System.out.println(pair3.toString());
               return pair3;
           }
       }
    
}   
    
    
public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    try{
            double var1 = scan.nextDouble();
            double var2 = scan.nextDouble();
            double var3 = scan.nextDouble();
            double var4 = scan.nextDouble();
            double var5 = scan.nextDouble();
            double var6 = scan.nextDouble();
        
            MyPair<Double, Double> first = new MyPair<>(var1, var2);
            MyPair<Double, Double> second = new MyPair<>(var3, var4);
            MyPair<Double, Double> third = new MyPair<>(var5, var6);
            maxOfThreePairs(first, second, third);
    }catch(InputMismatchException ex){
            String varString1 = scan.next();
            String varString2 = scan.next();
            String varString3 = scan.next();
            String varString4 = scan.next();
            String varString5 = scan.next();
            String varString6 = scan.next();
            
            MyPair<String, String> first = new MyPair<>(varString1, varString2);
            MyPair<String, String> second = new MyPair<>(varString3, varString4);
            MyPair<String, String> third = new MyPair<>(varString5, varString6);
            maxOfThreePairs(first, second, third);
    }finally{
        if(scan != null){scan.close();}
    }
    
}

}
