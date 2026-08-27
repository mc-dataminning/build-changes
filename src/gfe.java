import com.google.common.util.concurrent.RateLimiter;
import java.time.Duration;
import java.util.concurrent.atomic.AtomicReference;

public class gfe {
   private final float a;
   private final AtomicReference<gfe.a> b = new AtomicReference<>();

   public gfe(Duration $$0) {
      this.a = 1000.0F / (float)$$0.toMillis();
   }

   public void a(eqp $$0, tn $$1) {
      gfe.a $$2 = this.b.updateAndGet($$1x -> $$1x != null && $$1.equals($$1x.a) ? $$1x : new gfe.a($$1, RateLimiter.create((double)this.a)));
      if ($$2.b.tryAcquire(1)) {
         $$0.c($$1);
      }
   }

   static class a {
      final tn a;
      final RateLimiter b;

      a(tn $$0, RateLimiter $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
