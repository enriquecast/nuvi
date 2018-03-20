package Entidades;

import Entidades.Materiales;
import Entidades.Proyectos;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-03-06T01:38:59")
@StaticMetamodel(MaterialesProyecto.class)
public class MaterialesProyecto_ { 

    public static volatile SingularAttribute<MaterialesProyecto, Materiales> fkMaterial;
    public static volatile SingularAttribute<MaterialesProyecto, Float> valorunitario;
    public static volatile SingularAttribute<MaterialesProyecto, Integer> idMaterialCotizacion;
    public static volatile SingularAttribute<MaterialesProyecto, Float> importe;
    public static volatile SingularAttribute<MaterialesProyecto, Float> cantidadMaterial;
    public static volatile SingularAttribute<MaterialesProyecto, Proyectos> fkProyecto;

}