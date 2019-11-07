import java.util.function.Consumer;

class exemplo18 { 
  
  public static void main(String[] args) {
    Consumer<User> userConsumer = (u) -> System.out.println("Nome: " + u.getNome());
    
    User usuario = new User("Ana", "Admin");
    userConsumer.accept(usuario);
  }
}