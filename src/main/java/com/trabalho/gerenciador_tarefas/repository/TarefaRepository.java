package com.trabalho.gerenciador_tarefas.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.trabalho.gerenciador_tarefas.model.Tarefa;

@Repository
public interface TarefaRepository extends JpaRepository <Tarefa, Long>{

}
