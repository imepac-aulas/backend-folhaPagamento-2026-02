package br.edu.imepac.folhapagamento.services;

import br.edu.imepac.folhapagamento.entities.Professor;
import br.edu.imepac.folhapagamento.repositories.ProfessorRepository;
import org.springframework.stereotype.Service;

@Service
public class ProfessorService {

    private ProfessorRepository professorRepository;

    public ProfessorService(ProfessorRepository professorRepository){
        this.professorRepository = professorRepository;
    }

        public Professor save(Professor professor);
}
