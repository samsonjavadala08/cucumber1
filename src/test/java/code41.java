


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import java.util.Arrays;
import java.util.Collections;

public class code41 {

	public static void main(String[] args) {
		
		
		int number;
		double rate;
		float milage;
		char nn;
		byte bb;
		
		//code41.game("noshdhd");
		//code41.reversestatement();
		//System.out.println("this is the code practice");
		//code41.logic();
		//code41.practice();
		//code41.reversstring();
		//code41.PalindromeCheck();
		//code41.CountCharacterOccurrences();
		//code41.FindDuplicatesinArray();
		//code41.dupsenctence();
	//	code41.primenumber();
	//	code41.numcharcer();
	//	code41.revsarrya();
		//code41.PalindromeCheck();
		//code41.countdup();
		code41.febo();
		code41.revInteger();
		code41.countdup();
		code41.CountCharacterOccurrences();
	}
	
  public static void game(String sam) {
	  
	 // Scanner name = new Scanner(first);
	 // String sam=name.next();
	  //String sam;
	  String rev="";
	  for (int i=sam.length()-1;i<=0;i--) {
		  
		  rev=rev+sam.charAt(i);
		  
	  }
	  System.out.println(rev);
	  
	  
  }
  
  public static void reversestatement() {
	  
	 String plain="football is the best game in world";
	 String [] words=plain.split(" ");
	 String rev = null;
	 
	 for(int i=words.length-1;i>=0;i--) {
		 rev= rev+ words[i];
	 }
	  System.out.println(rev);
  }
  
  public static void logic() {
	  
	  String question= "which is the strongest nation in world?";
	  String [] words=question.split(" ");
	 
	  
	  System.out.println("the length of question is "+words.length);
	  System.out.println(words[2]);
	//  for(int i=0;i<words.length;i++) {
	//	  System.out.println(words[i]);
		  
		  for (String s:words) {
			  if(s==s) {
				  System.out.println(s);
			  }
		  }
	  }
  
  public static void practice() {
	  // checking count occurance of each character in a string
	  
	  String test ="Automation";
	  char [] abc= test.toCharArray();
	  
	  HashMap <Character,Integer> map= new HashMap<>();
	  
	  for(char c:abc) {
		 
		  map.put(c,  map.getOrDefault(c, 0) + 1);
		  
		  
			  
		  }
	  System.out.println(map);
	  }
  
 /////////////////////// code practice////////
  
  
  public static void reversstring() {
	  
	  String name= "samson";
	  
	  String rev="";
	  
	  for (int i=name.length()-1;i>=0;i-- ) {
		  
		  rev= rev+ name.charAt(i); 
		  
	  }
	  System.out.println(rev);
	  
	  
  }
  
  ///////////////////Palindrome Check//////////////////////////
  
  public static void PalindromeCheck() {
  Scanner scanner = new Scanner(System.in);
  System.out.println("input one string to check if its a plaindrome");
  String name =scanner.next();
	  
	 
  String rev="";
  Boolean check=true;
  
  for (int i =name.length()-1; i>=0;i--) {
	  
	 rev=rev+name.charAt(i);
	 
	
  }
  
  System.out.println("reverse of name " + name +" is "+ rev);
  
  if(!name.equalsIgnoreCase(rev))
  {
	  check=false;
	  System.out.println(name + " is not a plaindrome");
	  System.out.println(check);
  }else {
	  System.out.println(name + " is a plaindrome");
  }
  
  }
  
  //////////////////////////Count Character Occurrences/////////////////////////////
  
  public static void CountCharacterOccurrences(){
	  
	  String words="mastertraingin";
	  char [] car=words.toCharArray();
	  int count=0;
	  
	  for(int i=0;i<words.length();i++ )
	  {
		  for (int j=i+1;j<words.length();j++) {
			  if (car[i]==car[j]) // 
			  {
				 System.out.println(car[i] + " is a duplicate") ;
			  }
		  }
	  }
	  
	  
  }
  ////Find Duplicates in Array////
  
  public static void FindDuplicatesinArray() {
	  
	  int[] arr= {1,2,3,3,4,5,4,5,6,7,};
	  
	  Set<Integer>tobeadd= new HashSet<Integer>();
	  
	  Set<Integer>repeated= new HashSet<Integer>();
	  
	  for(int num:arr) {
		  if(!tobeadd.add(num)) {
			  repeated.add(num);
		  }
	  }
	  System.out.println("repeated is "+ repeated );
	  
  }
  public static void dupsenctence() {
	  
	  String Sentence="she sells sea shells on a sea shore and she dont have any shells to sell today";
	  
	String[]abc=  Sentence.split(" ");
	
	Set<String> nonrepeat= new HashSet<String>();
	
	Set<String> duplicate=new HashSet<String>();
	
	for(String s:abc) {
		if(!nonrepeat.add(s)) {
			duplicate.add(s);
		}
		
		
	}
	
	
	  
	System.out.println("These are the duplicate words "+ duplicate); 
	
	////by enhanced for  loop
	for (String b:duplicate) {
		System.out.println(b); 
	}
	//// index of can be done only with list// for modified for loop
	
	List<String> list= new ArrayList<>(
);
	
	for(int i=0;i<list.size();i++) {
		System.out.println(list.get(i));
	}
	
  }
  
  public static void primenumber() {
	  
	  int number=57;
	boolean   isprime=true;
	  
	  for(int i=2;i<=number/2;i++) {
		  if(number%i==0) {
			System.out.println(number + " is  not a prime num") ;
			isprime=false;
			break;
		  }
	  }
	  
	  if(isprime) {
		  
		  System.out.println(number + "is a prime number");
	  }
	  
  }
  //// ci pipleline run details
  
 // name: Run Cucumber Tests
 // run: mvn test -Dcucumber.filter.tags="@smoke"
  
 // name: Upload Extent Report
  //uses: actions/upload-artifact@v4
  //with:
    //name: cucumber-reports
    //path: target/ExtentReport
  
  public static void numcharcer() {
	  
	  String name = "fsdfdsgsfgsiogjowggwgds90wehr";
	  
	  char [] abc= name.toCharArray();
	  Map<Character,Integer> count= new HashMap<>();
	  
	  for (char s:abc) {
		  count.put(s, count.getOrDefault(s, 0)+1) ;
	  }
	  
	  for(Map.Entry<Character, Integer> entry:count.entrySet()) {
		  
		  System.out.println(entry.getKey() + " : " + entry.getValue());
	  }
		  
	  
	  
	  
  }
  
 
  
   public static void revsarrya() {
	  
	   int[] numbers = {3, 5, 6, 7, 2};
       Arrays.sort(numbers); // sorts ascending

       System.out.println(Arrays.toString(numbers)); // prints [2, 3, 5, 6, 7]
       
       
       Integer[] ere = {2, 4, 6, 7, 8};
       Arrays.sort(ere, Collections.reverseOrder());//revers decending
       
       System.out.println(Arrays.toString(ere));
  }
   
   public static void countdup(){
	   String name= "fdsfsdfhdfsfgksjgsg";
       
       char[]  ch= name.toCharArray();

       HashMap<Integer,Character> mp= new HashMap<>();
       HashMap<Character,Integer>mp1= new HashMap<>();
     int index=0;
       for(char c:ch){
          mp.put(index,c);
          index ++;

           //mp1.put
       mp1.put( c,mp1.getOrDefault(c,0) +1) ;  
       }

       System.out.println(mp);

       System.out.println(mp.get(12));
       for(Map.Entry<Character,Integer> entry : mp1.entrySet()){
           System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times");
       }
       
   }
   
   public static void sbuilder() {
	
	   
	   StringBuilder builder =new StringBuilder();
	   
	   String name ="this is teh practive of word";
	   
	   String [] word=name.split(" ");
	   
	   for(int i= name.length()-1;i>=0;i--) {
		   
		   
	   }
	   
   }
   
   // access modifier 
   
//   private → only inside the class.
//
//   default (package-private) → inside the package.
//
//   protected → inside package + subclasses.
//
//   public → everywhere.
//   How much % you will automate the test case. What factor involved to select the test case for automation.
//   3. API Testing ? 
//   4. Sort an array in descending order.
//   5. Reverse String without reversing the word.
//   6. Final , Finally , Finalize.
//   7. String , String builder, String buffer.
//   8. Visibility of access modifier. High to low ( public, default, protected, private)
//   9. Diff btw constructor and method.
//   10. Can we overload static method. What is static method.
//   11. Interfaces in collection.
//   12. List , arraylist , dequeue, set
//   13. Screenshot script in selenium.
//   14. Sprint duration of project. Alige.
//   15. When a defect is deffered.
   
   
   public static void febo() {
	   int a=0, b=1;
	   for(int i=0;i<5;i++){
	       System.out.print(a+" ");
	       int c = a+b;
	       a=b;
	       b=c;
	   }
   }
   
   public static void revInteger() {
	   
	   Integer[]abc={3,5,6};

       List<Integer> acc=Arrays.asList(abc);

       Collections.reverse(acc);
       System.out.println(acc);
   }
   
   public static void rmvdupfrmsentence() {
	
	   int [] arr={2,3,4,6,4,56,3,5,2,6};
       String song ="this is the day that the lord has made and we will sams not is thisw wht";

       String [] pq=song.split(" ");

       //System.out.println(arr.length);

   Set<String>  abc= new HashSet<> ();
       Set<String>  qabc= new HashSet<> ();

       for(String n:pq){
           if(!abc.add(n)){
               qabc.add(n);
           }else {
               abc.add(n);
           }  
       }
       
       System.out.println("thsi are duplicates"+ qabc);
abc.removeAll(qabc);
      // abc.removeAll(qabc);
       System.out.println("thsi are non duplicates"+abc);
   }
   
   /***
    * // Take screenshot and store as file
    * File 
    * 
    * dsdsd
    */
  
  
  
  
  
	  
	  
	  
  }
  
  
  

