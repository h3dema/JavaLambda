import java.util.function.Supplier;

class exemplo17 { 
  
  public static void main(String[] args) {
    // podemos utilizar Supplier para retornar um método estático
    Supplier<User> userSupplier = UserFactory::produceUser;
    User usuario = userSupplier.get();
    usuario.setNome("Tulio"); 
    System.out.println(usuario);
  }
}