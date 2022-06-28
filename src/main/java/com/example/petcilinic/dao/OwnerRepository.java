package com.example.petcilinic.dao;

import com.example.petcilinic.model.Owner;

import java.util.List;

public interface OwnerRepository {
    List<Owner> findAll();
    Owner findById(long id);
    List<Owner> findByLastName(String lastName);
    void create(Owner owner);
    Owner update(Owner owner);
    void delete(Long id);
}
