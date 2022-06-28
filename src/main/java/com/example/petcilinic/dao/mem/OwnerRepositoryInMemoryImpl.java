package com.example.petcilinic.dao.mem;

import com.example.petcilinic.dao.OwnerRepository;
import com.example.petcilinic.model.Owner;
import org.springframework.stereotype.Repository;

import java.util.*;
import java.util.stream.Collectors;

@Repository //çalışma zamanında bean yaratır.
public class OwnerRepositoryInMemoryImpl implements OwnerRepository {

    private Map<Long, Owner> ownersMap = new HashMap<>();

    public OwnerRepositoryInMemoryImpl(){
        Owner owner1 = new Owner();
        owner1.setId(1L);
        owner1.setFirstName("Kenan");
        owner1.setLastName("Sevindik");

        Owner owner2 = new Owner();
        owner2.setId(2L);
        owner2.setFirstName("Muammer");
        owner2.setLastName("Yücel");

        Owner owner3 = new Owner();
        owner3.setId(3L);
        owner3.setFirstName("Hümeyra");
        owner3.setLastName("Sevindik");

        Owner owner4 = new Owner();
        owner4.setId(4L);
        owner4.setFirstName("Salim");
        owner4.setLastName("Sevindik");

        ownersMap.put(owner1.getId(), owner1);
        ownersMap.put(owner2.getId(), owner2);
        ownersMap.put(owner3.getId(), owner3);
        ownersMap.put(owner4.getId(), owner4);
    }

    @Override
    public List<Owner> findAll() {
        return new ArrayList<>(ownersMap.values());
    }

    @Override
    public Owner findById(long id) {
        return ownersMap.get(id);
    }

    @Override
    public List<Owner> findByLastName(String lastName) {
        return ownersMap.values().stream().filter(o -> o.getLastName().equals(lastName)).collect(Collectors.toList());
    }

    @Override
    public void create(Owner owner) {
        owner.setId(new Date().getTime());
        ownersMap.put(owner.getId(), owner);
    }

    @Override
    public Owner update(Owner owner) {
        ownersMap.replace(owner.getId(), owner);
        return owner;
    }

    @Override
    public void delete(Long id) {
        ownersMap.remove(id);
    }
}
