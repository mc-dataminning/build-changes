import java.io.IOException;
import java.nio.ByteBuffer;

public interface hll extends hli {
   ByteBuffer b() throws IOException;
}
