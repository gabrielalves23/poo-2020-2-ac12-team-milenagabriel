package interfaces;

public class Pessoa {
  private String nome, endereco;

  public Pessoa (){}
  
  public Pessoa (String nome, String endereco){
    this.nome = nome;
    this.endereco = endereco;
  }

  public String getEndereco(){
    return endereco;
  }

  public void setEndereco(String endereco){
    this.endereco = endereco;
  }
  
  public String getNome(){
    return nome;
  }

  public void setNome(String nome){
    this.nome= nome;
  }
}