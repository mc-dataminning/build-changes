import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class uc implements up {
   private static final Logger a = LogUtils.getLogger();

   @Override
   public void a(ts $$0) {
      String $$1 = $$0.d().x();
      if ($$0.r()) {
         a.error("{} failed at {}! {}", new Object[]{$$0.b(), $$1, ae.c($$0.n())});
      } else {
         a.warn("(optional) {} failed at {}. {}", new Object[]{$$0.b(), $$1, ae.c($$0.n())});
      }
   }

   @Override
   public void b(ts $$0) {
   }
}
