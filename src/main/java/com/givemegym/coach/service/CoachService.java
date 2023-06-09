package com.givemegym.coach.service;

import java.util.List;

import com.givemegym.coach.vo.Coach;

public interface CoachService {

	public List<Coach> findAll();

	public Coach findById(int theId);

	public void save(Coach theCoach);

	public void deleteById(int theId);
}
