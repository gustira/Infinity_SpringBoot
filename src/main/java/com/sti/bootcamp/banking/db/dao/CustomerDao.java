package com.sti.bootcamp.banking.db.dao;

import com.sti.bootcamp.banking.db.model.CustomerEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.List;

public interface CustomerDao {
    CustomerEntity getById(int id);
    CustomerEntity getByUsername(String username) throws UsernameNotFoundException;
}
