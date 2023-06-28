package pe.itana.demo.opcion_uno.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.itana.demo.opcion_uno.entity.Partido;
import pe.itana.demo.opcion_uno.model.PartidoDto;

public interface PartidoRepository extends JpaRepository<Partido, Integer> {

  @Query("SELECT pt "
      + "   FROM Partido pt JOIN FETCH pt.retadorUno"
      + "                   JOIN FETCH pt.retadoUno"
      + "                   LEFT JOIN FETCH pt.retadorDos"
      + "                   LEFT JOIN FETCH pt.retadoDos"
      + " WHERE pt.estado = 'TERMINADO' "
      + "    AND ((pt.retadorUno.id = :idUsuario) "
      + "    OR (pt.retadoUno.id = :idUsuario) "
      + "    OR (pt.retadorDos.id = :idUsuario) "
      + "    OR (pt.retadoDos.id = :idUsuario)) ")
  List<PartidoDto> findPartidoTerminadoDtosByIdUsuario(Integer idUsuario);

}
