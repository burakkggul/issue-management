package tr.com.burakgul.issuemanagement.dto;

import tr.com.burakgul.issuemanagement.model.IssueStatus;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.*;

import java.util.Date;
import java.util.Scanner;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@ApiModel(value = "Issue Data Transfer Object")
public class IssueDto {
    @ApiModelProperty(value = "ID")
    private Long id;
    @ApiModelProperty(required = true, value = "Issue Description.")
    private String description;
    @ApiModelProperty(required = true, value = "Issue Details.")
    private String details;
    @ApiModelProperty(required = true, value = "Issue Date.")
    private Date date;
    @ApiModelProperty(required = true, value = "Issue Status.")
    private IssueStatus issueStatus;
    @ApiModelProperty(value = "Issue Assignee.")
    private UserDto assignee;
    @ApiModelProperty(value = "Project of Issue.")
    private ProjectDto project;
}
