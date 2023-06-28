package pe.itana.demo.opcion_uno.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import java.io.Serializable;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Usuario implements Serializable {

  @Id
  private Integer id;

  private String email;

  private String nombres;

  private String apellidos;

  private String alias;

  private String urlAvatar;

}
