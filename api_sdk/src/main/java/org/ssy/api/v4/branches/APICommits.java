package org.ssy.api.v4.branches;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import okhttp3.OkHttpClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by manager on 2018/6/7.
 */
public class APICommits {

  private final Logger logger = LoggerFactory.getLogger(this.getClass());

  OkHttpClient client = new OkHttpClient();

  Gson gson = new Gson();

  /**
   * GET /projects/:id/repository/commits
   */
  JsonObject listRepositoryCommits(String projectId) {
    return null;
  }

  /**
   * POST /projects/:id/repository/commits
   */
  JsonObject createCommit() {
    return null;
  }

  /**
   * GET /projects/:id/repository/commits/:sha
   */
  JsonObject getSingleCommit() {
    return null;
  }

  

}
