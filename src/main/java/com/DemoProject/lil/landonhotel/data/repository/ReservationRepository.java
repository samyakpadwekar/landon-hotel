package com.DemoProject.lil.landonhotel.data.repository;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DemoProject.lil.landonhotel.data.entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {
	List<Reservation> findAllByReservationDate(Date date);
}
