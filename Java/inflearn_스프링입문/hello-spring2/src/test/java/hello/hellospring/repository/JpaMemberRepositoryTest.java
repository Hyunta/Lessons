package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
@ExtendWith(SpringExtension.class)
@Transactional
class JpaMemberRepositoryTest {

    @Autowired
    MemberRepository memberRepository;


    @Test
    void save() {
        Member member = new Member();
        member.setName("Spring");
        Member saveId = memberRepository.save(member);

        Assertions.assertThat(member.getName()).isEqualTo(saveId.getName());
    }
}