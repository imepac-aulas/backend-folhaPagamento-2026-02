package br.edu.imepac.folhapagamento.repositories;

import br.edu.imepac.folhapagamento.entities.Professor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfessorRepository extends JpaRepository<Professor,Long> {
}
