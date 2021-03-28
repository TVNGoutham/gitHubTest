package com.candidates.registration.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.candidates.registration.domain.Candidates;

public interface CandidatesServiceInterf {

	Candidates save(Candidates candidates);

	Candidates findByUniqueId(long uniqueId);

	Long createNewCandidates(Candidates candidates);

	List<Candidates> findAll();

	List<Long> getFilteredIds(long id1, long id2);

	Page<Candidates> getPagination(Pageable pageable);

}
