import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class qi implements qr {
   private static final Logger a = LogUtils.getLogger();

   @Override
   public void a(py $$0) {
      if ($$0.r()) {
         a.error("{} failed! {}", $$0.c(), ac.c($$0.n()));
      } else {
         a.warn("(optional) {} failed. {}", $$0.c(), ac.c($$0.n()));
      }
   }

   @Override
   public void b(py $$0) {
   }
}
