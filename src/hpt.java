import java.io.IOException;
import java.nio.ByteBuffer;

public interface hpt extends hpq {
   ByteBuffer b() throws IOException;
}
