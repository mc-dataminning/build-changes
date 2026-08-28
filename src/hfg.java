import com.google.common.util.concurrent.RateLimiter;
import java.time.Duration;
import java.util.concurrent.atomic.AtomicReference;

public class hfg {
   private final float a;
   private final AtomicReference<hfg.a> b = new AtomicReference<>();

   public hfg(Duration $$0) {
      this.a = 1000.0F / (float)$$0.toMillis();
   }

   public void a(fjo $$0, xl $$1) {
      hfg.a $$2 = this.b.updateAndGet($$1x -> $$1x != null && $$1.equals($$1x.a) ? $$1x : new hfg.a($$1, RateLimiter.create((double)this.a)));
      if ($$2.b.tryAcquire(1)) {
         $$0.c($$1);
      }
   }

   static class a {
      final xl a;
      final RateLimiter b;

      a(xl $$0, RateLimiter $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
