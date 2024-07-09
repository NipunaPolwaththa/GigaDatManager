package com.zebra.giga_dat_back_end.repositories;

import com.zebra.giga_dat_back_end.models.Demo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemoRepository extends JpaRepository<Demo, Long> {

}
