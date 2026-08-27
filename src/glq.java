import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.concurrent.Executor;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;

public class glq implements AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private final bhy<glp> b;
   private final bkn<Runnable> c;

   public glq(FileChannel $$0, Executor $$1) {
      this.b = new bhy<>(glp.a, $$0);
      this.c = bkn.a($$1, "telemetry-event-log");
   }

   public glr a() {
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
