package tr.com.burakgul.issuemanagement.service;

import tr.com.burakgul.issuemanagement.dto.IssueDto;
import tr.com.burakgul.issuemanagement.util.TPage;
import org.springframework.data.domain.Pageable;


public interface IssueService {

    IssueDto save(IssueDto issue);

    IssueDto getById(Long id);

    TPage<IssueDto> getAllPageable(Pageable pageable);

    Boolean delete(IssueDto issueDto);

    IssueDto update(Long id, IssueDto project);
}
