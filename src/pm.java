import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class pm implements pl.a {
   private static final Logger a = LogUtils.getLogger();

   @Override
   public ur apply(String $$0, ur $$1) {
      return $$0.startsWith("data/minecraft/structures/") ? a($$0, $$1) : $$1;
   }

   public static ur a(String $$0, ur $$1) {
      emj $$2 = new emj();
      int $$3 = vg.b($$1, 500);
      int $$4 = 3798;
      if ($$3 < 3798) {
         a.warn("SNBT Too old, do not forget to update: {} < {}: {}", new Object[]{$$3, 3798, $$0});
      }

      ur $$5 = baf.f.a(bag.a(), $$1, $$3);
      $$2.a(lp.e.p(), $$5);
      return $$2.a(new ur());
   }
}
