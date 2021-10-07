/**
 * 
 */
package com.moprofile.moprofilev1.service;

import org.springframework.data.jpa.repository.JpaRepository;

import com.moprofile.moprofilev1.model.FileDB;

/**
 * @author sacharya
 *
 */
public interface FileDBRepository extends JpaRepository<FileDB, String> {

}
