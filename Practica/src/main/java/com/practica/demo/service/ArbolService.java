package com.practica.demo.service;

import com.practica.demo.domain.Arbol;
import java.util.List;

public interface ArbolService {
    List<Arbol> getArboles(boolean activos);
}