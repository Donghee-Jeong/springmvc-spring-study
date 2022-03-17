package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class LogTestController {

//    private final Logger log = LoggerFactory.getLogger(getClass()); //@Slf4j 사용 시 안적어도 됨.

    @RequestMapping("/log-test")
    public String logTest(){
        String name = "Spring";

//        log.trace("trace = " + name); // +를 사용하면 연산이 일어남. 연산까지 해놓고 출력안하는 로그레벨일수도 있기 때문에 +사용X
        log.trace("trace = {}", name);

        log.debug("debug = {}", name);
        log.info("info log = {}", name);
        log.warn("warn log = {}", name);
        log.error("error log = {}", name);

        return "ok";
    }
}
