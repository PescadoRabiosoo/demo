package pe.itana.demo.opcion_uno.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import java.io.Serializable;
import java.util.List;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
public class Partido implements Serializable {

  @Id
  private Integer id;

  private String tipo;

  private String estado;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_retador_uno", nullable = false)
  private Usuario retadorUno;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_retado_uno", nullable = false)
  private Usuario retadoUno;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_retador_dos")
  private Usuario retadorDos;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "id_retado_dos")
  private Usuario retadoDos;

  @OneToMany(mappedBy = "partido", cascade = CascadeType.ALL)
  @JsonManagedReference
  @JsonIgnore
  @ToString.Exclude
  private List<Juego> juegos;
}
