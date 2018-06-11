# gitlab_api
use java create gitlab http api request


#2018-06-06 build APIBranches（no test）


#2018-06-07 build APICommits，APIDeployments APIGroups（just skeleton）


#2018-06-11 gitlab API的组合使用


1)分支自动合并流程：

1.对比两个分支的区别（GET /projects/:id/repository/compare eg:GET/projects/:id/repository/compare?from=master&to=feature）

2.如果分支有差异（diffs 字段数据为空）

3.创建合并请求(POST /projects/:id/merge_requests)

4.接受合并请求（有分支冲突的报错，有没有更新的报错）(PUT /projects/:id/merge_requests/:merge_request_iid/merge)

2)获取所有的分支（GET /projects/:id/repository/branches）