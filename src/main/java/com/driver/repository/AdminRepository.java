package com.driver.repository;

import com.driver.model.Driver;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.driver.model.Admin;

import java.util.List;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer>{

}
