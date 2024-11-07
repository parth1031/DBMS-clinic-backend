package com.example.demo1.service;

import com.example.demo1.model.MedicationDetail;

import java.sql.SQLException;
import java.util.List;

public interface MedicationDetailService {
    void save(MedicationDetail medicationDetail) throws SQLException;
    List<MedicationDetail> findByPrescriptionId(int prescriptionID) throws SQLException;
    List<MedicationDetail> findAll() throws SQLException;

    void update(MedicationDetail medicationDetail) throws SQLException;

    void delete(int prescriptionID);
}
