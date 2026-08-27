import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class nq implements np.a {
   private static final Logger a = LogUtils.getLogger();

   @Override
   public sj apply(String $$0, sj $$1) {
      return $$0.startsWith("data/minecraft/structures/") ? a($$0, $$1) : $$1;
   }

   public static sj a(String $$0, sj $$1) {
      eco $$2 = new eco();
      int $$3 = sy.b($$1, 500);
      int $$4 = 3678;
      if ($$3 < 3678) {
         a.warn("SNBT Too old, do not forget to update: {} < {}: {}", new Object[]{$$3, 3678, $$0});
      }

      sj $$5 = avg.f.a(avh.a(), $$1, $$3);
      $$2.a(kb.e.p(), $$5);
      return $$2.a(new sj());
   }
}
