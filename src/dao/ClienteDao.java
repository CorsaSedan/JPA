/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Cliente;

/**
 *
 * @author cristhian_anacleto
 */
public class ClienteDao {

    public static void save(Cliente cliente) {
        JpaUtil.getEntityManager().getTransaction().begin();
        if (cliente.getId() == 0) {
            JpaUtil.getEntityManager().persist(cliente);
        } else {
            JpaUtil.getEntityManager().merge(cliente);
        }
        JpaUtil.getEntityManager().getTransaction().commit();
    }
    
    public static Cliente findById(int id) {
        return JpaUtil.getEntityManager().find(Cliente.class, id);
    }
    
    public static List<Cliente> findAll() {
        return JpaUtil.getEntityManager().createQuery("select c from Cliente c").getResultList();
    }
    
    public static void delete(int id) {
        JpaUtil.getEntityManager().remove(JpaUtil.getEntityManager().getReference(Cliente.class, id));
    }
    
    public static void delete(Cliente cliente) {
        delete(cliente.getId());
    }
}
