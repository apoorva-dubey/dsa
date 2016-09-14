package problems;// import java.util.Iterator;
import java.util.TreeSet;

class primeNumbers{
  public static void main(String args[]){
    System.out.println("Hello World");
    System.out.println(primeTillNum(5));

    System.out.println(isPrime(4));
  }
  static public TreeSet<Integer> primeTillNum (Integer n){

    TreeSet<Integer> primes = new TreeSet<Integer>();
    primes.add(2);
    for(Integer i = 3; i <= n; i++){
      if (primes.contains(i)){i++;}
      else if (isPrime(i)){
        primes.add(i);
      }
    }
    return primes;
  }
  static public boolean isPrime(Integer i) {
    for(Integer j = 3; j <= Math.sqrt(i) ; j=j+2){
      System.out.println("hi");
      if(i%j != 0 ){
        return false;
      }
    }
    return true;
  }
}
