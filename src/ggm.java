import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.concurrent.Executor;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;

public class ggm implements AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private final bfb<ggl> b;
   private final bhq<Runnable> c;

   public ggm(FileChannel $$0, Executor $$1) {
      this.b = new bfb<>(ggl.a, $$0);
      this.c = bhq.a($$1, "telemetry-event-log");
   }

   public ggn a() {
      return $$0 -> this.c.a(() -> {
            try {
               this.b.a($$0);
            } catch (IOException var3) {
               a.error("Failed to write telemetry event to log", var3);
            }
         });
   }

   @Override
   public void close() {
      this.c.a(() -> IOUtils.closeQuietly(this.b));
      this.c.close();
   }
}
