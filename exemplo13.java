import java.util.function.Function;

class exemplo13 {
  
  public static void main(String[] args) {
    Function<String, Integer> comprimento = (s) -> s.length(); // retorna o tamanho da string
    
    System.out.println(comprimento.apply("Hello world"));   // tamanho = 11
    System.out.println(comprimento.apply("1234567890123")); // tamanho = 13
  }
}