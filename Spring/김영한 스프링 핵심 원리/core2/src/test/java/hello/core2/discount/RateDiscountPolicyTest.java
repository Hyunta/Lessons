package hello.core2.discount;

import hello.core2.member.Grade;
import hello.core2.member.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class RateDiscountPolicyTest {

    RateDiscountPolicy discountPolicy = new RateDiscountPolicy();

    @Test
    @DisplayName("VIP는 10%할인이 적용되어야 한다.")
    void vip_o() {
        //given
        Member member = new Member(1L, "kim", Grade.VIP);
        //when
        int discount = discountPolicy.discount(member, 20000);
        //then
        assertThat(discount).isEqualTo(2000);

    }

    @Test
    @DisplayName("VIP가 아닌 경우 할인이 적용되면 안된다.")
    void vip_X() {
        //given
        Member member = new Member(1L, "Hong", Grade.BASIC);
        //when
        int discount = discountPolicy.discount(member, 20000);
        //then
        assertThat(discount).isEqualTo(0);
    }
}