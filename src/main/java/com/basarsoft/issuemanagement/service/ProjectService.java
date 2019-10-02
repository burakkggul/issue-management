package com.basarsoft.issuemanagement.service;

import com.basarsoft.issuemanagement.model.Project;
import com.basarsoft.issuemanagement.repository.ProjectRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProjectService {

    Project save(Project project);

    Project getById(Long id);

    Page<Project> getAllPageable(Pageable pageable);
}
