package pe.itana.demo.opcion_uno.service;

import java.util.List;

import pe.itana.demo.opcion_uno.entity.Partido;
import pe.itana.demo.opcion_uno.model.PartidoDto;
import pe.itana.demo.opcion_uno.model.PartidoModificadoDto;

public interface PartidoService {

  List<PartidoDto> findDtoByIdUsuario(Integer idUsuario);

  List<PartidoModificadoDto> findModificadoDtoByIdUsuario(Integer idUsuario);

  List<Partido> findAll();
}
