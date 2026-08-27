import com.google.common.util.concurrent.RateLimiter;
import java.time.Duration;
import java.util.concurrent.atomic.AtomicReference;

public class gmx {
   private final float a;
   private final AtomicReference<gmx.a> b = new AtomicReference<>();

   public gmx(Duration $$0) {
      this.a = 1000.0F / (float)$$0.toMillis();
   }

   public void a(ewz $$0, vq $$1) {
      gmx.a $$2 = this.b.updateAndGet($$1x -> $$1x != null && $$1.equals($$1x.a) ? $$1x : new gmx.a($$1, RateLimiter.create((double)this.a)));
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
