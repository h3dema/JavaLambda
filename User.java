class User {
  private String nome;
  private String tipo;
  
  User() {}
  
  User(String nome, String tipo) {
    this.nome = nome;
    this.tipo = tipo;
  }
  
  void setNome(String nome) {this.nome = nome;}
  void setTipo(String tipo) {this.tipo = tipo;}
  String getNome() {return nome;}
  String getTipo() {return tipo;}
  
  @Override
  public String toString() {
    return nome + "[" + tipo + "]";
  }
}

