package fr.formation.spring.calculatrice.service;

import fr.formation.spring.calculatrice.models.Operation;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OperationService {

    public int addition(Operation operation) {
        int resultat = 0;
        if (operation.getOperateur().equals("+")){
            resultat = operation.getNombre1() + operation.getNombre2();
        }else {
            System.out.println("erreur opérateur");
        }
        return resultat;
    }


    public int soustraction(Operation operation) {
        int resultat = 0;
        if (operation.getOperateur().equals("-")){
            resultat = operation.getNombre1() - operation.getNombre2();
        }else {
            System.out.println("erreur opérateur");
        }
        return resultat;
    }

    public int division(Operation operation) {
        int resultat = 0;
        if (operation.getOperateur().equals("/")){
            resultat = operation.getNombre1() / operation.getNombre2();
        }else {
            System.out.println("erreur opérateur");
        }
        return resultat;
    }

    public int multiplication(Operation operation) {
        int resultat = 0;
        if (operation.getOperateur().equals("*")){
            resultat = operation.getNombre1() * operation.getNombre2();
        }else {
            System.out.println("erreur opérateur");
        }
        return resultat;
    }

    public int modulo(Operation operation) {
        int resultat = 0;
        if (operation.getOperateur().equals("%")){
            resultat = operation.getNombre1() % operation.getNombre2();
        }else {
            System.out.println("erreur opérateur");
        }
        return resultat;
    }

}
