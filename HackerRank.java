
//Java Stdin and Stdout II, Scanner， nextLine()
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        //scan.

        // Write your code here.
        double d = scan.nextDouble();
        String s = "";
        while(scan.hasNextLine()){
            if(scan.nextLine().equals(null)){
                String tmp = scan.nextLine();
            }else{
            s = s + scan.nextLine() + " ";
            }
        }

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}


//Java static block
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int B;
    static int H;
    static boolean flag;
    static{
    Scanner input = new Scanner(System.in);
    B = input.nextInt();
    H = input.nextInt();
    flag = (B>0) && (H>0);
    if(!flag){
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
        
    }//end of main

}//end of class


//Java Currency Formatter
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        // Write your code here.
        DecimalFormat df = new DecimalFormat("#.00");
        Double myPayment = Double.parseDouble(df.format(payment));
        Locale aLocale = new Locale("en", "INDIA");
        //DecimalFormat america = NumberFormat.getCurrencyInstance(Locale.US);
        String us = NumberFormat.getCurrencyInstance(Locale.US).format(myPayment);
        //String india = NumberFormat.getCurrencyInstance(aLocale).format(myPayment);
        NumberFormat formatter = DecimalFormat.getCurrencyInstance();
        DecimalFormatSymbols dfs = new DecimalFormatSymbols();
        dfs.setCurrencySymbol("Rs.");
        //dfs.setGroupingSeparator(',');
        //dfs.setMonetaryDecimalSeparator('.');
        ((DecimalFormat) formatter).setDecimalFormatSymbols(dfs);

        String india = formatter.format(payment);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(myPayment);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(myPayment);
            
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);

//StringChallenge
public class StringChallenge {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        System.out.println(A.length()+B.length());
        if (A.compareTo(B)<0) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
        String A1 = A.substring(0,1).toUpperCase() + A.substring(1);
        String B1 = B.substring(0,1).toUpperCase() + B.substring(1);
        System.out.println(A1+" "+B1);     
    }
}


//Java sub String Compare
public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        String origin = input.next();
        int length = input.nextInt();
        List<String> stringList = new ArrayList<String>();
        for (int i=0; i < origin.length()-length+1; i++){
            stringList.add(i, origin.substring(i, i+length));
        }
        String smallest = stringList.get(0);
        String bigest = stringList.get(0);
        for (int i = 1; i<stringList.size();i++){
            if (smallest.compareTo(stringList.get(i))>0){
                smallest = stringList.get(i);
            }
            if (bigest.compareTo(stringList.get(i))<0){
                bigest = stringList.get(i);
            }
        }
        System.out.println(smallest + "\n" + bigest);
        
    }


    //Second solution
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        String origin = input.next();
        int length = input.nextInt();
        List<String> stringList = new ArrayList<String>();
        for (int i=0; i < origin.length()-length+1; i++){
            stringList.add(i, origin.substring(i, i+length));
        }
        Collections.sort(stringList);
        System.out.println(stringList.get(0) + "\n" + stringList.get(stringList.size()-1));
        
    }


//String reverse/ palindrome
String A1 = new StringBuilder(A).reverse().toString();


//String Anagram
    static boolean isAnagram(String a, String b) {
        
        // Complete the function by writing your code here.
        String a1 = a.toLowerCase();
        String b1 = b.toLowerCase();
        if (a.length()!= b.length()){
            return false;
        } else {
            char[] aArray = a1.toCharArray();
            char[] bArray = b1.toCharArray();
            Arrays.sort(aArray);
            Arrays.sort(bArray);
            return Arrays.equals(aArray, bArray);
        }
        
    }

    //trim and split regex
             public static void main(String[] args) {
                Scanner scan = new Scanner(System.in);
                String s = scan.nextLine();
                
                s = s.trim();
                
                if (!s.isEmpty()) {
                String str[] = s.split("\\s*[^a-zA-Z]+\\s*");
                    
                    System.out.println(str.length);
                    for (int i=0;i<str.length;i++){
                        System.out.println(str[i]);
                    }
                    
                }
                else{ 
                    System.out.println("0");
                }
                    
                
                scan.close();
    }


    //Regex valid compile
Scanner in = new Scanner(System.in);
              int testCases = Integer.parseInt(in.nextLine());
              int cpt = 0;
              while(cpt<testCases){
                  try{
                 String pattern = in.nextLine();
                   Pattern.compile(pattern);
                   System.out.println("Valid");
                  } 
                  catch(Exception e) {
                      
                      System.out.println("Invalid");
                  }
               cpt++;
              }


//Java regex IP V4 pattern
class MyRegex {
    String pattern;
    
    public MyRegex() {
        //pattern = "^(([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.){3}([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
        pattern = "(([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])\\.){3}([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])";
    }
}

//Java Regex 2 - Duplicate Words
    public class DuplicateWords
    {
        public static void main(String[] args){

            String pattern = "(?i)\\b([a-z]+)\\b(?:\\s+\\1\\b)+";
            Pattern r = Pattern.compile(pattern, 1);

            Scanner in = new Scanner(System.in);
            int testCases = Integer.parseInt(in.nextLine());
            while(testCases>0){
                String input = in.nextLine();
                Matcher m = r.matcher(input);
                boolean findMatch = true;
                while(m.find( )){
                    input = input.replaceAll(pattern,"$1");
                    findMatch = false;
                }
                System.out.println(input);
                testCases--;
            }
        }
    }


// Java BigInteger
    Scanner input = new Scanner(System.in);
    BigInteger input1 = input.nextBigInteger();
    BigInteger input2 = input.nextBigInteger();
    BigInteger sum = input1.add(input2);
    BigInteger product = input1.multiply(input2);
    System.out.println(sum.toString());
    System.out.println(product.toString());

//Java SubArray sum negative
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
        int[] sumarr = new int[n];
        int cmp = 0;
        for(int i = 0; i < n;i++) {
            arr[i] = input.nextInt();
        }
        
        for(int i=0;i <= n;i++) {
            for(int j=0;j < n-i;j++){
                int sum = 0;
                for(int k = j; k<=j+i; k++){
                    sum = sum + arr[k];
                    if (sum<0){
                        cmp++;
                    }
                }
            }
        }
        System.out.println(cmp);
    }

    //Java ArrayList query

        public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
                Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        // List innerList = new ArrayList<Integer>();
        List myList = new ArrayList<List>();
        for (int i = 0; i < n; i++) {
            int num = input.nextInt();
            List innerList = new ArrayList<Integer>();
            for (int j = 0; j < num; j++) {
                innerList.add(j, input.nextInt());
            }
            myList.add(innerList);
        }
        
        int nq = input.nextInt();
        for(int i =0; i < nq;i++) {
            int x = input.nextInt()-1;
            int y = input.nextInt()-1;
            if((x>myList.size()-1) | y > ((List)myList.get(x)).size()-1) {
                System.out.println("ERROR!");
            } else {
                System.out.println(((List)myList.get(x)).get(y));
            }
        }
    }

  //Java generics 
  class Printer
{
   //Write your code here
    public void printArray(Object[] ob){
        for(Object o : ob) {
            System.out.println(o.toString());
        }
    } 
 
}

public class Solution {


    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
        int count = 0;

        for (Method method : Printer.class.getDeclaredMethods()) {
            String name = method.getName();

            if(name.equals("printArray"))
                count++;
        }

        if(count > 1)System.out.println("Method overloading is not allowed!");
      
    }
}

//java List query
        Scanner input = new Scanner(System.in);
        Integer n = input.nextInt();
        List<Integer> myList = new ArrayList<Integer>();
        for(int i=0;i<n;i++) {
            myList.add(input.nextInt());
        }
        Integer nq = input.nextInt();
        for(int i=0;i<nq;i++) {
            String order = input.nextLine();
            if(order.equals("Insert")){
                myList.add((int)input.nextInt(), input.nextInt());
            }
            else if(order.equals("Delete")){
                myList.remove(input.nextInt());
            }
        }
        
        for(int i=0;i<myList.size();i++){
            System.out.print(myList.get(i)+" ");
        }  


//Java comparator

        class Checker implements Comparator<Player>{

    @Override
    public int compare(Player o1, Player o2) {
        // TODO Auto-generated method stub
        return (o2.score < o1.score) ? -1 : (o2.score > o1.score) ? 1 : (o1.name.compareTo(o2.name));
    }

}

class Player{
    String name;
    int score;
    
    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        Player[] player = new Player[n];
        Checker checker = new Checker();
        
        for(int i = 0; i < n; i++){
            player[i] = new Player(scan.next(), scan.nextInt());
        }
        scan.close();
     
        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}

//Java sort with comparator
class Student{
   private int id;
   private String fname;
   private double cgpa;
   public Student(int id, String fname, double cgpa) {
      super();
      this.id = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getId() {
      return id;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
}

//Complete the code
class Checker implements Comparator<Student>{

/*  @Override
    public int compare(Student o1, student o2) {
        // TODO Auto-generated method stub
        return (o2.score < o1.score) ? -1 : (o2.score > o1.score) ? 1 : (o2.name.compareTo(o1.name));
    }
*/
    @Override
    public int compare(Student o1, Student o2) {
        // TODO Auto-generated method stub
        if (o2.getCgpa() < o1.getCgpa()) {
            return -1;
        } else if (o2.getCgpa() > o1.getCgpa()) {
            return 1;
        } else {
            if (o2.getFname().compareTo(o1.getFname()) > 0) {
                return -1;
            } else if (o2.getFname().compareTo(o1.getFname()) < 0) {
                return 1;
            } else {
                if (o2.getId() < o1.getId()) {
                    return 1;
                } else if (o2.getId() > o1.getId()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }

        // return (o2.getCgpa() < o1.getCgpa()) ? -1 : (o2.getCgpa() <
        // o1.getCgpa() ? 1 : o2.getFname().) ;
    }


       
    
    }


public class Solution
{
   public static void main(String[] args){
      Scanner in = new Scanner(System.in);
      int testCases = Integer.parseInt(in.nextLine());
      
      List<Student> studentList = new ArrayList<Student>();
      while(testCases>0){
         int id = in.nextInt();
         String fname = in.next();
         double cgpa = in.nextDouble();
         
         Student st = new Student(id, fname, cgpa);
         studentList.add(st);
         
         testCases--;
      }
      
      Checker checker = new Checker();
      Collections.sort(studentList, checker);
      
         for(Student st: studentList){
         System.out.println(st.getFname());
      }
   }
}

//BitSet
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int n  = input.nextInt();
        BitSet B1 = new BitSet(n);
        BitSet B2 = new BitSet(n);
        int nb = input.nextInt();
        for (int i = 0; i < nb; i++) {
              String op = input.next();
              
              if(op.equals("FLIP")) {
                  
                 int x = input.nextInt();
                 int y = input.nextInt();
                 
                 if(x==1) {
                     B1.flip(y);
                 }
                 if(x==2) {
                     B2.flip(y);
                 }
                
              }
              
              
              if(op.equals("SET")) {
                  
                 int x = input.nextInt();
                 int y = input.nextInt();
                 
                 if(x==1) {
                     B1.set(y);
                 }
                 if(x==2) {
                     B2.set(y);
                 }
                
              }
              
              
              if (op.equals("AND")) {
                  
                 int x = input.nextInt();
                 int y = input.nextInt();
                 
                 BitSet target,object;
                 
                 if(x==1){
                     
                     target = B1;
                 } else {
                     target = B2;
                 }
                  
                 if(y==1){
                     
                     object = B1;
                 } else {
                     object = B2;
                 }
                
                  target.and(object);
                 
                  if(x==1){
                     
                     B1 = target;
                 } else {
                     B2 = target;
                 }
                  
              }
              
              if (op.equals("OR")) {
                  
                 int x = input.nextInt();
                 int y = input.nextInt();
                 
                 BitSet target,object;
                 
                 if(x==1){
                     
                     target = B1;
                 } else {
                     target = B2;
                 }
                  
                 if(y==1){
                     
                     object = B1;
                 } else {
                     object = B2;
                 }
                
                  target.or(object);
                  
                  if(x==1){
                     
                     B1 = target;
                 } else {
                     B2 = target;
                 }
                 
              }
              
              if (op.equals("XOR")) {
                  
                 int x = input.nextInt();
                 int y = input.nextInt();
                 
                 BitSet target,object;
                 
                 if(x==1){
                     
                     target = B1;
                 } else {
                     target = B2;
                 }
                  
                 if(y==1){
                     
                     object = B1;
                 } else {
                     object = B2;
                 }
                
                  target.xor(object);
                  
                  if(x==1){
                     
                     B1 = target;
                 } else {
                     B2 = target;
                 }
              }
              System.out.println(count(B1)+" "+count(B2));  
              
          }
       }
       
       public static int count(BitSet b) {
           
           int cpt =0;
           for(int i=0;i<b.length();i++) {
               
               if (b.get(i)) {
                   cpt++;
               }
           }
           return cpt;
       }
    
}

//Exception1
 Scanner sc = new Scanner(System.in);
            
            try {
            int n = sc.nextInt();
            int j = sc.nextInt();
            int q = n/j;
                System.out.println(q);
            }
            
            catch(InputMismatchException e){
                System.out.println("java.util.InputMismatchException");
            }
            catch(ArithmeticException e) {
                System.out.println("java.lang.ArithmeticException: / by zero");
            }

//Java Exception Handling

class MyCalculator  {
    public int power(int a, int b ) throws Exception {
        double n = (double)a;
        double p = (double)b;
        if (n < 0 | p < 0)
            throw new Exception("n and p should be non-negative");
        double power =Math.pow(n, p);
        return (int)power;
    }      
    
}
class Solution {

 public static void main(String[] args) {
  Scanner in = new Scanner(System.in);

  while ( in .hasNextInt()) {
   int n = in .nextInt();
   int p = in .nextInt();
   MyCalculator my_calculator = new MyCalculator();
   try {
    System.out.println(my_calculator.power(n, p));
   } catch (Exception e) {
    System.out.println(e);
   }
  }
 }
}

//Java Varargs : simple addition
class Add {
    public void add(int ... is) {
        int sum = 0;
        List<String> li = new LinkedList<String>();
        for(int i : is) {
            sum = sum + i;
            li.add(Integer.toString(i));
            li.add("+");
        }
        li.set(li.size()-1, "=");
        li.add(Integer.toString(sum));
        for(String s : li){
            System.out.print(s);
        }
        System.out.print("/n");
    }
}

//Access inner class
public class Solution {

    public static void main(String[] args) throws Exception {
        DoNotTerminate.forbidExit();    

        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(br.readLine().trim());
            Object o;// Must be used to hold the reference of the instance of the class Solution.Inner.Private
             o = new Inner().new Private();
             System.out.println(num + " is " + ((Solution.Inner.Private)o).powerof2(num));
            
            
            
            System.out.println("An instance of class: " + o.getClass().getCanonicalName() + " has been created");
            
        }//end of try
        
        catch (DoNotTerminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
    }//end of main
    static class Inner{
        private class Private{
            private String powerof2(int num){
                return ((num&num-1)==0)?"power of 2":"not a power of 2";
            }
        }
    }//end of Inner
    
}//end of Solution

class DoNotTerminate { //This class prevents exit(0)
     
    public static class ExitTrappedException extends SecurityException {

        private static final long serialVersionUID = 1L;
    }
 
    public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
            @Override
            public void checkPermission(Permission permission) {
                if (permission.getName().contains("exitVM")) {
                    throw new ExitTrappedException();
                }
            }
        };
        System.setSecurityManager(securityManager);
    }
}   
    
//Java Factory

interface Food {
     public String getType();
    }
    class Pizza implements Food {
     public String getType() {
     return "Someone ordered a Fast Food!";
     }
    }

    class Cake implements Food {

     public String getType() {
     return "Someone ordered a Dessert!";
     }
    }
    class FoodFactory {
        public Food getFood(String order) {

//Write your code here
        if (order.equals("cake")) {
    return new Cake();
}
     else if (order.equals("pizza")) {
    return new Pizza();
}
    else {
        return null;
    }

    }//End of getFood method

    }//End of factory class

    public class Solution {

     public static void main(String args[]){
            Do_Not_Terminate.forbidExit();

        try{

            Scanner sc=new Scanner(System.in);
            //creating the factory
            FoodFactory foodFactory = new FoodFactory();
    
            //factory instantiates an object
            Food food = foodFactory.getFood(sc.nextLine());
    
            
            System.out.println("The factory returned "+food.getClass());
            System.out.println(food.getType());
        }
        catch (Do_Not_Terminate.ExitTrappedException e) {
            System.out.println("Unsuccessful Termination!!");
        }
     }

    }
    class Do_Not_Terminate {
         
        public static class ExitTrappedException extends SecurityException {

            private static final long serialVersionUID = 1L;
        }
     
        public static void forbidExit() {
            final SecurityManager securityManager = new SecurityManager() {
                @Override
                public void checkPermission(Permission permission) {
                    if (permission.getName().contains("exitVM")) {
                        throw new ExitTrappedException();
                    }
                }
            };
            System.setSecurityManager(securityManager);
        }
    }   
        
//Covariant Return Types

class Flower {
    public String whatsYourName(){
        return "I have many names and types.";
    }
}

class Jasmine extends Flower {
    public String whatsYourName(){
        return "Jasmine";
    }
}

class Lily extends Flower {
    public String whatsYourName(){
        return "Lily";
    }
}

class Lotus extends Flower {
    public String whatsYourName(){
        return "Lotus";
    }
}

class State {
    public Flower yourNationalFlower () {
        return new Flower();
    }
}

class WestBengal extends State {
    public Flower yourNationalFlower () {
        return new Jasmine();
    }
}

class Karnataka extends State {
    public Flower yourNationalFlower () {
        return new Lotus();
    }
}

class AndhraPradesh extends State {
    public Flower yourNationalFlower () {
        return new Lily();
    }
}

//BigInteger primility
public class Solution {

   public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      BigInteger n = in.nextBigInteger();
      in.close();
      // Write your code here.
      BigInteger m=new BigInteger("1");
      if (n.subtract(m).nextProbablePrime().equals(n)) {
          System.out.println("prime");
      } else {
          System.out.println("not prime");
      }
   }
}

//BigDecimalArraysort & String

 BigDecimal sbig[] = new BigDecimal[n];
            
            for(int i=0;i<sbig.length;i++){
                
                sbig[i] = new BigDecimal(s[i]);
            }
            
            
            BigDecimal temp;
             String temp_str;
             for(int i=0; i < n-1; i++){
      
                 for(int j=1; j < n-i; j++){
                     if(sbig[j-1].compareTo(sbig[j]) < 0 ){
                         temp=sbig[j-1];
                         sbig[j-1] = sbig[j];
                         sbig[j] = temp;
                         
                         temp_str=s[j-1];
                         s[j-1] = s[j];
                         s[j] = temp_str;
                         
                     }
                 }
             }


BigDecimal []d = new BigDecimal[n];
        for(int i=0;i<n;i++){
            d[i] = new BigDecimal(s[i]);
        }
        
        BigDecimal tmpi;
        String tmps;
        
        for(int i=0;i<n-1;i++){
            for(int j = i + 1; j < n; j++ ) {
                if (d[i].compareTo(d[j]) < 0) {
                    tmpi = d[i];
                    d[i] = d[j];
                    d[j] = d[i];
                    
                    tmps = s[i];
                    s[i] = s[j];
                    s[j] = tmps;
                }
            }
        }



//Java 1D Array (Part 2)
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for (int i = 0; i < n; i ++) {
            int m = input.nextInt();
            int step = input.nextInt();
            int[] arr = new int[m];
            for (int j = 0; j < m; j++){
                arr[j] = input.nextInt();
            }
            jump(m, step, arr);
        }
    }

    public static void jump(int m, int step, int[] arr) {
        int sum = 0;
        for (int k = 0; k < m; k++) {
            sum = sum + arr[k];
            if (sum == 0 && k == m -1) {
                System.out.println("YES");
            }
            else if (arr[k] == 1) {
                if ( k + step - 1 >= m ){
                    System.out.println("YES");
                    break;
                }else if (arr[k+step-1] == 0 && k+step-1 == m-1) {
                    System.out.println("YES");
                    break;
                }
                else if (arr[k+step-1] == 1) {
                    System.out.println("NO");
                    break;
                } else if (arr[k+ step -1] == 0) {
                    int[] arr1 = new int[m - k - step + 1];
                    for (int l = 0; l < m - k - step + 1; l++) {
                        arr1[l] = arr[k+ step -1+l];
                        jump(m - k - step + 1, step, arr1);
                    }
                }
            }
        }
    }
}

//Java reflection

public class Solution {

    public static void main(String[] args){
        Class student = (new Student()).getClass();
        Method[] methods = student.getDeclaredMethods();

        ArrayList<String> methodList = new ArrayList<>();
        for(Method m : methods){
        methodList.add(m.getName());
        }
        Collections.sort(methodList);
        for(String name: methodList){
            System.out.println(name);
        }
    }

}

//Check Prime
// import static
import static java.lang.System.in;
class Prime {
    
    public boolean isPrime(int i) {
        for (int j = 2; j < i; j++) {
            if ( i % j == 0) {
                return false;
            }   
        }
        return true;
    }
    public static InputStream in = System.in;
    BufferedReader br=new BufferedReader(new InputStreamReader(in));
    public void checkPrime(int ... is) {
        for (int i : is) {
            if (isPrime(i) && i != 1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}

//expression lambda
import java.io.*;
import java.util.*;
interface PerformOperation {
 boolean check(int a);
}
class MyMath {
 public static boolean checker(PerformOperation p, int num) {
  return p.check(num);
 }

 PerformOperation is_odd() {
        PerformOperation op = (int i) -> (i % 2 == 1) ? true : false;
        return op;
    };

    PerformOperation is_prime() {
        PerformOperation op = (int i) -> {
            if (i == 1) {
                return false;
            } else {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        return false;
                    }
                }
                return true;
            }
        };
        return op;
    }

    public PerformOperation is_palindrome() {
        PerformOperation op = (int i) -> {
            String s = Integer.toString(i);
            String sr = new StringBuilder(s).reverse().toString();
            return s.equals(sr) ? true : false;
        };
        return op;
    }
}

public class Solution {

 public static void main(String[] args) throws IOException {
  MyMath ob = new MyMath();
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  int T = Integer.parseInt(br.readLine());
  PerformOperation op;
  boolean ret = false;
  String ans = null;
  while (T--> 0) {
   String s = br.readLine().trim();
   StringTokenizer st = new StringTokenizer(s);
   int ch = Integer.parseInt(st.nextToken());
   int num = Integer.parseInt(st.nextToken());
   if (ch == 1) {
    op = ob.is_odd();
    ret = ob.checker(op, num);
    ans = (ret) ? "ODD" : "EVEN";
   } else if (ch == 2) {
    op = ob.is_prime();
    ret = ob.checker(op, num);
    ans = (ret) ? "PRIME" : "COMPOSITE";
   } else if (ch == 3) {
    op = ob.is_palindrome();
    ret = ob.checker(op, num);
    ans = (ret) ? "PALINDROME" : "NOT PALINDROME";

   }
   System.out.println(ans);
  }
 }
}

 //MD5
import java.io.*;
import java.util.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Solution {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner sc =new Scanner(System.in);
            String str = sc.nextLine();
            
            
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(str.getBytes());

            byte byteData[] = md.digest();

            //convert the byte to hex format method 1
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < byteData.length; i++) {
             sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
            }

            //System.out.println("Digest(in hex format):: " + sb.toString());

            //convert the byte to hex format method 2
            StringBuffer hexString = new StringBuffer();
            for (int i=0;i<byteData.length;i++) {
                String hex=Integer.toHexString(0xff & byteData[i]);
                if(hex.length()==1) hexString.append('0');
                hexString.append(hex);
            }
            System.out.println(hexString.toString());
    }
}

//SHA-256
import java.io.*;
import java.util.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Solution {

    public static void main(String[] args) throws NoSuchAlgorithmException{
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc =new Scanner(System.in);
               String str = sc.nextLine();
               
               
               MessageDigest md = MessageDigest.getInstance("SHA-256");
               md.update(str.getBytes());

               byte byteData[] = md.digest();

               //convert the byte to hex format method 1
               StringBuffer sb = new StringBuffer();
               for (int i = 0; i < byteData.length; i++) {
                sb.append(Integer.toString((byteData[i] & 0xff) + 0x100, 16).substring(1));
               }

               //System.out.println("Digest(in hex format):: " + sb.toString());

               //convert the byte to hex format method 2
               StringBuffer hexString = new StringBuffer();
               for (int i=0;i<byteData.length;i++) {
                   String hex=Integer.toHexString(0xff & byteData[i]);
                   if(hex.length()==1) hexString.append('0');
                   hexString.append(hex);
               }
               System.out.println(hexString.toString());
    }
}

/Balanced Strings
public static void main(String []argh)
           {
              Scanner sc = new Scanner(System.in);
              
              while (sc.hasNext()) {
                 String input=sc.nextLine();
                  
                 Stack<String> st_brackets = new Stack();
                 Stack<String> st_curly = new Stack();
                 Stack<String> st_rec = new Stack();
                 boolean hasBeenfilled = false;
                 boolean symetric = true;
                 
                 
                 for(int i=0;i<input.length();i++){
                     
                     String currentChar = ""+input.toCharArray()[i];
                     String peekedChar = "";
                     
                     switch (currentChar) {
                        
                        case  "(" :
                         st_brackets.push(currentChar);
                         hasBeenfilled = true;
                         break;
                    
                         case  "{" :
                         st_curly.push(currentChar);
                         hasBeenfilled = true;
                         break;
                         
                        case  "[" :
                         st_rec.push(currentChar);
                         hasBeenfilled = true;
                         break;
                    
                        case  ")" :
                            
                            if(!st_brackets.isEmpty()) {
                            peekedChar = st_brackets.peek();
                            
                            if(peekedChar.compareTo("(")==0) st_brackets.pop();
                            }
                             else {
                                 symetric = false;
                                }
                        break;
                    
                         case  "}" :
                            if(!st_curly.isEmpty()) {
                                
                             peekedChar = st_curly.peek();
                            
                            if(peekedChar.compareTo("{")==0) st_curly.pop();
                            }
                         else {
                             symetric = false;
                            }
                        break;
                         
                        case  "]" :
                        if(!st_rec.isEmpty()) {
                            
                        peekedChar = st_rec.peek();
                        
                        if(peekedChar.compareTo("[")==0) st_rec.pop();
                        
                        } else {
                         symetric = false;
                        }
                    
                         break;
                         
                        }
                     
                 }
                 
                 
                 
                 boolean isBalanced = st_brackets.size()+st_curly.size()+st_rec.size() == 0 && hasBeenfilled && symetric && input.length()%2==0;
                 
                 System.out.println(isBalanced);
                 
              }
              
           }



        //Java deque
import java.util.*;
public class test {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<Integer>();
        Set sub = new HashSet();
        int n = in.nextInt();
        int m = in.nextInt();

        int max = 0;

        for (int i = 0; i < n; i++) {
            
            int num = in.nextInt();
            
           deque.add(num);
           sub.add(num);
           if (deque.size() == m) {
               
               if (sub.size() > max) max = sub.size();
               int first = deque.remove();
               if (!deque.contains(first)) sub.remove(first);
               
           }
        }
        System.out.println(max);
    }
}

//Java PriorityQueue

class Student{
   private int token;
   private String fname;
   private double cgpa;
   public Student(int id, String fname, double cgpa) {
      super();
      this.token = id;
      this.fname = fname;
      this.cgpa = cgpa;
   }
   public int getToken() {
      return token;
   }
   public String getFname() {
      return fname;
   }
   public double getCgpa() {
      return cgpa;
   }
}

class Checker implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        // TODO Auto-generated method stub
        if (o2.getCgpa() < o1.getCgpa()) {
            return -1;
        } else if (o2.getCgpa() > o1.getCgpa()) {
            return 1;
        } else {
            if (o2.getFname().compareTo(o1.getFname()) > 0) {
                return -1;
            } else if (o2.getFname().compareTo(o1.getFname()) < 0) {
                return 1;
            } else {
                if (o2.getToken() < o1.getToken()) {
                    return 1;
                } else if (o2.getToken() > o1.getToken()) {
                    return -1;
                } else {
                    return 0;
                }
            }
        }
    }
}

public class Solution {

        public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          int totalEvents = Integer.parseInt(in.nextLine());
          Comparator<Student> checker = new Checker();
          PriorityQueue<Student> pq = new PriorityQueue<Student>(1000, checker);
          while(totalEvents>0){
              
             String event = in.next();


             switch (event) {
                case "ENTER" : 
                 String name = in.next();
                 double gpa = in.nextDouble();
                 int token = in.nextInt();
                 Student student = new Student(token, name, gpa);
                    pq.add(student);
                    break;
                case "SERVED" :
                    if (!pq.isEmpty())
                    pq.remove();
                    break;
             }                                                                  
               //Complete your code
               
             totalEvents--;
          }
          if (pq.isEmpty()) System.out.println("EMPTY");
          while (!pq.isEmpty()) {
              System.out.println(pq.peek().getFname());
              pq.remove();
          }
        }
}