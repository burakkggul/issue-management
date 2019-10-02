package com.basarsoft.issuemanagement.dto;

import com.basarsoft.issuemanagement.model.IssueStatus;
import lombok.*;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class IssueDto {
    private long id;
    private String description;
    private String details;
    private Date date;
    private IssueStatus issueStatus;
    private UserDto assignee;
    private ProjectDto project;

}
