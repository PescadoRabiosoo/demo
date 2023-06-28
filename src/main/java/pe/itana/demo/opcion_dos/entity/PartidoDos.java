package pe.itana.demo.opcion_dos.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class PartidoDos {
  @Id
  private Integer id;

  private String tipo;

  private String estado;
}
