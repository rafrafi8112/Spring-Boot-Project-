package com.example.mobilite_internationale.repositories;

import com.example.mobilite_internationale.entities.Reponse;
import com.example.mobilite_internationale.entities.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReponseRepository extends JpaRepository<Reponse,Integer> {
}