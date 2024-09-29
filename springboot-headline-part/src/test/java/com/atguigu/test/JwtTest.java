package com.atguigu.test;

import com.atguigu.utils.JwtHelper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * ClassName: JwtTest
 * Package: com.atguigu.test
 * Description:
 *
 * @Author HL
 * @Create 9/25/2024 2:47 PM
 * @Version:
 */
@SpringBootTest
public class JwtTest {
    @Autowired
    private JwtHelper jwtHelper;
    
    @Test
    public void test(){
        String token = jwtHelper.createToken(1L);
        System.out.println("token = " + token);

        int userId = jwtHelper.getUserId(token).intValue();
        System.out.println("userId = " + userId);

        boolean expiration = jwtHelper.isExpiration(token);
        System.out.println("expiration = " + expiration);
    }
}
