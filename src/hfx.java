import java.io.IOException;
import java.nio.ByteBuffer;

public interface hfx extends hfu {
   ByteBuffer b() throws IOException;
}
