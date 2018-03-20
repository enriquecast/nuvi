package Entidades;

import Entidades.PermisosRoles;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-06T01:38:59")
@StaticMetamodel(Permisos.class)
public class Permisos_ { 

    public static volatile SingularAttribute<Permisos, Integer> idPermisos;
    public static volatile SingularAttribute<Permisos, String> tipoPermiso;
    public static volatile ListAttribute<Permisos, PermisosRoles> permisosRolesList;

}