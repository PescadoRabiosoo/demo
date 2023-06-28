CREATE TABLE IF NOT EXISTS `usuario` (
  `id` INT NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `nombres` VARCHAR(45) NULL,
  `apellidos` VARCHAR(45) NULL,
  `alias` VARCHAR(45) NULL,
  `url_avatar` VARCHAR(200) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


CREATE TABLE IF NOT EXISTS `partido` (
  `id` INT NOT NULL,
  `tipo` VARCHAR(45) NOT NULL,
  `estado` VARCHAR(45) NOT NULL,
  `id_retador_uno` INT NOT NULL,
  `id_retado_uno` INT NOT NULL,
  `id_retador_dos` INT NULL,
  `id_retado_dos` INT NULL,
  PRIMARY KEY (`id`),
    INDEX `fk-id_retador_uno-partido-usuario_idx` (`id_retador_uno` ASC) VISIBLE,
    INDEX `fk-id_retado_uno-partido-usuario_idx` (`id_retado_uno` ASC) VISIBLE,
    INDEX `fk-id_retador_dos-partido-usuario_idx` (`id_retador_dos` ASC) VISIBLE,
    INDEX `fk-id_retado_dos-partido-usuario_idx` (`id_retado_dos` ASC) VISIBLE,
      CONSTRAINT `fk-id_retador_uno-partido-usuario`
        FOREIGN KEY (`id_retador_uno`)
        REFERENCES `usuario` (`id`)
        ON DELETE NO ACTION
        ON UPDATE NO ACTION,
      CONSTRAINT `fk-id_retado_uno-partido-usuario`
        FOREIGN KEY (`id_retado_uno`)
        REFERENCES `usuario` (`id`)
        ON DELETE NO ACTION
        ON UPDATE NO ACTION,
      CONSTRAINT `fk-id_retador_dos-partido-usuario`
        FOREIGN KEY (`id_retador_dos`)
        REFERENCES `usuario` (`id`)
        ON DELETE NO ACTION
        ON UPDATE NO ACTION,
      CONSTRAINT `fk-id_retado_dos-partido-usuario`
        FOREIGN KEY (`id_retado_dos`)
        REFERENCES `usuario` (`id`)
        ON DELETE NO ACTION
        ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE TABLE IF NOT EXISTS `juego` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `id_partido` INT NOT NULL,
  `nro_sets` INT NOT NULL,
  PRIMARY KEY (`id`),
  INDEX `fk-id_partido-juego-partido_idx` (`id_partido` ASC) VISIBLE,
  CONSTRAINT `fk-id_partido-juego-partido`
    FOREIGN KEY (`id_partido`)
    REFERENCES `partido` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

-- -----------------------------------------------------
-- Table `usuario_dos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `usuario_dos` (
  `id` INT NOT NULL,
  `email` VARCHAR(45) NOT NULL,
  `nombres` VARCHAR(45) NULL,
  `apellidos` VARCHAR(45) NULL,
  `alias` VARCHAR(45) NULL,
  `url` VARCHAR(200) NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `partido_dos`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `partido_dos` (
  `id` INT NOT NULL,
  `tipo` VARCHAR(45) NOT NULL,
  `estado` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`id`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `participante`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `participante` (
  `id_partido` INT NOT NULL,
  `id_usuario` INT NOT NULL,
  `equipo` INT NOT NULL,
  PRIMARY KEY (`id_usuario`, `id_partido`),
  INDEX `fk_participante_partido_dos1_idx` (`id_partido` ASC) VISIBLE,
  CONSTRAINT `fk_participante_usuario_dos`
    FOREIGN KEY (`id_usuario`)
    REFERENCES `usuario_dos` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_participante_partido_dos1`
    FOREIGN KEY (`id_partido`)
    REFERENCES `partido_dos` (`id`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

