package com.equant.flip.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.equant.flip.entity.ResourceCatalogDetails;


@Repository
public interface ResourceCatalogRepository extends CrudRepository<ResourceCatalogDetails,Integer>{
	
	@Query(value = "select a.objid from table_part_num a,table_mod_level b where a.objid= b.PART_INFO2PART_NUM and b.objid=?1",nativeQuery = true)
	String  getPartObjId(String modObjId);
	
	@Query(value = "select b.PART_INFO2PART_STATS from table_part_num a,table_mod_level b where a.objid= b.PART_INFO2PART_NUM and b.objid=?1",nativeQuery = true)
	String  getPartStatesObjId(String modObjId);
	
	@Query(value = "select  ABC_CODE from table_part_stats where objid = ?1",nativeQuery =true)
	String getAbcCode(String partStatesObjId);
	
	 @Query(value = "select c.name from table_part_num ca,table_part_class c where c.objid= ca.PART_NUM2PART_CLASS and ca.objid = ?1",nativeQuery =true)
	 String getClassName(String partObjId);
}
