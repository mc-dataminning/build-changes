import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.concurrent.Executor;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;

public class hog implements AutoCloseable {
   private static final Logger a = LogUtils.getLogger();
   private final bpg<hof> b;
   private final bst c;

   public hog(FileChannel $$0, Executor $$1) {
      this.b = new bpg<>(hof.a, $$0);
      this.c = new bst($$1, "telemetry-event-log");
   }

   public hoh a() {
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
