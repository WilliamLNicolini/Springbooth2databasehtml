package nicolini.will.h2dbmanha.model;

import lombok.*;
import org.springframework.stereotype.Component;

import javax.persistence.*;

/**
 * @author williamnicolini
 * @since 04/05/2020 18:30
 * @version Gradle/Lombok Celulares 2.0
 */

@Component

@Getter @Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name= "celphones") //javax.persistence
public class CelphoneEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_celphones")
    private long id;

    @Column(name = "model")
    private String model;

    @Column(name = "mark")
    private String mark;

    @Column(name = "RAM")
    private String RAM;

    @Column(name = "memory")
    private String memory;
}
