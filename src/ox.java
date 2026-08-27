import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ox implements ow.a {
   private static final Logger a = LogUtils.getLogger();

   @Override
   public ty apply(String $$0, ty $$1) {
      return $$0.startsWith("data/minecraft/structures/") ? a($$0, $$1) : $$1;
   }

   public static ty a(String $$0, ty $$1) {
      ekg $$2 = new ekg();
      int $$3 = un.b($$1, 500);
      int $$4 = 3798;
      if ($$3 < 3798) {
         a.warn("SNBT Too old, do not forget to update: {} < {}: {}", new Object[]{$$3, 3798, $$0});
      }

      ty $$5 = azc.f.a(azd.a(), $$1, $$3);
      $$2.a(lc.e.p(), $$5);
      return $$2.a(new ty());
   }
}
