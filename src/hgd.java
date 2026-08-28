import java.io.IOException;
import java.nio.ByteBuffer;

public interface hgd extends hga {
   ByteBuffer b() throws IOException;
}
