package com.app_server.application.services;

import com.app_server.application.repositories.CategorieRepository;
import com.app_server.application.repositories.RecetteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RecetteServiceImpl implements RecetteService{

    @Autowired
    private RecetteRepository recetteRepository;
}
