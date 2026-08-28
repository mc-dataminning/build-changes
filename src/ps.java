import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ps implements pr.a {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = aty.b.a() + "/minecraft/structure/";

   @Override
   public um apply(String $$0, um $$1) {
      return $$0.startsWith(b) ? a($$0, $$1) : $$1;
   }

   public static um a(String $$0, um $$1) {
      esf $$2 = new esf();
      int $$3 = vb.b($$1, 500);
      int $$4 = 4173;
      if ($$3 < 4173) {
         a.warn("SNBT Too old, do not forget to update: {} < {}: {}", new Object[]{$$3, 4173, $$0});
      }

      um $$5 = bbi.f.a(bbj.a(), $$1, $$3);
      $$2.a(ma.e, $$5);
      return $$2.a(new um());
   }
}
