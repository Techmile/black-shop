/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018</p>   

* @version 1.0  

* black-shop(黑店) 版权所有,并保留所有权利。

*/  
package cn.blackshop.impl;

import org.springframework.stereotype.Service;

import cn.blackshop.service.UserSecurityService;
import lombok.extern.slf4j.Slf4j;

/**

* <p>Title: UserServiceImpl</p>  

* <p>Description: </p>  

* @author zibin  

* @date 2018年12月3日  

*/
@Service(value = "userSecurityService")
@Slf4j
public class UserSecurityServiceImpl implements UserSecurityService {
	
	@Override
	public String UserAuthentication(String userName) {
		log.info("用户认证实现类");
		return null;
	}
}
