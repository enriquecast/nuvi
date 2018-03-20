package Entidades;

import Entidades.Proyectos;
import Entidades.Usuarios;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-06T01:38:59")
@StaticMetamodel(ProyectosUsuarios.class)
public class ProyectosUsuarios_ { 

    public static volatile SingularAttribute<ProyectosUsuarios, Usuarios> fkUsuario;
    public static volatile SingularAttribute<ProyectosUsuarios, Integer> idProyectoUsuarios;
    public static volatile SingularAttribute<ProyectosUsuarios, Proyectos> fkProyecto;

}