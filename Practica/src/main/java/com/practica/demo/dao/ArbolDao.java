/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.practica.demo.dao;

import com.practica.demo.domain.Arbol;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author franv
 */
public interface ArbolDao extends JpaRepository <Arbol,Long>{
    
}
