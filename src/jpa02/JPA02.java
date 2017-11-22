/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa02;

import dao.ClienteDao;
import model.Cliente;

/**
 *
 * @author cristhian_anacleto
 */
public class JPA02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cliente cliente = new Cliente(1L, "nome");
        ClienteDao.save(cliente);
        
        System.exit(0);
    }
    
}
