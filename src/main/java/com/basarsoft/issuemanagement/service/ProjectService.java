package com.basarsoft.issuemanagement.service;

import com.basarsoft.issuemanagement.dto.ProjectDto;
import com.basarsoft.issuemanagement.model.Project;
import com.basarsoft.issuemanagement.repository.ProjectRepository;
import com.basarsoft.issuemanagement.util.TPage;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProjectService {

    ProjectDto save(ProjectDto project);

    ProjectDto getById(Long id);

    TPage<ProjectDto> getAllPageable(Pageable pageable);
}
