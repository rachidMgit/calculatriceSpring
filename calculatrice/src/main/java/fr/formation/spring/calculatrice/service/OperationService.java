package fr.formation.spring.calculatrice.service;

import fr.formation.spring.calculatrice.models.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OperationService {

    public int addition(Operation operation) throws IllegalArgumentException {
        int resultat = 0;
        if (operation.getOperateur().equals("+")) {
            resultat = operation.getNombre1() + operation.getNombre2();
        } else {
            throw new IllegalArgumentException("operateur invalise");
        }
        return resultat;
    }


    public int soustraction(Operation operation) throws IllegalArgumentException {
        int resultat = 0;
        if (operation.getOperateur().equals("-")) {
            resultat = operation.getNombre1() - operation.getNombre2();
        } else {
            throw new IllegalArgumentException("operateur invalise");
        }
        return resultat;
    }

    public int division(Operation operation) throws IllegalArgumentException {
        int resultat = 0;
        if (operation.getOperateur().equals("/")) {
            resultat = operation.getNombre1() / operation.getNombre2();
        } else {
            throw new IllegalArgumentException("operateur invalise");
        }
        return resultat;
    }

    public int multiplication(Operation operation) throws IllegalArgumentException {
        int resultat = 0;
        if (operation.getOperateur().equals("*")) {
            resultat = operation.getNombre1() * operation.getNombre2();
        } else {
            throw new IllegalArgumentException("operateur invalise");
        }
        return resultat;
    }

    public int modulo(Operation operation) throws IllegalArgumentException {
        int resultat = 0;
        if (operation.getOperateur().equals("%")) {
            resultat = operation.getNombre1() % operation.getNombre2();
        } else {
            throw new IllegalArgumentException("operateur invalise");
        }
        return resultat;
    }

}
