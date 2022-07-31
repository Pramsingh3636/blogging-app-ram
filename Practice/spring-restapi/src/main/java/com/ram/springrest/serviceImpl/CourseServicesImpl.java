package com.ram.springrest.serviceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.ram.springrest.entity.Course;
import com.ram.springrest.service.CourseServices;

@Service
public class CourseServicesImpl implements CourseServices{

	List<Course> list;
	public CourseServicesImpl() {
		list = new ArrayList<>();

		list.add(new Course(111, "Java", "James Ghosling", "only core java"));
		list.add(new Course(112, "C++", "Bjarne", "complete C++ Course"));
	}

	@Override
	public List<Course> getCourses() {
		return list;
	}

	@Override
	public Course getCourses(long courseID) {
		Course c = null;
		for(Course course:list) {
			if(course.getCid() == courseID) {
				c = course;
				break;
			}
		}
		return c;
	}

	@Override
	public Course addCourse(Course course) {
		list.add(course);
		return course;
	}

	@Override
	public Course updateCourse(Course course) {
		
		list.forEach(e->{ if(e.getCid()==course.getCid()) {
			e.setTitle(course.getTitle());
			e.setWriter(course.getWriter());
			e.setDescription(course.getDescription());
		}
		});
	return course;
	}

	@Override
	public void deleteCourse(long parseLong) {
		
		list = this.list.stream().filter(e -> e.getCid() != parseLong).collect(Collectors.toList());
	}

}
