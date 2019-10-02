package com.basarsoft.issuemanagement.service;

import com.basarsoft.issuemanagement.dto.IssueDto;
import com.basarsoft.issuemanagement.model.Issue;
import com.basarsoft.issuemanagement.repository.IssueRepository;
import com.basarsoft.issuemanagement.util.TPage;
import org.modelmapper.ModelMapper;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class IssueServiceImpl implements IssueService {
    private final ModelMapper modelMapper;
    private final IssueRepository issueRepository;

    public IssueServiceImpl(IssueRepository issueRepository,ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
        this.issueRepository = issueRepository;
    }


    @Override
    public IssueDto save(IssueDto issue) {
        if(issue.getDate() == null){
            throw new IllegalArgumentException("not null");
        }
        Issue issueDb = modelMapper.map(issue,Issue.class);
        issueDb = issueRepository.save(issueDb);
        return modelMapper.map(issueDb,IssueDto.class);
    }

    @Override
    public IssueDto getById(Long id) {
        return null;
    }

    @Override
    public TPage<IssueDto> getAllPageable(Pageable pageable) {
        Page<Issue> data = issueRepository.findAll(pageable);
        TPage<IssueDto> response = new TPage<IssueDto>();
        response.setStat(data, Arrays.asList(modelMapper.map(data.getContent(), IssueDto[].class)));
        return response;
    }

    @Override
    public Boolean delete(IssueDto issueDto) {
        return null;
    }
}
