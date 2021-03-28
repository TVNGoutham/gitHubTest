package com.candidates.registration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.candidates.registration.Dao.CandidatesDaoInterf;
import com.candidates.registration.domain.Candidates;
import com.candidates.registration.domain.TestClass;
import com.candidates.registration.service.CandidatesServiceInterf;

@RestController
@RequestMapping(value = "/candidates")
public class CandidatesController {

	CandidatesServiceInterf service;
	CandidatesDaoInterf dao;
	
	@Autowired
	public void setService(CandidatesServiceInterf service) {
		this.service = service;
	}
	
	@Autowired
	public void setDao(CandidatesDaoInterf dao) {
		this.dao = dao;
	}
	
	@GetMapping("/jobapplied")
	public List<Candidates> getAllCandidates()
	{
		List<Candidates> list = service.findAll();
		return list;
	}
	
	@GetMapping("/jobapplied/{jbId}")
	public ResponseEntity<Candidates> getCandidatesByUniqueId(@PathVariable("jbId") long id)
	{
		Candidates c = service.findByUniqueId(id);
		if(c == null) {
			System.out.println("Candidate profile is not exist");
			return new ResponseEntity<Candidates>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<Candidates>(c, HttpStatus.OK);
		}
	}
	
	@PostMapping("/jobapplied")
	public ResponseEntity<Object> createCandidatesById(@RequestBody Candidates toSaved)
	{
		if(toSaved.getFirstName() != null && toSaved.getLastName() != null && toSaved.getPhone() != null &&
				toSaved.getCurrentCompanyName() != null && toSaved.getExperience() != 0.0 && toSaved.getSkills() != null ) {
			long suid = service.createNewCandidates(toSaved);
			return new ResponseEntity<Object>(suid, HttpStatus.OK);
		}else {
			System.out.println("Please fill all the mandatory Fileds before submission");
			return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PutMapping("/jobapplied/{Id}")
	public ResponseEntity<Candidates> updateCandidatesById(@PathVariable("Id") long id, @RequestBody Candidates toBeUpdated)
	{
		Candidates c = service.findByUniqueId(id);
		if(c == null) {
			System.out.println("Requested Id profile does not exist");
			return new ResponseEntity<Candidates>(HttpStatus.NOT_FOUND);
		}else {
			c.setFirstName(toBeUpdated.getFirstName());
			c.setLastName(toBeUpdated.getLastName());
			c.setPhone(toBeUpdated.getPhone());
			c.setCountry(toBeUpdated.getCountry());
			c.setCurrentCompanyName(toBeUpdated.getCurrentCompanyName());
			c.setPreviousCompany(toBeUpdated.getPreviousCompanyDetails());
			c.setExperience(toBeUpdated.getExperience());
			c.setSkills(toBeUpdated.getSkills());
			service.save(c);
			return new ResponseEntity<Candidates>(c, HttpStatus.OK);
		}
	}
	
	@PatchMapping("/jobapplied/{pid}")
	public ResponseEntity<Candidates> partialUpdateById(@RequestBody Candidates candi, @PathVariable("pid") int id) {
		Candidates can = service.findByUniqueId(id);
		if (can == null) {
			System.out.println("Requested customer id does not exist");
			return new ResponseEntity<Candidates>(HttpStatus.NOT_FOUND);
		} else {

			if (candi.getFirstName() != null) {
				can.setFirstName(candi.getFirstName());
			}

			if (candi.getLastName() != null) {
				can.setLastName(candi.getLastName());
			}

			if (candi.getPhone() != null) {
				can.setPhone(candi.getPhone());
			}

			if (candi.getCountry() != null) {
				can.setCountry(candi.getCountry());
			}

			if (candi.getCurrentCompanyName() != null) {
				can.setCurrentCompanyName(candi.getCurrentCompanyName());
			}

			if (candi.getPreviousCompanyDetails() != null) {
				can.setPreviousCompany(candi.getPreviousCompanyDetails());
			}

			if (candi.getExperience() != 0) {
				can.setExperience(candi.getExperience());
			}

			if (candi.getSkills() != null) {
				can.setSkills(candi.getSkills());
			}

			service.save(can);
			return new ResponseEntity<Candidates>(can, HttpStatus.OK);
		}
	}
	
	// =========================================================================================================================
	
	@RequestMapping(value = "/newpagination", method = RequestMethod.PUT)
	public Page<Candidates> getPagination(Pageable pageable)
	{
		Page<Candidates> page = service.getPagination(pageable);
		return page;
	}
	
	//Practise purpose to build the URI
	@RequestMapping(value = "/personaldetails/{brandName}/{brandId}", method = RequestMethod.PUT)
	public String checkingScenario1(@PathVariable("brandName") String str, @PathVariable("brandId") int num)
	{
		return "Testing the application url-1....";
	}
	
	//Practise purpose to build the URI
	@RequestMapping(value = "/personaldetails/{brandName}", method = RequestMethod.DELETE)
	public String checkingScenario2(@PathVariable("brandName") String num)
	{
		return "Testing the application url-2....";
	}
	
	// testing the Sub-class data
	@RequestMapping(value = "/personaldetails/testing", method = RequestMethod.POST)
	public String getTestClass()
	{
		TestClass t = new TestClass();
		return t.volter();
	}
	
	// filtering records within page
	@RequestMapping(value = "/personaldetails/limits", method = RequestMethod.POST)
	public String limitless(@RequestParam(value = "page") int str1, @RequestParam(value = "limit") int str2)
	{
		return "Records are taking from page "+str1+" and limit will be "+str2;
	}
	
	// filtering the data
	@RequestMapping(value = "/personaldetails/filtered", method = RequestMethod.DELETE)
	public List getFilteredIds(@RequestParam (value = "grip1") long id1, @RequestParam (value = "grip2") long id2)
	{
		List<Long> uni = service.getFilteredIds(id1, id2);
		return uni;
	}
	
	
}
