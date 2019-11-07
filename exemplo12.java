import java.util.function.Predicate;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class exemplo12 {
  
  static List<User> process(List<User> usuarios, Predicate<User> predicate) {
    List<User> result = new ArrayList<>();
    for (User usuario : usuarios) {
      if (predicate.test(usuario)) {
        result.add(usuario);
      }
    }
    return result;
  }
    
  public static void main(String[] args) {
    List<User> usuarios = new ArrayList<>();
    usuarios.add(new User("Joao", "admin"));
    usuarios.add(new User("Maria", "membro"));
    usuarios.add(new User("Ana", "membro"));
    usuarios.add(new User("Jose", "membro"));
    
    List<User> admins = process(usuarios, (u) -> u.getTipo().equals("admin"));
    List<User> membros = process(usuarios, (u) -> u.getTipo().equals("membro"));

    System.out.println(Arrays.toString(admins.toArray()));
    System.out.println(Arrays.toString(membros.toArray()));
  }
}