package com.ram.springrest.service;

import java.util.List;

import com.ram.springrest.entity.Course;

public interface CourseServices {

	public List<Course> getCourses();

	public Course getCourses(long courseID);

	public Course addCourse(Course course);

	public Course updateCourse(Course course);
	
	public void deleteCourse(long courseId);
}
