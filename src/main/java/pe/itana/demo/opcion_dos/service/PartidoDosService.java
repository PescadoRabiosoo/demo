package pe.itana.demo.opcion_dos.service;

import java.util.List;

import pe.itana.demo.opcion_dos.entity.PartidoDos;
import pe.itana.demo.opcion_dos.model.PartidoDosDto;

public interface PartidoDosService {

  List<PartidoDosDto> findDtoByIdUsuario(Integer idUsuario);

  List<PartidoDos> findAll();
}
