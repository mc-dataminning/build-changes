import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.concurrent.Executor;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;

public class hla implements AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private final bob<hkz> b;
   private final bro c;

   public hla(FileChannel $$0, Executor $$1) {
      this.b = new bob<>(hkz.a, $$0);
      this.c = new bro($$1, "telemetry-event-log");
   }

   public hlb a() {
      return $$0 -> this.c.a_(() -> {
            try {
               this.b.a($$0);
            } catch (IOException var3) {
               a.error("Failed to write telemetry event to log", var3);
            }
         });
   }

   @Override
   public void close() {
      this.c.a_(() -> IOUtils.closeQuietly(this.b));
      this.c.close();
   }
}
