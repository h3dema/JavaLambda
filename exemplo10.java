import java.util.function.Predicate;

class exemplo10 {
  public static void main(String[] args) {
    Predicate<Integer> maiorQueDez = (i) -> i > 10;
    Predicate<Integer> menorQueVinte = (i) -> i < 20;
    
    // imprime true
    System.out.println(maiorQueDez.and(menorQueVinte).test(15));
    
    // imprime false
    System.out.println(maiorQueDez.and(menorQueVinte).negate().test(15));
  }
}