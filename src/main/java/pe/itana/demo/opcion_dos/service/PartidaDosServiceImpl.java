package pe.itana.demo.opcion_dos.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.itana.demo.opcion_dos.entity.PartidoDos;
import pe.itana.demo.opcion_dos.model.PartidoDosDto;
import pe.itana.demo.opcion_dos.repository.PartidoDosRepository;
import pe.itana.demo.opcion_uno.entity.Partido;

@Service
public class PartidaDosServiceImpl implements PartidoDosService {

  @Autowired
  PartidoDosRepository partidoDosRepository;

  @Override
  public List<PartidoDosDto> findDtoByIdUsuario(Integer idUsuario) {
    return partidoDosRepository.findPartidoTerminadoDtosByIdUsuario(idUsuario);
  }

  @Override
  public List<PartidoDos> findAll() {
    return partidoDosRepository.findAll();
  }
}
