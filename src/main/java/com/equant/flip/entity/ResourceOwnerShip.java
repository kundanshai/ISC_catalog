package com.equant.flip.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.Table;

@Entity
@Table(name="table_x_gsa_prodrev_view")
@NamedNativeQuery(name="tablexgsaprodrevview",query="select X_GSA_MOD_LEVEL,X_GSA_REVISION from table_x_gsa_prodrev_view where x_gsa_part_no =:part_num ",resultClass=ResourceOwnerShip.class)
public class ResourceOwnerShip {
@Id
@Column(name="X_GSA_MOD_LEVEL")
private String xGsaModLevel;
@Column(name="X_GSA_REVISION")
private String xGsaRevision;

public String getxGsaModLevel() {
	return xGsaModLevel;
}
public void setxGsaModLevel(String xGsaModLevel) {
	this.xGsaModLevel = xGsaModLevel;
}
public String getxGsaRevision() {
	return xGsaRevision;
}
public void setxGsaRevision(String xGsaRevision) {
	this.xGsaRevision = xGsaRevision;
}

}
