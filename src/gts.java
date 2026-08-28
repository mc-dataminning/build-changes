import java.io.IOException;
import java.nio.ByteBuffer;

public interface gts extends gtp {
   ByteBuffer b() throws IOException;
}
