import java.util.Arrays;

/*

    prints the elements (twice for each entry)

JavaLambda$ java exemplo3
aabbdd


 */


class exemplo3 {

  public static void main(String[] args) {
    Arrays.asList( "a", "b", "d" ).forEach( e -> {
      System.out.print( e );
      System.out.print( e );
    }  );

    System.out.println("");  // only to inset a new line
  }

}