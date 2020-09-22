package com.ot.pdfgen.service;

import com.ot.pdfgen.model.City;
import com.ot.pdfgen.repository.CityRepository;
import com.ot.pdfgen.repository.ICityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService implements ICityService {

    @Autowired
    private CityRepository repository;

    @Override
    public List<City> findAll() {

        return (List<City>) repository.findAll();
    }
}
