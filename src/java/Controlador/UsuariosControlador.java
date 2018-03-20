/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Entidades.Usuarios;
import Entidades.UsuariosRoles;
import Facade.UsuariosFacade;
import Facade.UsuariosRolesFacade;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author julieth
 */
@Named(value = "usuariosControlador")
@SessionScoped
public class UsuariosControlador implements Serializable {

    /**
     * Creates a new instance of UsuariosControlador
     */
    public UsuariosControlador() {
    }
    @EJB
    UsuariosFacade usuariosFacade;
    Usuarios usuarios = new Usuarios();
    
    @EJB
    UsuariosRolesFacade usuariosRolesFacade;
    UsuariosRoles usuariosRoles = new UsuariosRoles();

    public UsuariosRoles getUsuariosRoles() {
        return usuariosRoles;
    }

    public void setUsuariosRoles(UsuariosRoles usuariosRoles) {
        this.usuariosRoles = usuariosRoles;
    }
    
    

    public Usuarios getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }
    
    public List<Usuarios> listarUsuarios(){
        return usuariosFacade.findAll(); 
    }
    
    public String registrarUsuario(){
        usuariosFacade.create(usuarios);
        usuarios = new Usuarios();
        return "ListaUsuario";
    }
    
    public String actualizarUsuario(Usuarios objUsuarios){
        usuarios = objUsuarios;
        return "ActualizarUsuario";
    }
    
    public String editarUsuario(){
        usuariosFacade.edit(usuarios);
        return "ListaUsuario";
    }
    
    public String eliminarUsuario(Usuarios objUsuarios){
        usuarios = objUsuarios;
        usuariosFacade.remove(usuarios);
        return "ListaUsuario";
    }
    
}
