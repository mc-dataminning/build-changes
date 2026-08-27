import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class sc implements sp {
   private static final Logger a = LogUtils.getLogger();

   @Override
   public void a(rs $$0) {
      String $$1 = $$0.c().x();
      if ($$0.q()) {
         a.error("{} failed at {}! {}", new Object[]{$$0.b(), $$1, ac.c($$0.m())});
      } else {
         a.warn("(optional) {} failed at {}. {}", new Object[]{$$0.b(), $$1, ac.c($$0.m())});
      }
   }

   @Override
   public void b(rs $$0) {
   }
}
