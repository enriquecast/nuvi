package Entidades;

import Entidades.ProyectosUsuarios;
import Entidades.Tipodocumentos;
import Entidades.UsuariosRoles;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-06T01:38:59")
@StaticMetamodel(Usuarios.class)
public class Usuarios_ { 

    public static volatile SingularAttribute<Usuarios, Tipodocumentos> fkTipoDocum;
    public static volatile SingularAttribute<Usuarios, String> telefonoUsuario;
    public static volatile SingularAttribute<Usuarios, String> apellidoUsuario;
    public static volatile SingularAttribute<Usuarios, Integer> idUsuario;
    public static volatile SingularAttribute<Usuarios, String> passwordUsuario;
    public static volatile SingularAttribute<Usuarios, String> nombreUsuario;
    public static volatile SingularAttribute<Usuarios, String> nDocumentoUsuario;
    public static volatile SingularAttribute<Usuarios, String> correoElectronico;
    public static volatile ListAttribute<Usuarios, UsuariosRoles> usuariosRolesList;
    public static volatile ListAttribute<Usuarios, ProyectosUsuarios> proyectosUsuariosList;

}