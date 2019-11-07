import java.util.Arrays;

class exemplo6 {

  public static void main(String[] args) {
    Arrays.asList( "a", "b", "d" ).sort( ( e1, e2 ) -> e1.compareTo( e2 ) );
  }

}