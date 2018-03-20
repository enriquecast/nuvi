package Entidades;

import Entidades.Permisos;
import Entidades.Roles;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-06T01:38:59")
@StaticMetamodel(PermisosRoles.class)
public class PermisosRoles_ { 

    public static volatile SingularAttribute<PermisosRoles, Roles> fkRol;
    public static volatile SingularAttribute<PermisosRoles, Permisos> fkPermisos;
    public static volatile SingularAttribute<PermisosRoles, Integer> pkpermisosRoles;

}