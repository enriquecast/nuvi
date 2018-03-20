package Entidades;

import Entidades.Proyectos;
import Entidades.Tipodocumentos;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-06T01:38:59")
@StaticMetamodel(Personal.class)
public class Personal_ { 

    public static volatile SingularAttribute<Personal, Tipodocumentos> fkTipoDocum;
    public static volatile SingularAttribute<Personal, String> emailPersonal;
    public static volatile SingularAttribute<Personal, Integer> idPersonal;
    public static volatile SingularAttribute<Personal, Date> fechaNacimiento;
    public static volatile SingularAttribute<Personal, String> nDocumentoPersonal;
    public static volatile SingularAttribute<Personal, Integer> sueldo;
    public static volatile SingularAttribute<Personal, String> nombrePersonal;
    public static volatile SingularAttribute<Personal, String> nContactoPersonal;
    public static volatile SingularAttribute<Personal, Proyectos> fkProyecto;
    public static volatile SingularAttribute<Personal, String> disponibilidad;
    public static volatile SingularAttribute<Personal, String> apellidoPersonal;
    public static volatile SingularAttribute<Personal, String> profesionPersonal;
    public static volatile SingularAttribute<Personal, String> categoriaPersonal;

}