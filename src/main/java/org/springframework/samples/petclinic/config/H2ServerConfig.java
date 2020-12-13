package org.springframework.samples.petclinic.config;

import org.h2.tools.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.SQLException;

/**
 * H2 DB에 외부 SQL클라이언트 접속을 위해 필요함
 */
@Configuration
public class H2ServerConfig {

	@Bean
	public Server h2TcpServer() throws SQLException {
		return Server.createTcpServer().start();
	}

}
