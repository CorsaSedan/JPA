/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa02;

import dao.ClienteDao;
import model.Cliente;
import model.Telefone;

/**
 *
 * @author cristhian_anacleto
 */
public class JPA02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setNome("Astolfo");
        ClienteDao.save(cliente);
        
        Cliente clienteTelefone = ClienteDao.findById(1);
        clienteTelefone.getListaTelefone().add(new Telefone("4002-8922", clienteTelefone));
        ClienteDao.save(clienteTelefone);
        
        System.exit(0);
    }
    
}
