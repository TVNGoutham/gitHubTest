package com.candidates.registration.Dao;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;

import com.candidates.registration.domain.Candidates;

@Repository
@Transactional
public class CandidatesDao implements CandidatesDaoInterf{

	@Autowired
	EntityManager em;

	@Override
	@Transactional
	public Candidates save(Candidates toSave) {
		em.persist(toSave);
		return toSave;
	}

	@Override
	@Transactional
	public Candidates findByUniqueId(long uniqueId) {
		Candidates can = em.find(Candidates.class, uniqueId);
		return can;
	}

	/*
	 * @Override
	 * 
	 * @Transactional public String createNewCandidates(Candidates candidates) { int
	 * id = sequence.incrementAndGet(); String str = "123JobManager"+id;
	 * candidates.setUniqueId(str); em.persist(candidates); return
	 * candidates.getUniqueId(); }
	 */
	@Override
	@Transactional
	public List<Candidates> findAll() {
		Query q = em.createQuery("select c from Candidates as c");
		List<Candidates> li = q.getResultList();
		return li;
	}

	@Override
	public List<Long> getFilteredIds(long id1, long id2) {
		
		
		Query q = em.createQuery("select c from Candidates as c where uniqueId between "+id1+" and "+id2);
		List ll = q.getResultList();
		return ll;
		
	}

	@Override
	public Page<Candidates> getPagination(Pageable pageable) {
		
		Query q1 = em.createQuery("select c from Candidates as c");
		int pageNumber = pageable.getPageNumber();
		int pageSize = pageable.getPageSize();
		q1.setFirstResult(pageNumber*pageSize);
		q1.setMaxResults(pageSize);
		List<Candidates> ll = q1.getResultList();
		
		Query q2 = em.createQuery("select count(c.uniqueId) from Candidates as c");
		long l = (long) q2.getSingleResult();
		int i = (int)l;
		return new PageImpl<>(ll, pageable, pageSize);
	}
	
	
	
}
