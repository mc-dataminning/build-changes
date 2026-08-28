import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import javax.sound.sampled.AudioFormat;

public interface hfw extends Closeable {
   AudioFormat a();

   ByteBuffer a(int var1) throws IOException;
}
