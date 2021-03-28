package com.candidates.registration.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.candidates.registration.Dao.CandidatesDaoInterf;
import com.candidates.registration.domain.Candidates;

@Service
@Transactional
public class CandidatesService implements CandidatesServiceInterf{

	CandidatesDaoInterf dao;
	
	@Autowired
	public void setDao(CandidatesDaoInterf dao)
	{
		this.dao = dao;
	}
	
	@Override
	@Transactional
	public Candidates save(Candidates candidates) {
		return dao.save(candidates);
	}

	@Override
	@Transactional
	public Candidates findByUniqueId(long uniqueId) {
		Candidates can = dao.findByUniqueId(uniqueId);
		return can;
	}

	@Override
	@Transactional
	public Long createNewCandidates(Candidates cand) {
		Candidates candy = dao.save(cand);
		return candy.getUniqueId();
	}

	@Override
	@Transactional
	public List<Candidates> findAll() {
		List<Candidates> list = dao.findAll();
		return list;
	}

	@Override
	public List<Long> getFilteredIds(long id1, long id2) {
		return dao.getFilteredIds(id1, id2);
	}

	@Override
	public Page<Candidates> getPagination(Pageable pageable) {
		return dao.getPagination(pageable);
	}

	
	
}
