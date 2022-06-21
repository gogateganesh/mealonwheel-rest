package com.example.demo.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entities.Ordertable1;


@Repository
public interface OrdertableRepo extends JpaRepository<Ordertable1, Integer> 
{


}
