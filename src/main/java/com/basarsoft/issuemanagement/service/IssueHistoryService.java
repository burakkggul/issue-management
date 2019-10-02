package com.basarsoft.issuemanagement.service;

import com.basarsoft.issuemanagement.model.Issue;
import com.basarsoft.issuemanagement.model.IssueHistory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface IssueHistoryService {
    IssueHistory save(IssueHistory issueHistory);

    IssueHistory getById(Long id);

    Page<IssueHistory> getAllPageable(Pageable pageable);

    Boolean delete (IssueHistory issueHistory);

}
