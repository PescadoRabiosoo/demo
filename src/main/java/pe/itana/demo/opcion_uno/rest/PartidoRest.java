package pe.itana.demo.opcion_uno.rest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.itana.demo.opcion_uno.entity.Partido;
import pe.itana.demo.opcion_uno.model.PartidoDto;
import pe.itana.demo.opcion_uno.model.PartidoModificadoDto;
import pe.itana.demo.opcion_uno.service.PartidoService;

@RestController
@RequestMapping("partidos")
public class PartidoRest {

  @Autowired
  PartidoService partidoService;

  @GetMapping("/{id}")
  public List<PartidoDto> findDtoByIdUsuario(@PathVariable Integer id) {
    return partidoService.findDtoByIdUsuario(id);
  }

  @GetMapping("/modificado/{id}")
  public List<Partido> findModificadoDtoByIdUsuario(@PathVariable Integer id) {
    return partidoService.findAll();
  }
}
