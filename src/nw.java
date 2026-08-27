import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class nw implements nv.a {
   private static final Logger a = LogUtils.getLogger();

   @Override
   public sw apply(String $$0, sw $$1) {
      return $$0.startsWith("data/minecraft/structures/") ? a($$0, $$1) : $$1;
   }

   public static sw a(String $$0, sw $$1) {
      efe $$2 = new efe();
      int $$3 = tl.b($$1, 500);
      int $$4 = 3798;
      if ($$3 < 3798) {
         a.warn("SNBT Too old, do not forget to update: {} < {}: {}", new Object[]{$$3, 3798, $$0});
      }

      sw $$5 = axo.f.a(axp.a(), $$1, $$3);
      $$2.a(kf.e.p(), $$5);
      return $$2.a(new sw());
   }
}
