package fr.formation.spring.calculatrice.controller;

import fr.formation.spring.calculatrice.models.Operation;
import fr.formation.spring.calculatrice.service.OperationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/operation")

public class OperationController {

    private final OperationService operationService;
    @PostMapping("/addition")
    public int addition(@RequestBody Operation operation) {
        return operationService.addition(operation);
    }
    @PostMapping("/soustraction")
    public int soustraction(@RequestBody Operation operation) {
        return operationService.soustraction(operation);
    }

    @PostMapping("/division")
    public int division(@RequestBody Operation operation) {
        return operationService.division(operation);
    }
    @PostMapping("/multiplication")
    public int multiplication(@RequestBody Operation operation) {
        return operationService.multiplication(operation);
    }
    @PostMapping("/modulo")
    public int modulo(@RequestBody Operation operation) {
        return operationService.modulo(operation);
    }
}
