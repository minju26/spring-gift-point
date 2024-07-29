package gift.EntityTest;

import gift.Model.Entity.Member;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.assertAll;


public class MemberTest {

    @Test
    void creationTest(){
        Member member = new Member("woo6388@naver.com", "123456789");

        assertAll(
                ()->assertThat(member.getEmail().getValue()).isEqualTo("woo6388@naver.com"),
                () -> assertThat(member.getPassword().getValue()).isEqualTo("123456789")
        );
    }

    @Test
    void setterTest(){
        Member member = new Member("woo6388@naver.com", "123456789");

        member.update("qoo6388@naver.com", "0000");

        assertAll(
                () -> assertThat(member.getEmail().getValue()).isEqualTo("qoo6388@naver.com"),
                () -> assertThat(member.getPassword().getValue()).isEqualTo("0000")
        );

    }

}