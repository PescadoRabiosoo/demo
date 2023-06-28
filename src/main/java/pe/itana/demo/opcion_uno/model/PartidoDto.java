package pe.itana.demo.opcion_uno.model;

import java.util.List;

public interface PartidoDto {

  Integer getId();

  String getTipo();

  String getEstado();

  UsuarioDto getRetadorUno();

  UsuarioDto getRetadoUno();

  UsuarioDto getRetadorDos();

  UsuarioDto getRetadoDos();

  List<JuegoDto> getJuegos();
}
