import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ps implements pr.a {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = atr.b.a() + "/minecraft/structure/";

   @Override
   public un apply(String $$0, un $$1) {
      return $$0.startsWith(b) ? a($$0, $$1) : $$1;
   }

   public static un a(String $$0, un $$1) {
      eqd $$2 = new eqd();
      int $$3 = vc.b($$1, 500);
      int $$4 = 4053;
      if ($$3 < 4053) {
         a.warn("SNBT Too old, do not forget to update: {} < {}: {}", new Object[]{$$3, 4053, $$0});
      }

      un $$5 = bax.f.a(bay.a(), $$1, $$3);
      $$2.a(lz.e, $$5);
      return $$2.a(new un());
   }
}
