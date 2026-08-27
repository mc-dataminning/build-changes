import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class oa implements nz.a {
   private static final Logger a = LogUtils.getLogger();

   @Override
   public ta apply(String $$0, ta $$1) {
      return $$0.startsWith("data/minecraft/structures/") ? a($$0, $$1) : $$1;
   }

   public static ta a(String $$0, ta $$1) {
      ehe $$2 = new ehe();
      int $$3 = tp.b($$1, 500);
      int $$4 = 3798;
      if ($$3 < 3798) {
         a.warn("SNBT Too old, do not forget to update: {} < {}: {}", new Object[]{$$3, 3798, $$0});
      }

      ta $$5 = ayc.f.a(ayd.a(), $$1, $$3);
      $$2.a(ki.e.p(), $$5);
      return $$2.a(new ta());
   }
}
