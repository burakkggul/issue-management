package com.burakgulonline.issuemanagement.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@ApiModel(value = "Project Data Transfer Object")
public class ProjectDto {
    @ApiModelProperty(value = "Project ID ")
    private Long id;
    @NotNull
    @NotEmpty
    @ApiModelProperty(required = true, value = "Name Of Project.")
    private String projectName;
    @NotNull
    @NotEmpty
    @ApiModelProperty(required = true, value = "Code Of Project.")
    private String projectCode;
}
