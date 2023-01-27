public class pragrams {

    //1. Factorial of a Number:
    //public class Factorial {
    //public static void main(String[] args) {
    //int num=5, fact=1;
    //for(int i=1; i<=num; i++){
    //fact=fact*i;
    //}
    //System.out.println("The Factorial of the number "+num +" is :" +fact);
    //}
    //}
    //2. Odd / Even Number:
    //public class OddorEven {
    //public static void main(String[] args) {
    //int num = 44;
    //if(num%2==0)
    //System.out.println("the given number is even");
    //else
    //System.out.println("the given number is odd");
    //}
    //}
    //3. Swap two variables without Third variable:
    //public class SwapNumbers {
    //public static void main(String[] args) {
    //int a =1, b=2;
    //System.out.println("Before Swapping: a = " +a +" and b = " +b);
    //a=a+b;
    //b=a-b;
    //a=a-b;
    //System.out.println("After Swapping: a = " +a +" and b = " +b);
    //}
    //}

    //4. Duplicates in an Array:
    //public class ArrayDuplicate {
    //public static void main(String[] args) {
    //String[] strArray = {"abc", "def", "mno", "xyz", "pqr", "xyz", "abc"};
    // //1. Using Brute Force Method
    // for (int i = 0; i < strArray.length-1; i++)
    // {
    // for (int j = i+1; j < strArray.length; j++)
    // {
    // if( (strArray[i].equals(strArray[j])) && (i != j) )
    // {
    // System.out.println("Brute Force Method : Duplicate Element is : "+strArray[i]);
    // }
    // }
    // }

    ////2. Using Colections -HashSet
    // HashSet<String> hs = new HashSet<String>();
    // for (String arrayElement : strArray)
    // {
    // if(!hs.add(arrayElement))
    // {
    // System.out.println("HashSet :Duplicate Element is : "+arrayElement);
    // }
    // }
    // }
    //}
    //5. Fibonacci Series:
    //public class FibonacciSeries {
    //public static void main(String[] args) {
    //int febCount = 15;
    // int[] feb = new int[febCount];
    // feb[0] = 0;
    // feb[1] = 1;
    // for(int i=2; i < febCount; i++){
    // feb[i] = feb[i-1] + feb[i-2];
    // }
    // for(int i=0; i< febCount; i++){
    // System.out.print(feb[i] + " ");
    // }
    //}
    //}6. Palindrome Number:
    //public class Palindromenumber {
    //public static void main(String[] args) {
    //int rem,sum=0,temp;
    // int num=252;//It is the number variable to be checked for palindrome
    //
    // temp=num;
    // while(num>0){
    // rem=num%10; //getting remainder
    // sum=(sum*10)+rem;
    // num=num/10;
    // }
    // if(temp==sum)
    // System.out.println("palindrome number ");
    // else
    // System.out.println("not palindrome");
    //}
    //}

    //8. Prime Number:
    //public class PrimeNumber {
    //public static void main(String[] args) {
    //int num =21, i, flag=0;
    ////Prime number is one that is not divisible by the numbers starting from "2" to half of that number
    ////example: For 10: it is prime if it is not divisible by the numbers: 2,3,4,5 where 5 is half of 10
    //for(i=2; i<num/2; i++){
    //if(num%i==0){
    //System.out.println("The given number is not prime");
    //flag=1;
    //break;
    //}
    //}
    //if(flag==0)
    //System.out.println("The given number is prime");
    //}
    //}
    //7. Palindrome String:
    //public class StringPalindrome {
    //public static void main(String[] args) {
    //String text = "madam";
    ///**************Using String buffer methods*************/
    //String rev = new StringBuffer(text).reverse().toString();
    //if (rev.equalsIgnoreCase(text))
    //System.out.println("Validated with String Buffer Method: The given string is palindrome");
    //else
    //System.out.println("Validated with String Buffer Method:The given string is not palindrome");
    ///**********************************************************/
    ///**************Without Using String buffer methods*************/
    //String reverse="";
    //for(int i=text.length()-1; i>=0; i--){
    //reverse = reverse+text.charAt(i);
    //}
    //if (rev.equalsIgnoreCase(text))
    //System.out.println("Validated without String Buffer Method: The given string is palindrome");
    //else
    //System.out.println("Validated without String Buffer Method:The given string is not palindrome");
    //}
    //}
}
