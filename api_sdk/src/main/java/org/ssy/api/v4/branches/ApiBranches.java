package org.ssy.api.v4.branches;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.ssy.api.v4.constant.UrlConstant;

/**
 * Created by manager on 2018/6/6.
 */
public class ApiBranches {

  private final Logger logger = LoggerFactory.getLogger(this.getClass());

  OkHttpClient client = new OkHttpClient();

  Gson gson = new Gson();

  /**
   * GET /projects/:id/repository/branches
   */
  JsonArray listRepositoryBranches(String projectId) {
    String listProjectBranchesUrl = UrlConstant.buildListRepositoryBranch(projectId);
    Request request = UrlConstant.createDefaultRequest(listProjectBranchesUrl);
    //需要解析数据信息
    try {
      Response response = client.newCall(request).execute();
      ResponseBody requestBody = response.body();
      JsonArray jsonArray = gson.fromJson(requestBody.string(),
          JsonArray.class);
      return jsonArray;
    } catch (Exception e) {
      logger.error("listRepositoryBranches error:", e);
      return null;
    }
  }

  /**
   * GET /projects/:id/repository/branches/:branch
   */
  JsonObject getSingleRepositoryBranch(String projectId) {
    String listProjectBranchesUrl = UrlConstant.buildListRepositoryBranch(projectId);
    Request request = UrlConstant.createDefaultRequest(listProjectBranchesUrl);
    //需要解析数据信息
    try {
      Response response = client.newCall(request).execute();
      ResponseBody requestBody = response.body();
      JsonObject jsonArray = gson.fromJson(requestBody.string(),
          JsonObject.class);
      return jsonArray;
    } catch (Exception e) {
      logger.error("listRepositoryBranches error:", e);
      return null;
    }
  }

  /**
   * PUT /projects/:id/repository/branches/:branch/protect
   */






}
