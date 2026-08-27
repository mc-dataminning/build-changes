import com.google.common.util.concurrent.RateLimiter;
import java.time.Duration;
import java.util.concurrent.atomic.AtomicReference;

public class gne {
   private final float a;
   private final AtomicReference<gne.a> b = new AtomicReference<>();

   public gne(Duration $$0) {
      this.a = 1000.0F / (float)$$0.toMillis();
   }

   public void a(exg $$0, vq $$1) {
      gne.a $$2 = this.b.updateAndGet($$1x -> $$1x != null && $$1.equals($$1x.a) ? $$1x : new gne.a($$1, RateLimiter.create((double)this.a)));
      if ($$2.b.tryAcquire(1)) {
         $$0.c($$1);
      }
   }

   static class a {
      final vq a;
      final RateLimiter b;

      a(vq $$0, RateLimiter $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
