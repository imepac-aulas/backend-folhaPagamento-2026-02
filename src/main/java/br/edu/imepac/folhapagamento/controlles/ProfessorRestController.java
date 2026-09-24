package br.edu.imepac.folhapagamento.controlles;

import br.edu.imepac.folhapagamento.entities.Professor;
import br.edu.imepac.folhapagamento.services.ProfessorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/professores")
@CrossOrigin(origins = "http://localhost:4200")
public class ProfessorRestController {

    private ProfessorService professorService;

    public ProfessorRestController(ProfessorService professorService) {
        this.professorService = professorService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Professor salvar(@RequestBody Professor professor) {
        return professorService.save(professor);
    }

    @GetMapping
    public ResponseEntity<List<Professor>> obterTodos() {
        return ResponseEntity.ok(professorService.listAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Professor> obterPorId(@PathVariable Long id) {
        return ResponseEntity.ok(professorService.findById(id));
    }
}
