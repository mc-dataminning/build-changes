import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ns implements nr.a {
   private static final Logger a = LogUtils.getLogger();

   @Override
   public sd apply(String $$0, sd $$1) {
      return $$0.startsWith("data/minecraft/structures/") ? a($$0, $$1) : $$1;
   }

   public static sd a(String $$0, sd $$1) {
      ebm $$2 = new ebm();
      int $$3 = ss.b($$1, 500);
      int $$4 = 3678;
      if ($$3 < 3678) {
         a.warn("SNBT Too old, do not forget to update: {} < {}: {}", new Object[]{$$3, 3678, $$0});
      }

      sd $$5 = auw.f.a(auy.a(), $$1, $$3);
      $$2.a(kc.f.p(), $$5);
      return $$2.a(new sd());
   }
}
