package br.com.clinicamedica.CadastroPessoas;

import jakarta.persistence.*;


// Com o decorador @Entity irá transformar esta classe em uma entidade do banco de dados.
// Com o decorador @Table irá criar a tabela no banco de dados e voce pode atribuir um nome a ela.
// JPA = Java Persistence API
@Entity
@Table(name="tbl_cadastro") // Boa pratica --> coloque o nome da table em snakecase
public class PessoaModel {






    @Id // O atributo logo a baixo será um id.
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Passar uma estategia de como gerar o id
    private long id;
    private String nome;
    private String email;
    private int idade;


    public PessoaModel() {
    }

    public PessoaModel(String nome, int idade, String email) {
        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }
}
