import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class oo implements on.a {
   private static final Logger a = LogUtils.getLogger();

   @Override
   public to apply(String $$0, to $$1) {
      return $$0.startsWith("data/minecraft/structures/") ? a($$0, $$1) : $$1;
   }

   public static to a(String $$0, to $$1) {
      ejq $$2 = new ejq();
      int $$3 = ud.b($$1, 500);
      int $$4 = 3798;
      if ($$3 < 3798) {
         a.warn("SNBT Too old, do not forget to update: {} < {}: {}", new Object[]{$$3, 3798, $$0});
      }

      to $$5 = ays.f.a(ayt.a(), $$1, $$3);
      $$2.a(kt.e.p(), $$5);
      return $$2.a(new to());
   }
}
