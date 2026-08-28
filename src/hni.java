import java.io.IOException;
import java.nio.ByteBuffer;

public interface hni extends hnf {
   ByteBuffer b() throws IOException;
}
