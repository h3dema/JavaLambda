import java.util.Arrays;

class exemplo7 {
  
  public static void main(String[] args) {
    Arrays.asList( "a", "b", "d" ).sort( ( e1, e2 ) -> {
      int result = e1.compareTo( e2 );
      return result;
    }
    );
  }
}