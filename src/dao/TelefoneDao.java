/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import model.Telefone;

/**
 *
 * @author cristhian_anacleto
 */
public class TelefoneDao {
    
    public static void save (Telefone telefone) {
        JpaUtil.getEntityManager().getTransaction().begin();
        if (telefone.getId() == 0) {
            JpaUtil.getEntityManager().persist(telefone);
        } else {
            JpaUtil.getEntityManager().merge(telefone);
        }
        JpaUtil.getEntityManager().getTransaction().commit();
    }
    
    public static Telefone findById(int id) {
        return JpaUtil.getEntityManager().find(Telefone.class, id);
    }
    
    public static List<Telefone> findAll() {
        return JpaUtil.getEntityManager().createQuery("select c from Telefone c").getResultList();
    }
    
    public static void delete(int id) {
        JpaUtil.getEntityManager().remove(JpaUtil.getEntityManager().getReference(Telefone.class, id));
    }
    
    public static void delete(Telefone telefone) {
        delete(telefone.getId());
    } 
   
}
