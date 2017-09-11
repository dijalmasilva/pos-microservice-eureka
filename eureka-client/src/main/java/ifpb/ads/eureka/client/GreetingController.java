package ifpb.ads.eureka.client;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 01/09/2017, 14:55:14
 */
public interface GreetingController {

    @RequestMapping("/greeting")
    String greeting();
}
