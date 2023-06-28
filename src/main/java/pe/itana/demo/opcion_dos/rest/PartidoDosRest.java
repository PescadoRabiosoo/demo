package pe.itana.demo.opcion_dos.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.itana.demo.opcion_dos.entity.PartidoDos;
import pe.itana.demo.opcion_dos.model.PartidoDosDto;
import pe.itana.demo.opcion_dos.service.PartidoDosService;

@RestController
@RequestMapping("partidos-dos")
public class PartidoDosRest {

  @Autowired
  PartidoDosService partidoDosService;

  @GetMapping("/{id}")
  public List<PartidoDosDto> findDtoByIdUsuario(@PathVariable Integer id) {
    return partidoDosService.findDtoByIdUsuario(id);
  }

  @GetMapping
  public List<PartidoDos> findDtoByIdUsuario() {
    return partidoDosService.findAll();
  }

}

