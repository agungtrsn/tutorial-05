package com.apap.tu05.repository;

import com.apap.tu05.model.PilotModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * PilotDb
 * @author agungtresna
 * 
 */

@Repository
public interface PilotDb extends JpaRepository<PilotModel, Long> {

    PilotModel findByLicenseNumber(String licenseNumber);
}
