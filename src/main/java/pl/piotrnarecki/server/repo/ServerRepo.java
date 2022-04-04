package pl.piotrnarecki.server.repo;

import pl.piotrnarecki.server.model.Server;
import org.springframework.data.jpa.repository.JpaRepository;
import pl.piotrnarecki.server.ServerApplication;

public interface ServerRepo extends JpaRepository<Server, Long> {

    Server findByIpAddress(String ipAddress);



}
