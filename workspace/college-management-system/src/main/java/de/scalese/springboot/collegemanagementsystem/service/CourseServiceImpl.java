package de.scalese.springboot.collegemanagementsystem.service;

import de.scalese.springboot.collegemanagementsystem.dao.CourseRepository;
import de.scalese.springboot.collegemanagementsystem.entity.Course;
import de.scalese.springboot.collegemanagementsystem.entity.Instructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseRepository courseRepository;

    @Override
    public List<Course> findAll() {
        return courseRepository.findAll();
    }

    @Override
    public Course findById(int id) {

        Optional<Course> result = courseRepository.findById(id);

        if (!result.isPresent()) {
            throw new RuntimeException("Did not find course id: " + id);
        }

        return result.get();
    }

    @Override
    public void save(Course course) {
        courseRepository.save(course);
    }

    @Override
    public void delete(int id) {
        courseRepository.deleteById(id);
    }

    @Override
    public Instructor findInstructor(int courseId) {

        return this.findById(courseId).getInstructor();
    }
}
