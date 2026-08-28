import java.io.IOException;
import java.nio.ByteBuffer;

public interface hms extends hmp {
   ByteBuffer b() throws IOException;
}
