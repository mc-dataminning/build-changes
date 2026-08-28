import java.io.IOException;
import java.nio.ByteBuffer;

public interface hba extends hax {
   ByteBuffer b() throws IOException;
}
