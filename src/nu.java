import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class nu implements nt.a {
   private static final Logger a = LogUtils.getLogger();

   @Override
   public so apply(String $$0, so $$1) {
      return $$0.startsWith("data/minecraft/structures/") ? a($$0, $$1) : $$1;
   }

   public static so a(String $$0, so $$1) {
      edo $$2 = new edo();
      int $$3 = td.b($$1, 500);
      int $$4 = 3798;
      if ($$3 < 3798) {
         a.warn("SNBT Too old, do not forget to update: {} < {}: {}", new Object[]{$$3, 3798, $$0});
      }

      so $$5 = avx.f.a(avy.a(), $$1, $$3);
      $$2.a(kd.e.p(), $$5);
      return $$2.a(new so());
   }
}
