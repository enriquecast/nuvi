package Entidades;

import Entidades.PermisosRoles;
import Entidades.UsuariosRoles;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-06T01:38:59")
@StaticMetamodel(Roles.class)
public class Roles_ { 

    public static volatile SingularAttribute<Roles, Integer> idRol;
    public static volatile SingularAttribute<Roles, String> nombreRol;
    public static volatile ListAttribute<Roles, PermisosRoles> permisosRolesList;
    public static volatile SingularAttribute<Roles, String> detalleRol;
    public static volatile ListAttribute<Roles, UsuariosRoles> usuariosRolesList;

}