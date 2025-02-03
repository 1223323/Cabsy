package com.jash.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jash.modal.Notification;

public interface NotificationRepository extends JpaRepository<Notification, Integer>{

}
