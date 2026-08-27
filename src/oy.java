import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class oy implements ox.a {
   private static final Logger a = LogUtils.getLogger();

   @Override
   public ua apply(String $$0, ua $$1) {
      return $$0.startsWith("data/minecraft/structures/") ? a($$0, $$1) : $$1;
   }

   public static ua a(String $$0, ua $$1) {
      ekp $$2 = new ekp();
      int $$3 = up.b($$1, 500);
      int $$4 = 3798;
      if ($$3 < 3798) {
         a.warn("SNBT Too old, do not forget to update: {} < {}: {}", new Object[]{$$3, 3798, $$0});
      }

      ua $$5 = azf.f.a(azg.a(), $$1, $$3);
      $$2.a(ld.e.p(), $$5);
      return $$2.a(new ua());
   }
}
