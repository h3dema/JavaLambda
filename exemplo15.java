import java.util.function.Function;

class exemplo15 {
  
  public static void main(String[] args) {
    Function<String, Integer> comprimento = (s) -> s.length(); // retorna o tamanho da string
    Function<Integer, Boolean> maiorQueCinco = (i) -> i > 5;
    // vamos montar uma cadeia de funções
    Function<String, Boolean> cadeia = comprimento.andThen(maiorQueCinco);
    
    System.out.println(cadeia.apply("Hello world !!")); 
    System.out.println(cadeia.apply("Hello")); 
  }
}