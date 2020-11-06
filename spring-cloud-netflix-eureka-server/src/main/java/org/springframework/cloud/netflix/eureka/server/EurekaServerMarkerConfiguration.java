/*
 * Copyright 2017-2019 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.cloud.netflix.eureka.server;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Responsible for adding in a marker bean to activate
 * {@link EurekaServerAutoConfiguration}.
 *
 * @author Biju Kunjummen
 * @author kit
 * @date 20200413
 * 可以看到，这里只是把一个空的Marker类变成了spring中的Bean。
 * 而Marker本身什么功能都没有实现。顾名思义，我们可以这样猜测一下：@EnableEurekaServer注解就是将Marker配置为Bean，而Marker作为Bean的存在，将会触发自动配置，从而达到了一个开关的效果。
 */
@Configuration(proxyBeanMethods = false)
public class EurekaServerMarkerConfiguration {

	@Bean
	public Marker eurekaServerMarkerBean() {
		return new Marker();
	}

	class Marker {

	}

}
