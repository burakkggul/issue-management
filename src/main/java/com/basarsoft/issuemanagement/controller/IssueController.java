package com.basarsoft.issuemanagement.controller;

import com.basarsoft.issuemanagement.dto.IssueDto;
import com.basarsoft.issuemanagement.service.IssueServiceImpl;
import com.basarsoft.issuemanagement.util.ApiPaths;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiOperation;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(ApiPaths.IssueCtrl.CTRL)
@Api(value = ApiPaths.IssueCtrl.CTRL)
public class IssueController {

    private final IssueServiceImpl issueService;

    public IssueController(IssueServiceImpl issueService) {
        this.issueService = issueService;
    }

    @GetMapping("/{id}")
    @ApiOperation(value = "Issue ID", response = IssueDto.class)
    public ResponseEntity<IssueDto> getById(@PathVariable("id") Long id) {
        IssueDto issueDto = issueService.getById(id);
        return ResponseEntity.ok(issueDto);
    }

    @PostMapping
    @ApiOperation(value = "Create Of Issue.", response = IssueDto.class)
    public ResponseEntity<IssueDto> createIssue(@Valid @RequestBody IssueDto issueDto) {
        return ResponseEntity.ok(issueService.save(issueDto));
    }

    @PutMapping("/{id}")
    @ApiOperation(value = "Update Of Issue.", response = IssueDto.class)
    public ResponseEntity<IssueDto> updateIssue(@PathVariable("id") Long id, @Valid @RequestBody IssueDto issue) {
        return ResponseEntity.ok(issueService.update(id, issue));
    }

    @DeleteMapping("/{id}")
    @ApiOperation(value = "Delete Of Issue.", response = Boolean.class)
    public ResponseEntity<Boolean> delete(@PathVariable(value = "id", required = true) Long id) {
        return ResponseEntity.ok(issueService.delete(id));

    }

}
