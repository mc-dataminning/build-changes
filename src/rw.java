import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class rw implements se {
   private static final Logger a = LogUtils.getLogger();

   @Override
   public void a(rm $$0) {
      String $$1 = $$0.d().x();
      if ($$0.s()) {
         a.error("{} failed at {}! {}", new Object[]{$$0.c(), $$1, ac.c($$0.o())});
      } else {
         a.warn("(optional) {} failed at {}. {}", new Object[]{$$0.c(), $$1, ac.c($$0.o())});
      }
   }

   @Override
   public void b(rm $$0) {
   }
}
