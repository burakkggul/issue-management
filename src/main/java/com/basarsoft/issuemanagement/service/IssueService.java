package com.basarsoft.issuemanagement.service;

import com.basarsoft.issuemanagement.dto.IssueDto;
import com.basarsoft.issuemanagement.model.Issue;
import com.basarsoft.issuemanagement.util.TPage;
import org.springframework.data.domain.Pageable;


public interface IssueService {

    IssueDto save(IssueDto issue);

    IssueDto getById(Long id);

    TPage<IssueDto> getAllPageable(Pageable pageable);

    Boolean delete(IssueDto issueDto);
}
