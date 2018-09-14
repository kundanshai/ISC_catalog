package com.equant.flip.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.equant.flip.entity.PartNum;

@Repository
public interface PartNumRepository extends JpaRepository<PartNum, Long> {

	 @Query(value="select  std_warranty, repair_type,SN_TRACK,notes,X_GSA_AVAILABLE_WA_ORDER,X_GSA_SPT_PGM_UPDATE,UNIT_MEASURE,WARR_START_KEY,WEIGHT,DIMENSION,X_GSA_FLEX_2,DOMAIN, PART_TYPE ,DESCRIPTION,FAMILY,LINE,"
		 		+ "ACTIVE,MODEL_NUM,PART_NUMBER from table_part_num where objid = ?1",nativeQuery=true)
		 PartNum getPartDetails(String objId);
}
