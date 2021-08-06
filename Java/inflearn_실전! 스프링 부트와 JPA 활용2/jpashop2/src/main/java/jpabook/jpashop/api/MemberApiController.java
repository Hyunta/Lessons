package jpabook.jpashop.api;

import jpabook.jpashop.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

// @Controller +  @ResponseBody -> @RestController
@RestController
@RequiredArgsConstructor
public class MemberApiController {

    private final MemberService memberService;
}
