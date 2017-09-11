package ifpb.ads.eureka.feign.client;

import ifpb.ads.eureka.client.GreetingController;
import org.springframework.cloud.netflix.feign.FeignClient;

/**
 * @author Ricardo Job
 * @mail ricardo.job@ifpb.edu.br
 * @since 01/09/2017, 14:59:08
 */
@FeignClient("spring-cloud-eureka-client")
public interface GreetingClient extends GreetingController {
}
