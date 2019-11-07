import java.util.function.Supplier;

class exemplo16 {
  
  public static void main(String[] args) {
    // podemos utilizar Supplier para retornar um construtor de classe
    Supplier<User> fornecedorUsuario = User::new;
    User usuario = fornecedorUsuario.get();
    usuario.setNome("Tulio"); 
    System.out.println(usuario);
  }
}