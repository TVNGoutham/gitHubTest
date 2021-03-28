package com.candidates.registration.Dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.candidates.registration.domain.Candidates;

public class CanddatesDaoImpl implements CandidatesDaoInterf {

	Map<Long, Candidates> map = new ConcurrentHashMap<Long, Candidates>();
	AtomicLong sequence = new AtomicLong(20201205);
	
	@Override
	public Candidates save(Candidates candida) {
		long id = sequence.incrementAndGet();
		candida.setUniqueId(id);
		map.put(id, candida);
		return candida;
	}

	@Override
	public Candidates findByUniqueId(long uniqueId) {
		return map.get(uniqueId);
	}

	/*
	 * @Override public String createNewCandidates(Candidates candidates) { // TODO
	 * Auto-generated method stub return candidates.getUniqueId(); }
	 */
	@Override
	public List<Candidates> findAll() {
		return new ArrayList<>(map.values());
	}

	@Override
	public List<Long> getFilteredIds(long id1, long id2) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Page<Candidates> getPagination(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

}
