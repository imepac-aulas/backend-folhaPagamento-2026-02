package br.edu.imepac.folhapagamento.controlles;

import br.edu.imepac.folhapagamento.entities.Professor;
import br.edu.imepac.folhapagamento.services.ProfessorService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/professores")
public class ProfessorRestController {

    private ProfessorService professorService;

    public ProfessorRestController(ProfessorService professorService) {
        this.professorService = professorService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Professor save(@RequestBody Professor professor) {
        return professorService.save(professor);
    }
}
