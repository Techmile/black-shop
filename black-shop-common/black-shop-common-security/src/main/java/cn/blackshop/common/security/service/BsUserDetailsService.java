/**  
 
* <p>Company: www.black-shop.cn</p>  

* <p>Copyright: Copyright (c) 2018-2050</p>

* black-shop(黑店) 版权所有,并保留所有权利。

*/
package cn.blackshop.common.security.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

/**
 * 用户登录的service.
 * @date 2019-07-19
 * @author zibin
 */
public interface BsUserDetailsService extends UserDetailsService {

  /**
   * 根据社交登录type 登录.
   *
   * @return the user details
   * @throws UsernameNotFoundException the username not found exception
   */
  UserDetails loadUserBySocial(String type) throws UsernameNotFoundException;

}
