package com.newgen.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.newgen.main.model.UANDETAILS;



@RepositoryRestResource(path = "uannumber", collectionResourceRel = "uandetails")
public interface UANDataRestRepository extends PagingAndSortingRepository<UANDETAILS, Long> {
	
	public UANDETAILS findByPanNumber(String panNumber);
	
	@RestResource(path = "byFirm", rel = "customFindMethod")
	@Query(value = "SELECT * FROM general_uan_details a WHERE a.name_of_firm = ?1 ", nativeQuery = true)
	public List<UANDETAILS> byNameOfFirm(String firmName);
	
}