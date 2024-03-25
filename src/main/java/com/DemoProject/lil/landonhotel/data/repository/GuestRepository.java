package com.DemoProject.lil.landonhotel.data.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DemoProject.lil.landonhotel.data.entity.Guest;

public interface GuestRepository extends JpaRepository<Guest, Long> {

}
