package Entidades;

import Entidades.Proyectos;
import Entidades.Tipodocumentos;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-06T01:38:59")
@StaticMetamodel(Donaciones.class)
public class Donaciones_ { 

    public static volatile SingularAttribute<Donaciones, Tipodocumentos> fkTipoDocum;
    public static volatile SingularAttribute<Donaciones, String> emailDonador;
    public static volatile SingularAttribute<Donaciones, Integer> idDonacion;
    public static volatile SingularAttribute<Donaciones, String> nDocumentoDonador;
    public static volatile SingularAttribute<Donaciones, String> direccion;
    public static volatile SingularAttribute<Donaciones, String> imgComporbante;
    public static volatile SingularAttribute<Donaciones, String> nombreDonador;
    public static volatile SingularAttribute<Donaciones, Proyectos> fkProyecto;
    public static volatile SingularAttribute<Donaciones, String> ciudad;
    public static volatile SingularAttribute<Donaciones, Integer> valorDonacion;
    public static volatile SingularAttribute<Donaciones, String> nContactoDonador;
    public static volatile SingularAttribute<Donaciones, Date> fechaDonacion;
    public static volatile SingularAttribute<Donaciones, String> apellidoDonador;

}