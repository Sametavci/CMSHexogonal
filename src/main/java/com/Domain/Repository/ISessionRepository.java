package com.Domain.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ISessionRepository extends JpaRepository<Models.Session,Long> {
}
