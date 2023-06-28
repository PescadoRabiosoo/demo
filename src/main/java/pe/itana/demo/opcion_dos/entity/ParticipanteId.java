package pe.itana.demo.opcion_dos.entity;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Embeddable
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ParticipanteId implements Serializable {
  private static final long serialVersionUID = 1L;

  private Integer idUsuario;

  private Integer idPartido;

  private Integer equipo;
}
