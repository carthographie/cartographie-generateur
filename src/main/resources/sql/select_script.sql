DROP TABLE  IF EXISTS academie;
CREATE TABLE academie (
  id              SERIAL PRIMARY KEY,
  acacode           VARCHAR(3) UNIQUE  NOT NULL,
  libelle_court  VARCHAR(30) NOT NULL,
  libelle_long    VARCHAR(30) NOT NULL
);
DROP TABLE IF EXISTS department;
CREATE TABLE department (
  id              SERIAL PRIMARY KEY,
  acacode      VARCHAR(3) ,
  deptcode        VARCHAR(3) UNIQUE NOT NULL,
  libelle_court   VARCHAR(30) NOT NULL,
  libelle_long    VARCHAR(30) NOT NULL
);

DROP TABLE IF EXISTS discipline;
CREATE TABLE discipline (
  id             SERIAL PRIMARY KEY,
  disccode       VARCHAR(5) UNIQUE  NOT NULL,
  libelle_court  VARCHAR(30) NOT NULL,
  libelle_long   VARCHAR(30)NOT NULL
);

DROP TABLE IF EXISTS info_mouvement;
CREATE TABLE info_mouvement (
  id                    SERIAL PRIMARY KEY,
  disccode           VARCHAR(5),
  acacode            VARCHAR(3),
  deptcode           VARCHAR(3),
  bar_entree            integer,
  bar_sortis            integer ,
  nbr_entrant           integer ,
  nbr_sortant           integer,
  annee           integer,
  );
