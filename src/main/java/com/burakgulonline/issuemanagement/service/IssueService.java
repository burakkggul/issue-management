package com.burakgulonline.issuemanagement.service;

import com.burakgulonline.issuemanagement.dto.IssueDto;
import com.burakgulonline.issuemanagement.util.TPage;
import org.springframework.data.domain.Pageable;


public interface IssueService {

    IssueDto save(IssueDto issue);

    IssueDto getById(Long id);

    TPage<IssueDto> getAllPageable(Pageable pageable);

    Boolean delete(IssueDto issueDto);

    IssueDto update(Long id, IssueDto project);
}