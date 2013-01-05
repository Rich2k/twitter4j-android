package twitter4j.internal.http;

import java.io.IOException;

public interface HostAddressResolver {

	public String resolve(String host) throws IOException;

}