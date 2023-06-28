package pe.itana.demo.opcion_uno.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.itana.demo.opcion_uno.entity.Partido;
import pe.itana.demo.opcion_uno.model.PartidoDto;
import pe.itana.demo.opcion_uno.model.PartidoModificadoDto;
import pe.itana.demo.opcion_uno.repository.PartidoRepository;

@Service
public class PartidoServiceImpl implements PartidoService {

  @Autowired
  PartidoRepository partidoRepository;
  @Override
  public List<PartidoDto> findDtoByIdUsuario(Integer idUsuario) {
    return partidoRepository.findPartidoTerminadoDtosByIdUsuario(idUsuario);
  }

  @Override
  public List<PartidoModificadoDto> findModificadoDtoByIdUsuario(Integer idUsuario) {
    return null;
  }

  @Override
  public List<Partido> findAll() {
    return partidoRepository.findAll();
  }
}
