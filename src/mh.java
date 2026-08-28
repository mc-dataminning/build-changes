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

public class mh {
   private static final Logger a = LogUtils.getLogger();
   private final Path b;
   private final mk c;
   final Set<String> d = new HashSet<>();
   final Map<String, mi> e = new LinkedHashMap<>();
   private final ag f;
   private final boolean g;

   public mh(Path $$0, ag $$1, boolean $$2) {
      this.b = $$0;
      this.c = new mk(this.b);
      this.f = $$1;
      this.g = $$2;
   }

   public void a() throws IOException {
      mj $$0 = new mj(this.b, this.d, this.f);
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

   public mh.a a(boolean $$0) {
      return new mh.a($$0, "vanilla", this.c);
   }

   public mh.a a(boolean $$0, String $$1) {
      Path $$2 = this.c.a(mk.b.a).resolve("minecraft").resolve("datapacks").resolve($$1);
      return new mh.a($$0, $$1, new mk($$2));
   }

   static {
      akw.a();
   }

   public class a {
      private final boolean b;
      private final String c;
      private final mk d;

      a(final boolean $$1, final String $$2, final mk $$3) {
         this.b = $$1;
         this.c = $$2;
         this.d = $$3;
      }

      public <T extends mi> T a(mi.a<T> $$0) {
         T $$1 = $$0.create(this.d);
         String $$2 = this.c + "/" + $$1.a();
         if (!mh.this.d.add($$2)) {
            throw new IllegalStateException("Duplicate provider: " + $$2);
         } else {
            if (this.b) {
               mh.this.e.put($$2, $$1);
            }

            return $$1;
         }
      }
   }
}
