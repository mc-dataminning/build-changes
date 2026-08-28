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

public class mg {
   private static final Logger a = LogUtils.getLogger();
   private final Path b;
   private final mj c;
   final Set<String> d = new HashSet<>();
   final Map<String, mh> e = new LinkedHashMap<>();
   private final af f;
   private final boolean g;

   public mg(Path $$0, af $$1, boolean $$2) {
      this.b = $$0;
      this.c = new mj(this.b);
      this.f = $$1;
      this.g = $$2;
   }

   public void a() throws IOException {
      mi $$0 = new mi(this.b, this.d, this.f);
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

   public mg.a a(boolean $$0) {
      return new mg.a($$0, "vanilla", this.c);
   }

   public mg.a a(boolean $$0, String $$1) {
      Path $$2 = this.c.a(mj.b.a).resolve("minecraft").resolve("datapacks").resolve($$1);
      return new mg.a($$0, $$1, new mj($$2));
   }

   static {
      alr.a();
   }

   public class a {
      private final boolean b;
      private final String c;
      private final mj d;

      a(final boolean $$1, final String $$2, final mj $$3) {
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public <T extends mh> T a(mh.a<T> $$0) {
         T $$1 = $$0.create(this.d);
         String $$2 = this.c + "/" + $$1.a();
         if (!mg.this.d.add($$2)) {
            throw new IllegalStateException("Duplicate provider: " + $$2);
         } else {
            if (this.b) {
               mg.this.e.put($$2, $$1);
            }

            return $$1;
         }
      }
   }
}
