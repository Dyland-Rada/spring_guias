/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.demo.servicio;
import com.example.demo.dao.IUsuarioCrud;
import com.example.demo.modelo.Usuario;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.stereotype.Service;
/**
 *
 * @author Sylandklk
 */
@Service
public class UsuarioServicioImp implements IUsuarioServicio{
    @Autowired
    IUsuarioCrud crudUser;

    @Transactional(readOnly = true)
    @Override
    public List<Usuario> listarUsuarios() {
        return (List<Usuario>) crudUser.findAll();
    }
    @Transactional
    @Override
    public void guardar(Usuario user) {
        crudUser.save(user);
    }
    @Transactional
    @Override
    public void eliminar(Usuario user) {
        crudUser.delete(user);
    }
   @Transactional(readOnly = true)
    @Override
    public Usuario buscar(Usuario user) {
        return crudUser.findById(user.getCedula()).orElse(null);
    }
    
  
}
