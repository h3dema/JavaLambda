import java.util.function.Predicate;

class exemplo9 {
  public static void main(String[] args) {
    Predicate<Integer> maiorQueDez = (i) -> i > 10;
    
    // imprime true
    System.out.println(maiorQueDez.test(14));
  }
}