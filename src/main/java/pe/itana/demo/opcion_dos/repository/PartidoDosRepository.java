package pe.itana.demo.opcion_dos.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.itana.demo.opcion_dos.entity.PartidoDos;
import pe.itana.demo.opcion_dos.model.PartidoDosDto;

public interface PartidoDosRepository extends JpaRepository<PartidoDos, Integer> {

  @Query(" SELECT pd.id AS id, "
      + "         pd.tipo AS tipo, "
      + "         pd.estado AS estado, "
      + "         (SELECT usu.nombres "
      + "            FROM UsuarioDos usu "
      + "           WHERE pt.participanteId.equipo = 1 "
      + "             AND pt.participanteId.idUsuario = usu.id) AS nombreRetadorUno, "
      + "         (SELECT usu.nombres "
      + "            FROM UsuarioDos usu "
      + "           WHERE pt.participanteId.equipo = 2 "
      + "             AND pt.participanteId.idUsuario = usu.id) AS nombreRetadoUno, "
      + "         (SELECT usu.nombres "
      + "            FROM UsuarioDos usu "
      + "           WHERE pt.participanteId.equipo = 1 "
      + "             AND pt.participanteId.idUsuario = usu.id) AS nombreRetadorDos, "
      + "         (SELECT usu.nombres "
      + "            FROM UsuarioDos usu "
      + "           WHERE pt.participanteId.equipo = 2 "
      + "             AND pt.participanteId.idUsuario = usu.id) AS nombreRetadoDos "
      + "    FROM PartidoDos pd, Participante pt "
      + "   WHERE pd.id = pt.participanteId.idPartido "
      + "     AND pd.estado = 'TERMINADO' "
      + "     AND pt.participanteId.idUsuario = :idUsuario ")
  List<PartidoDosDto> findPartidoTerminadoDtosByIdUsuario(Integer idUsuario);
}
