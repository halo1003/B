package com.busbooking.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.busbooking.entities.Tour;
import com.busbooking.repo.TourRepository;

@Service
public class TourServiceImpl implements TourService {

	@Autowired
	private TourRepository tourRepository;

	/* ---------------- FIND TOUR ------------------------ */
	@Override
	public Page<Tour> findAll(Pageable bageable) {
		return tourRepository.findAllByOrderByIdDesc(bageable);
	}
	
	/* ---------------- FIND TOUR BY ID WITHOUT OPTIONAL ------------------------ */
	@Override
	public Tour findOne(int idTour) {
		return tourRepository.findOne(idTour);
	}
	
	/* ---------------- FIND TOUR BY PARAM ------------------------ */
	@Override
	public Page<Tour> findTourByParam(String startPlace, String endPlace, LocalDateTime startTime, Pageable pageable){
		return tourRepository.findTourByParam(startPlace, endPlace, startTime, pageable);
	}

	/* ---------------- CREATE TOUR ------------------------ */
	@Override
	public Tour save(Tour seat) {
		return tourRepository.save(seat);
	}

	/* ---------------- FIND ID TOUR ------------------------ */
	@Override
	public Optional<Tour> findById(int idTour) {
		return tourRepository.findById(idTour);
	}

	/* ---------------- DELETE ALL TOUR ------------------------ */
	@Override
	public void deleteAll() {
		tourRepository.deleteAll();
	}

	/* ---------------- DELETE BY ID TOUR ------------------------ */
	@Override
	public void deleteById(int id) {
		tourRepository.deleteById(id);
	}

	@Override
	public Page<Tour> findByStartPlaceContaining(String startPlace, Pageable pageable) {
		// TODO Auto-generated method stub
		return tourRepository.findTourByStartPlaceContaining(startPlace, pageable);
	}

	@Override
	public Page<Tour> findTourByEndPlaceContaining(String endPlace, Pageable pageable) {
		// TODO Auto-generated method stub
		return tourRepository.findTourByEndPlaceContaining(endPlace, pageable);
	}

	@Override
	public Page<Tour> findTourByStarttime(LocalDateTime startTime, Pageable pageable) {
		// TODO Auto-generated method stub
		return tourRepository.findTourByStarttime(startTime, pageable);
	}

	@Override
	public Page<Tour> findTourByStartPlaceAndEndplace(String startPlace, String endPlace, Pageable pageable) {
		// TODO Auto-generated method stub
		return tourRepository.findTourByStartPlaceAndEndplace(startPlace, endPlace, pageable);
	}

	@Override
	public Page<Tour> findTourByStartPlaceAndStartTime(String startPlace, LocalDateTime startTime, Pageable pageable) {
		// TODO Auto-generated method stub
		return tourRepository.findTourByStartPlaceAndStartTime(startPlace, startTime, pageable);
	}

	@Override
	public Page<Tour> findTourByEndPlaceAndStartTime(String endPlace, LocalDateTime startTime, Pageable pageable) {
		// TODO Auto-generated method stub
		return tourRepository.findTourByEndPlaceAndStartTime(endPlace, startTime, pageable);
	}

	@Override
	public List<Tour> findAllStartPlace() {
		// TODO Auto-generated method stub
		return tourRepository.findAllStartPlace();
	}



}
