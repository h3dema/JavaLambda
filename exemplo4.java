import java.util.Arrays;

/*
  prints the elements of an array, with a separator


JavaLambda$ java exemplo4
a,b,d,


 */

class exemplo4 {

  public static void main(String[] args) {
    String separador= ",";
      Arrays.asList( "a", "b", "d" ).forEach(( String e ) -> System.out.print( e + separador ) );

    System.out.println("");
  }

}