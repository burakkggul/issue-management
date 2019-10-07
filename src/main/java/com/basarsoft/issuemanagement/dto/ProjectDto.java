package com.basarsoft.issuemanagement.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class ProjectDto {
    private Long id;
    private String projectName;
    private String projectCode;
}
