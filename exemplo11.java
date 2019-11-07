import java.util.function.Predicate;

class exemplo11 {
  
  static void process(int number, Predicate<Integer> predicate) {
    if (predicate.test(number)) {
      System.out.println("Numero " + number + " foi aceito!");
    } else 
      System.out.println("Numero " + number + " não foi aceito!");
  }
  
  
  public static void main(String[] args) {
    
    process(10, (i) -> i > 7);  // aceito pois 10 > 7

    process(10, (i) -> i > 11); // não aceito pois 10 < 11
  }
}