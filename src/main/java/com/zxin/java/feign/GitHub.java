package com.zxin.java.feign;

import feign.Param;
import feign.RequestLine;
import lombok.Data;

import java.util.List;

interface GitHub {

  @RequestLine("GET /repos/{owner}/{repo}/contributors")
  List<Contributor> contributors(@Param("owner") String owner, @Param("repo") String repo);

  @RequestLine("POST /repos/{owner}/{repo}/issues")
  void createIssue(Issue issue, @Param("owner") String owner, @Param("repo") String repo);


  @Data
  class Contributor {
    String login;
    int contributions;
  }

  @Data
  class Issue {
    String title;
    String body;
    List<String> assignees;
    int milestone;
    List<String> labels;
  }

}