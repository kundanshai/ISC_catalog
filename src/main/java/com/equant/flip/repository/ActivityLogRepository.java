package com.equant.flip.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.equant.flip.entity.ResourceActivityLog;

@Repository
public interface ActivityLogRepository extends JpaRepository<ResourceActivityLog, Long> {
	
	 @Query(value="select entry_time, add_info, login_name, act_name,x_work_group" 
	 +" from table_x_partnum_alst  WHERE   (  parent_objid = ?1 ) order by entry_time desc",nativeQuery=true)
	 List<ResourceActivityLog> getResourceCatelogActivityLogDetails(String objId);

}
