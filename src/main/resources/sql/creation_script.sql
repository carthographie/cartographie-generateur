DROP TABLE  IF EXISTS tac;
CREATE TABLE tac (
numart               SERIAL  PRIMARY KEY,                                 
codart               char(3)   ,                              
libcou               char(10)  ,                              
liblon               char(40)  
);
DROP TABLE IF EXISTS tdp;
CREATE TABLE tdp (
  id              SERIAL PRIMARY KEY,
  acacode      VARCHAR(3) ,
  deptcode        VARCHAR(3) UNIQUE NOT NULL,
  libelle_court   VARCHAR(30) NOT NULL,
  libelle_long    VARCHAR(30) NOT NULL
);

DROP TABLE IF EXISTS tdi;
CREATE TABLE tdi (
discco               char(5)  ,                               
disclc               char(10)  ,                              
discli               char(40) ,                               
dsspec               char(2) ,                                
discdd               date ,                                   
discdf               date ,                                   
foncco               char(3) 
);

DROP TABLE IF EXISTS carto;
create table carto
(
    cartonum    serial,
    phase       char(5),
    degre       char(2),
    annee       smallint,
    acadco      char(2),
    depaco      char(3),
    uaarne      char(8),
    discco      char(5),
    barrent     integer,
    barrsor     integer,
    entrants    integer,
    sortants    integer,
    nbcdt       integer,
    nbsaf       integer
);

