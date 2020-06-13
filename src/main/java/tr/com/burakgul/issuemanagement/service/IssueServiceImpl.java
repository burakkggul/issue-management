package tr.com.burakgul.issuemanagement.service;

import tr.com.burakgul.issuemanagement.dto.IssueDto;
import tr.com.burakgul.issuemanagement.model.Issue;
import tr.com.burakgul.issuemanagement.repository.IssueRepository;
import tr.com.burakgul.issuemanagement.util.TPage;
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
        Issue issueDb = modelMapper.map(issue,Issue.class);
        issueRepository.save(issueDb);
        return modelMapper.map(issueDb,IssueDto.class);
    }

    @Override
    public IssueDto getById(Long id) {
        Issue issue = issueRepository.getOne(id);
        return modelMapper.map(issue,IssueDto.class);
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

    @Override
    public IssueDto update(Long id, IssueDto project) {
        return null;
    }

    public Boolean delete(Long id) {
        issueRepository.deleteById(id);
        return true;
    }
}
