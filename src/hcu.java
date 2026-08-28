import com.google.common.util.concurrent.RateLimiter;
import java.time.Duration;
import java.util.concurrent.atomic.AtomicReference;

public class hcu {
   private final float a;
   private final AtomicReference<hcu.a> b = new AtomicReference<>();

   public hcu(Duration $$0) {
      this.a = 1000.0F / (float)$$0.toMillis();
   }

   public void a(fhs $$0, xd $$1) {
      hcu.a $$2 = this.b.updateAndGet($$1x -> $$1x != null && $$1.equals($$1x.a) ? $$1x : new hcu.a($$1, RateLimiter.create((double)this.a)));
      if ($$2.b.tryAcquire(1)) {
         $$0.c($$1);
      }
   }

   static class a {
      final xd a;
      final RateLimiter b;

      a(xd $$0, RateLimiter $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
