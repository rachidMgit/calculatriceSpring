package fr.formation.spring.calculatrice.models;

import lombok.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/*
@Component
*/
/*
@Scope("prototype")
*/
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Operation {

    private String operateur;
    private int nombre1;
    private int nombre2;
}
