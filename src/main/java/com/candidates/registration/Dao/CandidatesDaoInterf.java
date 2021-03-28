package com.candidates.registration.Dao;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.candidates.registration.domain.Candidates;

public interface CandidatesDaoInterf {

	public Candidates save(Candidates candidates);
	
	public Candidates findByUniqueId(long uniqueId);
	
//	public String createNewCandidates(Candidates candidates);
	
	public List<Candidates> findAll();

	public List<Long> getFilteredIds(long id1, long id2);

	public Page<Candidates> getPagination(Pageable pageable);
	
}
