package br.edu.imepac.folhapagamento.services;

import br.edu.imepac.folhapagamento.entities.Professor;
import br.edu.imepac.folhapagamento.repositories.ProfessorRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfessorService {

    private ProfessorRepository professorRepository;

    public ProfessorService(ProfessorRepository professorRepository) {
        this.professorRepository = professorRepository;
    }

    public Professor save(Professor professor) {
        return professorRepository.save(professor);
    }

    public List<Professor> listAll() {
        return professorRepository.findAll();
    }

    public Professor findById(Long id) {
        return professorRepository.findById(id).get();
    }
}
