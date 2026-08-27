import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class rj implements rs {
   private static final Logger a = LogUtils.getLogger();

   @Override
   public void a(qz $$0) {
      if ($$0.r()) {
         a.error("{} failed! {}", $$0.c(), ac.c($$0.n()));
      } else {
         a.warn("(optional) {} failed. {}", $$0.c(), ac.c($$0.n()));
      }
   }

   @Override
   public void b(qz $$0) {
   }
}
