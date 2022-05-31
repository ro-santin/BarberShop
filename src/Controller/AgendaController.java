/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Controller.Helper.AgendaHelper;
import Model.Agendamento;
import Model.Cliente;
import Model.DAO.AgendamentoDAO;
import Model.DAO.ClienteDAO;
import Model.DAO.ServicoDAO;
import Model.Servico;
import java.util.ArrayList;
import view.Agenda;

/**
 *
 * @author Administrator
 */
public class AgendaController {
    
    
    private final Agenda view;
    private final AgendaHelper helper;

    public AgendaController(Agenda view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
    }
    
    
    
    public void atualizaTabela(){
        
        //Buscar Lista com agendamentos do banco de dados
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll();
       
        //Exibir essa lista na view
        helper.preencherTabela(agendamentos);
        
    }
    
    public void atualizaCliente(){
        
        //Buscar Clientes do BD
        ClienteDAO clienteDAO = new ClienteDAO();
        ArrayList<Cliente> clientes = clienteDAO.selectAll();
        
        //Exibir Clientes no Combobox Cliente
        helper.preencherClientes(clientes);
    }
    
    public void atualizaServico(){
        
       ServicoDAO servicoDAO = new ServicoDAO();
       ArrayList<Servico> servicos = servicoDAO.selectAll();
       
       helper.preencherServicos(servicos);
       
}
    public void atualizaValor (){
       Servico servico =  helper.obterServico();
       helper.setarValor(servico.getValor());
    }
    
    public void agendar(){
        
        //Buscar Objeto Agendamento da Tela
        Agendamento agendameto = helper.obterModelo();
        //Salvar Objeto no BD
        new AgendamentoDAO().insert(agendameto);
        //Inserir elemento na tabela --> Ja foi feito
        atualizaTabela();
        helper.limparTela();
    }
}
