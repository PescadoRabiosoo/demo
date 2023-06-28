package pe.itana.demo.opcion_dos.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class UsuarioDos {

  @Id
  private Integer id;

  private String email;

  private String nombres;

  private String apellidos;

  private String alias;

  private String url;
}
