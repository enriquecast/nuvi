DROP DATABASE NUVI;
CREATE DATABASE NUVI;
USE NUVI;

CREATE TABLE TIPODOCUMENTOS(
pkTipoDocum int auto_increment primary key,
nombreTipoDocum varchar (10),
descripcion varchar (200)
); 

CREATE TABLE USUARIOS(
idUsuario INT PRIMARY KEY AUTO_INCREMENT,
nombreUsuario VARCHAR(45),
apellidoUsuario VARCHAR(45),
fkTipoDocum INT,
foreign key (fkTipoDocum) references TIPODOCUMENTOS (pkTipoDocum),
nDocumentoUsuario VARCHAR(45),
passwordUsuario VARCHAR(45),
telefonoUsuario VARCHAR(45),
correoElectronico varchar(45)
);

CREATE TABLE ROLES (
idRol INT PRIMARY KEY AUTO_INCREMENT,
nombreRol VARCHAR(45),
detalleRol varchar(100)
);

CREATE TABLE PERMISOS(
idPermisos INT PRIMARY KEY AUTO_INCREMENT,
tipoPermiso VARCHAR(45)
);

CREATE TABLE PERMISOS_ROLES(
pkpermisosRoles int PRIMARY KEY AUTO_INCREMENT,
fkRol int not null,
fkPermisos int not null,
foreign key (fkRol) references ROLES (idRol),
foreign key (fkPermisos) references PERMISOS (idPermisos)
);

CREATE TABLE TIPOPROBLEMATICAS(
idTipoProblematica INT PRIMARY KEY AUTO_INCREMENT,
tipoProblematica VARCHAR(45),
detalleProblematica varchar (200)
);

CREATE TABLE FAMILIAS (
idFamilia INT PRIMARY KEY AUTO_INCREMENT,
fechaVisita DATE,
nombreCdeFamilia VARCHAR(45),
apellidoCdeFamilia VARCHAR(45),
fkTipoDocum INT,
foreign key (fkTipoDocum) references TIPODOCUMENTOS (pkTipoDocum),
nDocumentoCdeFamilia varchar(45),
nIntegrantesFamilia INT,
localidadFamilia INT,
barrioFamilia VARCHAR(45),
direccionFamilia VARCHAR (45),
ciudadFamilia varchar(45),
fkTipoProblematica int,
foreign key (fkTipoProblematica) references TipoProblematicas (idTipoProblematica)
);

CREATE TABLE PROYECTOS (
idProyecto INT PRIMARY KEY AUTO_INCREMENT,
nombreProyecto varchar(45),
fechaInicioProyecto DATE,
fechaFinProyecto DATE,
costoMaterial FLOAT,
costoPersonal FLOAT,
costoProyecto FLOAT,
dineroRecaudado FLOAT,
dineroFaltante FLOAT,
solucionProyecto VARCHAR(1000),
fkFamilia int,
foreign key (fkFamilia) references FAMILIAS (idFamilia)
);

CREATE TABLE PERSONAL(
idPersonal INT PRIMARY KEY AUTO_INCREMENT,
nombrePersonal VARCHAR(45),
apellidoPersonal VARCHAR(45),
profesionPersonal VARCHAR(45),
fechaNacimiento DATE,
categoriaPersonal VARCHAR(45),
fkTipoDocum INT,
foreign key (fkTipoDocum) references TIPODOCUMENTOS (pkTipoDocum) ,
nDocumentoPersonal VARCHAR(45),
nContactoPersonal VARCHAR(45),
emailPersonal VARCHAR(45),
sueldo INT,
disponibilidad VARCHAR(20),
fkProyecto INT,
FOREIGN KEY (fkProyecto) REFERENCES PROYECTOS (idProyecto)
);

CREATE TABLE DONACIONES (
idDonacion INT PRIMARY KEY AUTO_INCREMENT,
nombreDonador VARCHAR(45),
apellidoDonador VARCHAR(45),
fkTipoDocum INT,
foreign key (fkTipoDocum) references TIPODOCUMENTOS (pkTipoDocum),
nDocumentoDonador VARCHAR(45),
nContactoDonador VARCHAR(45),
emailDonador VARCHAR(45),
valorDonacion INT,
fechaDonacion DATE,
direccion varchar(30),
ciudad varchar(30),
fkProyecto INT,
FOREIGN KEY (fkProyecto) REFERENCES PROYECTOS (idProyecto),
imgComporbante varchar(45)
);

CREATE TABLE MATERIALES(
idMaterial INT PRIMARY KEY auto_increment,
nombreMaterial VARCHAR(45),
unidadMedida varchar(10),
descripción varchar(45)
);

CREATE TABLE MATERIALES_PROYECTO(
idMaterialCotizacion INT PRIMARY KEY AUTO_INCREMENT,
fkProyecto INT,
fkMaterial INT,
cantidadMaterial float,
valorunitario FLOAT,
importe FLOAT,
FOREIGN KEY (fkMaterial) REFERENCES MATERIALES (idMaterial),
foreign key (fkProyecto) references PROYECTOs (idProyecto)
);

CREATE TABLE USUARIOS_ROLES(
idUsuariosRoles int primary key auto_increment,
fkUsuario INT,
fkRol  INT,
FOREIGN KEY (fkUsuario) REFERENCES USUARIOS (idUsuario),
FOREIGN KEY (fkRol) REFERENCES ROLES (idRol)
);

CREATE TABLE PROYECTOS_USUARIOS(
idProyectoUsuarios int primary key auto_increment,
fkProyecto INT,
fkUsuario INT,
FOREIGN KEY (fkProyecto) REFERENCES PROYECTOS (idProyecto),
FOREIGN KEY (fkUsuario) REFERENCES USUARIOS (idUsuario)
);

SELECT * FROM PROYECTOS;

SELECT  PROYECTOS.nombreProyecto, MATERIALES.nombreMaterial, MATERIALES.unidadMedida, MATERIALES_PROYECTO.cantidadMaterial, MATERIALES_PROYECTO.valorUnitario, MATERIALES_PROYECTO.importe 
FROM PROYECTOS 
JOIN MATERIALES_PROYECTO ON MATERIALES_PROYECTO.fkProyecto= PROYECTOS.idProyecto
JOIN MATERIALES ON MATERIALES.idMaterial = MATERIALES_PROYECTO.fkMaterial
WHERE PROYECTOS.idProyecto = 2;





INSERT INTO personal VALUES (default,'Lorena','Perez', 'Deportista',32,'Voluntario','Cedula de ciudadania',101925,'3104115555','LP@gmail.com',0,0,null),
(default,'Daniel','Lopez', 'Constructor',22,'Empleado','Cedula de ciudadania',101945,'3104555665','DP2@gmail.com',20000,0,null),
(default,'Camila','Torres', 'Ingeniero',28,'Voluntario','Cedula de ciudadania',101923,'3104345555','CT@gmail.com',0,0,null);



DELIMITER $

CREATE PROCEDURE cargarDonacion(Proyecto int,nombreDonador varchar(45),tipoDocumento varchar(45),nDocu varchar(45),tel varchar(45),email varchar(45),valor float,fecha date, direccion varchar(45),ciudad varchar(45))
BEGIN
	INSERT INTO donaciones VALUES (default,nombreDonador,tipoDocumento ,nDocu ,tel ,email ,valor,fecha,direccion,ciudad,pais,Proyecto);
    UPDATE proyectos AS p
    INNER JOIN donaciones AS d
    ON d.idDonaciones=p.idProyectos
    SET p.dineroRecaudado=(d.valorDonacion+p.dineroRecaudado), p.dineroFaltante=(p.costoProyecto-p.dineroRecaudado)
    WHERE Proyectos=p.idProyectos;
END$

DELIMITER ;
CALL cargarDonacion(1,'MariaJose Leon','CC','1019','536','gr@gmail.co',8000,'2017/12/12', 'Cl 3','Bogota','Colombia');
select * From proyectos;
select * From donaciones;


DELIMITER $
CREATE PROCEDURE listaDonadoresProyecto (Proyecto int)
BEGIN
	SELECT nombreDonador, tipoDocumentoDonador, nDocumentoDonador, ValorDonacion FROM donacion
    WHERE proyecto = donacion.fkProyecto;
END$
DELIMITER ;

CALL listaDonadoresProyecto (1);


DELIMITER $
CREATE PROCEDURE asignarProyecto(proyecto int, codPersonal int)
BEGIN
	UPDATE PERSONAL
    SET fkProyecto = proyecto
    where idPersonal = codPersonal; 
    UPDATE personal SET
    disponibilidad = if(disponibilidad = 0, 1, if(disponibilidad=1,0,0))
    WHERE codPersonal=idPersonal;
END$
DELIMITER ;

CALL asignarProyecto (1,2);
SELECT * FROM PERSONAL;


DELIMITER $

CREATE TRIGGER ingresarFamilia BEFORE UPDATE ON Familia
FOR EACH ROW 
BEGIN
INSERT INTO Familia(fechaFamilia,nIntegrantesFamilia,localidadFamilia,barrioFamilia,cuidadFamilia,paisFamilia)
VALUES (now(),OLD.nIntegrantesFamilia,NEW.localidadFamilia,NEW.barrioFamilia,OLD.ciudadFamilia,OLDpaisFamilia);
END$
DELIMITER ;

INSERT INTO Familia(fechaFamilia,nIntegrantesFamilia,localidadFamilia,barrioFamilia,ciudadFamilia,paisFamilia)
VALUES ('2017/12/27',2,10,'La Fontana','Medellin','Colombia');

