package com.flexy.domain.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.katharsis.resource.annotations.JsonApiId;
import io.katharsis.resource.annotations.JsonApiResource;
import lombok.Data;

import java.io.Serializable;

@JsonApiResource(type = "employees")
@Data
public class Employee implements Serializable {

    @JsonApiId
    private int employeeId;

    @JsonProperty("employee-name")
    private String employeeName;

    private String gender;

    private String role;

}
