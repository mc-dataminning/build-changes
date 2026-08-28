import com.google.common.base.Stopwatch;
import com.mojang.logging.LogUtils;
import java.io.IOException;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.slf4j.Logger;

public class ma {
   private static final Logger a = LogUtils.getLogger();
   private final Path b;
   private final md c;
   final Set<String> d = new HashSet<>();
   final Map<String, mb> e = new LinkedHashMap<>();
   private final ae f;
   private final boolean g;

   public ma(Path $$0, ae $$1, boolean $$2) {
      this.b = $$0;
      this.c = new md(this.b);
      this.f = $$1;
      this.g = $$2;
   }

   public void a() throws IOException {
      mc $$0 = new mc(this.b, this.d, this.f);
      Stopwatch $$1 = Stopwatch.createStarted();
      Stopwatch $$2 = Stopwatch.createUnstarted();
      this.e.forEach(($$2x, $$3) -> {
         if (!this.g && !$$0.a($$2x)) {
            a.debug("Generator {} already run for version {}", $$2x, this.f.c());
         } else {
            a.info("Starting provider: {}", $$2x);
            $$2.start();
            $$0.a($$0.a($$2x, $$3::a).join());
            $$2.stop();
            a.info("{} finished after {} ms", $$2x, $$2.elapsed(TimeUnit.MILLISECONDS));
            $$2.reset();
         }
      });
      a.info("All providers took: {} ms", $$1.elapsed(TimeUnit.MILLISECONDS));
      $$0.a();
   }

   public ma.a a(boolean $$0) {
      return new ma.a($$0, "vanilla", this.c);
   }

   public ma.a a(boolean $$0, String $$1) {
      Path $$2 = this.c.a(md.b.a).resolve("minecraft").resolve("datapacks").resolve($$1);
      return new ma.a($$0, $$1, new md($$2));
   }

   static {
      ald.a();
   }

   public class a {
      private final boolean b;
      private final String c;
      private final md d;

      a(final boolean $$1, final String $$2, final md $$3) {
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public <T extends mb> T a(mb.a<T> $$0) {
         T $$1 = $$0.create(this.d);
         String $$2 = this.c + "/" + $$1.a();
         if (!ma.this.d.add($$2)) {
            throw new IllegalStateException("Duplicate provider: " + $$2);
         } else {
            if (this.b) {
               ma.this.e.put($$2, $$1);
            }

            return $$1;
         }
      }
   }
}
