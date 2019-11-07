  class UserFactory {
    public static User produceUser() {
      return new User();
    }

    public static User produceUser(String nome, String tipo) {
      return new User(nome, tipo);
    }
  
  }