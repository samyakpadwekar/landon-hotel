package com.DemoProject.lil.landonhotel.data.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.DemoProject.lil.landonhotel.data.entity.Room;

public interface RoomRepository extends JpaRepository<Room, Long> {
	Optional<Room> findByRoomNumberIgnoreCase(String roomNumber);
	// all rooms with two queen beds

	// all room with certain names
}
