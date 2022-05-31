/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import Model.Usuario;
import view.Login;
import view.MenuPrincipal;

/**
 *
 * @author Administrator
 */
public class LoginController {

    private final Login view;
    private LoginHelper helper;

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    
    
    
    
    public void entrarNoSistema(){
       //Pegar Usuario da view
       Usuario usuario = helper.obterModelo();
        
       
        
        //Pesquisar Usuario no BD
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
        
        if (usuarioAutenticado != null){
                MenuPrincipal menu = new MenuPrincipal();
                menu.setVisible(true);
                this.view.dispose();
        }else{
            view.exibeMensagem("Usuario ou senha invalidos");
        }
        ////Se o usuario da view tiver mesmo usuario e senha do DB, direcionar para menu principal
        //Senao mostrar uma mensagem ao usuário "Usuario ou senha invalidos"
    
    }
    
    public void fizTarefa(){
        System.out.println("Busquei algo do banco de dados");
        
        this.view.exibeMensagem("Executei ouf fiz tarefa");
    }
       
}
