import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class nj implements ni.a {
   private static final Logger a = LogUtils.getLogger();

   @Override
   public rt apply(String $$0, rt $$1) {
      return $$0.startsWith("data/minecraft/structures/") ? a($$0, $$1) : $$1;
   }

   public static rt a(String $$0, rt $$1) {
      dzt $$2 = new dzt();
      int $$3 = sg.b($$1, 500);
      int $$4 = 3678;
      if ($$3 < 3678) {
         a.warn("SNBT Too old, do not forget to update: {} < {}: {}", new Object[]{$$3, 3678, $$0});
      }

      rt $$5 = aud.f.a(aue.a(), $$1, $$3);
      $$2.a(jy.f.p(), $$5);
      return $$2.a(new rt());
   }
}
