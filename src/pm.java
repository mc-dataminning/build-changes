import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class pm implements pl.a {
   private static final Logger a = LogUtils.getLogger();

   @Override
   public us apply(String $$0, us $$1) {
      return $$0.startsWith("data/minecraft/structures/") ? a($$0, $$1) : $$1;
   }

   public static us a(String $$0, us $$1) {
      eml $$2 = new eml();
      int $$3 = vh.b($$1, 500);
      int $$4 = 3798;
      if ($$3 < 3798) {
         a.warn("SNBT Too old, do not forget to update: {} < {}: {}", new Object[]{$$3, 3798, $$0});
      }

      us $$5 = bag.f.a(bah.a(), $$1, $$3);
      $$2.a(lp.e.p(), $$5);
      return $$2.a(new us());
   }
}
