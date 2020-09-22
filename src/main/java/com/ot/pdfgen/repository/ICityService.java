package com.ot.pdfgen.repository;

import com.ot.pdfgen.model.City;

import java.util.List;

public interface ICityService {
    List<City> findAll();
}
