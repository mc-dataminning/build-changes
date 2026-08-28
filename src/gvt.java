import com.google.common.util.concurrent.RateLimiter;
import java.time.Duration;
import java.util.concurrent.atomic.AtomicReference;

public class gvt {
   private final float a;
   private final AtomicReference<gvt.a> b = new AtomicReference<>();

   public gvt(Duration $$0) {
      this.a = 1000.0F / (float)$$0.toMillis();
   }

   public void a(ffl $$0, wu $$1) {
      gvt.a $$2 = this.b.updateAndGet($$1x -> $$1x != null && $$1.equals($$1x.a) ? $$1x : new gvt.a($$1, RateLimiter.create((double)this.a)));
      if ($$2.b.tryAcquire(1)) {
         $$0.c($$1);
      }
   }

   static class a {
      final wu a;
      final RateLimiter b;

      a(wu $$0, RateLimiter $$1) {
         this.a = $$0;
         this.b = $$1;
      }
   }
}
