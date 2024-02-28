/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.practica.demo.service.impl;

import com.practica.demo.dao.ArbolDao;
import com.practica.demo.domain.Arbol;
import com.practica.demo.service.ArbolService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class ArbolServiceImpl implements ArbolService{
    
    
    @Autowired
    private ArbolDao arbolDao;

    @Override
    @Transactional(readOnly=true)
    public List<Arbol> getArboles(boolean activos) {
        var lista=arbolDao.findAll();
        if(activos){
             lista.removeIf(e -> !e.isActivo());
        }
        return lista;
        
       
    }
    
}
