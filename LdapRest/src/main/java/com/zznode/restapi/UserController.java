package com.zznode.restapi;

import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * @author wangxs
 *
 */
@Api(value = "提供与LADP账号同步的RESTFul接口", tags = { "LDAP操作接口" })
@RestController
@RequestMapping("/zznode")
public class UserController {

	@ApiOperation(value = "LDAP同步新增用户")
	@PostMapping("/user")
	public String create(@ApiParam("用户账号") @RequestParam(value = "uid") String uid) {

		String message = "0";
		// 1.根据传过来的uid参数进行业务逻辑判断

		if (StringUtils.isEmpty(uid)) {
			return message;
		} else {
			// 1 调用业务逻辑层进行业务的处理
		}
		return message;
	}

	@ApiOperation(value = "LDAP同步删除用户")
	@DeleteMapping("/user")
	public String delete(@ApiParam("用户账号") @RequestParam(value = "uid") String uid) {

		String message = "0";
		// 1.根据传过来的uid参数进行业务逻辑判断

		if (StringUtils.isEmpty(uid)) {

			message = "1";
		} else {
			// 1 调用业务逻辑层进行业务的处理
		}
		return message;
	}

}
