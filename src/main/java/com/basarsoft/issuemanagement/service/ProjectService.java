package com.basarsoft.issuemanagement.service;

import com.basarsoft.issuemanagement.dto.ProjectDto;
import com.basarsoft.issuemanagement.util.TPage;
import org.springframework.data.domain.Pageable;

public interface ProjectService {

    ProjectDto save(ProjectDto project);

    ProjectDto getByProjectCode(String projectCode);

    ProjectDto getById(Long id);

    TPage<ProjectDto> getAllPageable(Pageable pageable);

    ProjectDto update(Long id, ProjectDto project);
    Boolean delete(Long id);
}
