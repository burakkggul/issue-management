package com.basarsoft.issuemanagement.service;

import com.basarsoft.issuemanagement.dto.ProjectDto;
import com.basarsoft.issuemanagement.model.Project;
import com.basarsoft.issuemanagement.repository.ProjectRepository;
import com.basarsoft.issuemanagement.util.TPage;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class ProjectServiceImpl implements ProjectService {

    private final ProjectRepository projectRepository;
    private final ModelMapper modelMapper;

    public ProjectServiceImpl(ProjectRepository projectRepository, ModelMapper modelMapper) {
        this.projectRepository = projectRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public ProjectDto save(ProjectDto project) {
        Project projectCodeCheck = projectRepository.getByProjectCode(project.getProjectCode());

        if (projectCodeCheck != null) {
            throw new IllegalArgumentException("Not Null");
        }
        Project projectDb = modelMapper.map(project, Project.class);
        projectRepository.save(projectDb);
        return modelMapper.map(projectDb, ProjectDto.class);
    }

    @Override
    public ProjectDto getByProjectCode(String projectCode) {
        return null;
    }

    @Override
    public ProjectDto getById(Long id) {
        Project p = projectRepository.getOne(id);
        return modelMapper.map(p, ProjectDto.class);

    }


    @Override
    public TPage<ProjectDto> getAllPageable(Pageable pageable) {
        Page<Project> data = projectRepository.findAll(pageable);
        TPage<ProjectDto> response = new TPage<ProjectDto>();
        response.setStat(data, Arrays.asList(modelMapper.map(data.getContent(), ProjectDto[].class)));
        return response;
    }

    @Override
    public ProjectDto update(Long id, ProjectDto project) {

        Project projectDb = projectRepository.getOne(id);
        if (projectDb == null) {
            throw new IllegalArgumentException("Project Does not exist ID:" + id);
        }

        Project projectCodeCheck = projectRepository.getByProjectCodeAndIdNot(project.getProjectCode(),id);

        if (projectCodeCheck != null) {
            throw new IllegalArgumentException("Already Exsist.");
        }

        projectDb.setProjectCode(project.getProjectCode());
        projectDb.setProjectName(project.getProjectName());

        projectRepository.save(projectDb);

        return modelMapper.map(projectDb, ProjectDto.class);
    }
    @Override
    public Boolean delete(Long id){
        projectRepository.deleteById(id);
        return true;
    }

}
