package hello.typeconverter.type;

import lombok.EqualsAndHashCode;
import lombok.Getter;

//"127.0.0.1:8080"
@Getter
@EqualsAndHashCode
public class IpPort {

    private final String ip;
    private final int port;

    public IpPort(String ip, int port) {
        this.ip = ip;
        this.port = port;
    }
}
