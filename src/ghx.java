import com.google.common.util.concurrent.RateLimiter;
import java.time.Duration;
import java.util.concurrent.atomic.AtomicReference;

public class ghx {
   private final float a;
   private final AtomicReference<ghx.a> b = new AtomicReference<>();

   public ghx(Duration $$0) {
      this.a = 1000.0F / (float)$$0.toMillis();
   }

   public void a(eta $$0, uv $$1) {
      ghx.a $$2 = this.b.updateAndGet($$1x -> $$1x != null && $$1.equals($$1x.a) ? $$1x : new ghx.a($$1, RateLimiter.create((double)this.a)));
      if ($$2.b.tryAcquire(1)) {
         $$0.c($$1);
      }
   }

   static class a {
      final uv a;
      final RateLimiter b;

      a(uv $$0, RateLimiter $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
