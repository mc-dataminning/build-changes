import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class te implements tr {
   private static final Logger a = LogUtils.getLogger();

   @Override
   public void a(sr $$0) {
      String $$1 = $$0.c().x();
      if ($$0.r()) {
         a.error("{} failed at {}! {}", new Object[]{$$0.b(), $$1, ag.c($$0.n())});
      } else {
         a.warn("(optional) {} failed at {}. {}", new Object[]{$$0.b(), $$1, ag.c($$0.n())});
      }
   }

   @Override
   public void b(sr $$0) {
   }
}
