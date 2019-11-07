import java.util.function.Function;

class exemplo14 {
  
  public static void main(String[] args) {
    Function<String, Integer> comprimento = (s) -> s.length(); // retorna o tamanho da string
    Function<Integer, Boolean> maiorQueCinco = (i) -> i > 5;

    System.out.println(comprimento.andThen(maiorQueCinco).apply("Hello world !!")); 
    System.out.println(comprimento.andThen(maiorQueCinco).apply("Hello")); 
  }
}