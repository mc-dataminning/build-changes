import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ml implements mk.a {
   private static final Logger a = LogUtils.getLogger();

   @Override
   public qu apply(String $$0, qu $$1) {
      return $$0.startsWith("data/minecraft/structures/") ? a($$0, $$1) : $$1;
   }

   public static qu a(String $$0, qu $$1) {
      dyw $$2 = new dyw();
      int $$3 = rg.b($$1, 500);
      int $$4 = 3563;
      if ($$3 < 3563) {
         a.warn("SNBT Too old, do not forget to update: {} < {}: {}", new Object[]{$$3, 3563, $$0});
      }

      qu $$5 = asv.f.a(asw.a(), $$1, $$3);
      $$2.a(jd.f.p(), $$5);
      return $$2.a(new qu());
   }
}
