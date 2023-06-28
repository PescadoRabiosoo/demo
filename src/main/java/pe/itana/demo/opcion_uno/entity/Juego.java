package pe.itana.demo.opcion_uno.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
public class Juego implements Serializable {

  @Id
  private Integer id;

  @ManyToOne
  @JoinColumn(name = "id_partido", nullable = false)
  @JsonBackReference
  @ToString.Exclude
  private Partido partido;

  private Integer nroSets;

}
