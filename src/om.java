import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class om implements ol.a {
   private static final Logger a = LogUtils.getLogger();

   @Override
   public tm apply(String $$0, tm $$1) {
      return $$0.startsWith("data/minecraft/structures/") ? a($$0, $$1) : $$1;
   }

   public static tm a(String $$0, tm $$1) {
      ejh $$2 = new ejh();
      int $$3 = ub.b($$1, 500);
      int $$4 = 3798;
      if ($$3 < 3798) {
         a.warn("SNBT Too old, do not forget to update: {} < {}: {}", new Object[]{$$3, 3798, $$0});
      }

      tm $$5 = ayq.f.a(ayr.a(), $$1, $$3);
      $$2.a(kr.e.p(), $$5);
      return $$2.a(new tm());
   }
}
