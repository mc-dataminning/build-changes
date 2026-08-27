import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class mo implements mn.a {
   private static final Logger a = LogUtils.getLogger();

   @Override
   public qy apply(String $$0, qy $$1) {
      return $$0.startsWith("data/minecraft/structures/") ? a($$0, $$1) : $$1;
   }

   public static qy a(String $$0, qy $$1) {
      dzd $$2 = new dzd();
      int $$3 = rl.b($$1, 500);
      int $$4 = 3563;
      if ($$3 < 3563) {
         a.warn("SNBT Too old, do not forget to update: {} < {}: {}", new Object[]{$$3, 3563, $$0});
      }

      qy $$5 = atc.f.a(atd.a(), $$1, $$3);
      $$2.a(jd.f.p(), $$5);
      return $$2.a(new qy());
   }
}
