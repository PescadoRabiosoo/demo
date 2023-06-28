INSERT IGNORE INTO `usuario` (`id`, `email`, `nombres`, `apellidos`, `alias`, `url_avatar`) VALUES
('1', 'jcabelloc@itana.pe', 'Juan', 'Cabello', 'JCABELLOC', 'imagen desde url'),
('2', 'arvin@gmail.com', 'Arvin', 'Kael', 'ARVINK', 'imagen desde url'),
('3', 'axel@gmail.com', 'Axel', 'Choquehuanca', 'AXELCH', 'imagen desde url'),
('4', 'hugo@gmail.com', 'Hugo', 'Rodriguez', 'HugoRo', 'imagen desde url');

INSERT IGNORE INTO `partido` (`id`, `tipo`, `estado`, `id_retador_uno`, `id_retado_uno`, `id_retador_dos`, `id_retado_dos`) VALUES
('1', 'SINGLES', 'TERMINADO', '1', '2', null, null),
('2', 'DOBLES', 'TERMINADO', '1', '3', '2', '4'),
('3', 'SINGLES', 'TERMINADO', '3', '4', null, null),
('4', 'DOBLES', 'EN_PROGRESO', '2', '3', '1', '4');

INSERT IGNORE INTO `juego` (`id`,`id_partido`,`nro_sets`) VALUES
('1','1','3'),
('2','1','3'),
('3','1','3'),
('4','2','3'),
('5','2','3'),
('6','2','3'),
('7','3','5'),
('8','3','5'),
('9','3','5'),
('10','3','5'),
('11','3','5'),
('12','4','3'),
('13','4','3'),
('14','4','3');

INSERT IGNORE INTO `usuario_dos` (`id`, `email`, `nombres`, `apellidos`, `alias`, `url`) VALUES
('1', 'jcabelloc@itana.pe', 'Juan', 'Cabello', 'JCABELLOC', 'imagen desde url'),
('2', 'arvin@gmail.com', 'Arvin', 'Kael', 'ARVINK', 'imagen desde url'),
('3', 'axel@gmail.com', 'Axel', 'Choquehuanca', 'AXELCH', 'imagen desde url'),
('4', 'hugo@gmail.com', 'Hugo', 'Rodriguez', 'HugoRo', 'imagen desde url');

INSERT IGNORE INTO `partido_dos` (`id`, `tipo`, `estado`) VALUES
('1', 'SINGLES', 'TERMINADO'),
('2', 'DOBLES', 'TERMINADO'),
('3', 'SINGLES', 'TERMINADO'),
('4', 'DOBLES', 'EN_PROGRESO');

INSERT IGNORE INTO `participante` (`id_usuario`, `id_partido`,`equipo`) VALUES
('1','1','1'),
('2','1','2'),
('1','2','1'),
('2','2','1'),
('3','2','2'),
('4','2','2'),
('3','3','2'),
('1','3','1'),
('1','4','1'),
('2','4','2'),
('3','4','2'),
('4','4','1');
