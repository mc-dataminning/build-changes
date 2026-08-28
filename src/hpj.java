import java.io.IOException;
import java.nio.ByteBuffer;

public interface hpj extends hpg {
   ByteBuffer b() throws IOException;
}
