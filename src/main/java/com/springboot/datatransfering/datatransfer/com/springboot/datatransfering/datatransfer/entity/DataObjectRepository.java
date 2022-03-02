package com.springboot.datatransfering.datatransfer.com.springboot.datatransfering.datatransfer.entity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataObjectRepository extends JpaRepository<DataObject, Long>{


}
