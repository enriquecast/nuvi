package Entidades;

import Entidades.Donaciones;
import Entidades.Familias;
import Entidades.Personal;
import Entidades.Usuarios;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-06T01:38:59")
@StaticMetamodel(Tipodocumentos.class)
public class Tipodocumentos_ { 

    public static volatile SingularAttribute<Tipodocumentos, String> descripcion;
    public static volatile ListAttribute<Tipodocumentos, Usuarios> usuariosList;
    public static volatile ListAttribute<Tipodocumentos, Familias> familiasList;
    public static volatile ListAttribute<Tipodocumentos, Donaciones> donacionesList;
    public static volatile SingularAttribute<Tipodocumentos, Integer> pkTipoDocum;
    public static volatile SingularAttribute<Tipodocumentos, String> nombreTipoDocum;
    public static volatile ListAttribute<Tipodocumentos, Personal> personalList;

}