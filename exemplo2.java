import java.util.Arrays;

/*
    same as exemplo1, but defines a type of the element

JavaLambda$ java exemplo2
a
b
d


 */


class exemplo2 {

  public static void main(String[] args) {
    Arrays.asList( "a", "b", "d" ).forEach( ( String e ) -> System.out.println( e ) );
  }

}