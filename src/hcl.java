import java.io.IOException;
import java.nio.ByteBuffer;

public interface hcl extends hci {
   ByteBuffer b() throws IOException;
}
