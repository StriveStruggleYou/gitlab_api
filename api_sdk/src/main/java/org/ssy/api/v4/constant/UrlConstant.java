package org.ssy.api.v4.constant;

import okhttp3.Request;
import okhttp3.RequestBody;

/**
 * Created by manager on 2018/6/6.
 */
public class UrlConstant {

  public static String url = "";

  public static String api_version_path = "/api/v4/";

  public static String repository_branch = "/repository/branches";

  public static String private_token = "private-token";

  public static String private_token_content = "5m3wG8_unUWUA9X84Kqm";

  public static String developers_can_push = "developers_can_push";

  public static String developers_can_merge = "developers_can_merge";


  public static String buildListRepositoryBranch(String projectId) {
    StringBuffer sb = new StringBuffer();
    sb.append(url).append(api_version_path)
        .append(projectId).append(repository_branch);
    return sb.toString();
  }

  public static Request createDefaultRequest(String url) {
    return new Request.Builder()
        .url(url)
        .addHeader("private-token", "5m3wG8_unUWUA9X84Kqm")
        .addHeader("content-type", "application/x-www-form-urlencoded")
        .addHeader("cache-control", "no-cache")
        .get()
        .build();
  }


  public static Request createPutBodyRequest(String url, RequestBody putBody) {
    return new Request.Builder()
        .url(url)
        .addHeader("private-token", "5m3wG8_unUWUA9X84Kqm")
        .addHeader("content-type", "application/x-www-form-urlencoded")
        .addHeader("cache-control", "no-cache")
        .put(putBody)
        .build();
  }


  public static String createProtectContent(Boolean devPush, Boolean devMerge) {
    StringBuffer sb = new StringBuffer();
    sb.append(developers_can_push).append("=").append(devPush).append("&")
        .append(developers_can_merge).append("=").append(devMerge);
    return sb.toString();
  }


}
