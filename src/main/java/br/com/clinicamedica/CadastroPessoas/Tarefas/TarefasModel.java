package br.com.clinicamedica.CadastroPessoas.Tarefas;


import br.com.clinicamedica.CadastroPessoas.Pessoas.PessoaModel;
import jakarta.persistence.*;

@Entity
@Table(name = "tbl_tarefas")
public class TarefasModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Identity gera o id de forma sequencial
    private long id;
    private String rank;
    private String materia;

    // @OneToMany = Uma tarefa pode ter varias pessoas
    @OneToMany(mappedBy = "tarefas")
    private PessoaModel pessoa;




    public TarefasModel(){
    }

    public TarefasModel(long id, String nome_tarefa, String rank){
        this.id = id;
        this.materia = materia;
        this.rank = nome_tarefa;
    }
}
