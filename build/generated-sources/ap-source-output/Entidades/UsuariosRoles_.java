package Entidades;

import Entidades.Roles;
import Entidades.Usuarios;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-06T01:38:59")
@StaticMetamodel(UsuariosRoles.class)
public class UsuariosRoles_ { 

    public static volatile SingularAttribute<UsuariosRoles, Roles> fkRol;
    public static volatile SingularAttribute<UsuariosRoles, Usuarios> fkUsuario;
    public static volatile SingularAttribute<UsuariosRoles, Integer> idUsuariosRoles;

}