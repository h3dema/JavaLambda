import java.util.Arrays;

class exemplo5 {

  public static void main(String[] args) {
    final String separador= ",";
    Arrays.asList( "a", "b", "d" ).forEach(( String e ) -> System.out.print( e + separador ) );
    System.out.println("");
  }

}