package com.sample.services;

import com.sample.model.MonthAttendance;
import com.sample.model.Student;
import com.sample.model.StudentCourse;

import javax.jws.WebService;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;
import java.util.Map;

/**
 * Created by arunv on 11/10/16.
 */
@WebService(serviceName = "student")
@Consumes({MediaType.APPLICATION_JSON })
@Produces({MediaType.APPLICATION_JSON })
public interface StudentService {

    @GET
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces({ MediaType.APPLICATION_JSON })
    @Path("/allstudent")
    public Map<String,List<Student>> getAllStudents();

    @GET
    @Consumes(MediaType.APPLICATION_FORM_URLENCODED)
    @Produces({ MediaType.APPLICATION_JSON })
    @Path("/student/{studentId}")
    public Map<String, Student> getAllStudentsByCourse(@PathParam("studentId") String studentId);


}
//try using this url : http://localhost:8080/services/studentservice/{Path}