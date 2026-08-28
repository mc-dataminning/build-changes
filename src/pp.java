import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class pp implements po.a {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = atn.b.a() + "/minecraft/structure/";

   @Override
   public uj apply(String $$0, uj $$1) {
      return $$0.startsWith(b) ? a($$0, $$1) : $$1;
   }

   public static uj a(String $$0, uj $$1) {
      ept $$2 = new ept();
      int $$3 = uy.b($$1, 500);
      int $$4 = 4053;
      if ($$3 < 4053) {
         a.warn("SNBT Too old, do not forget to update: {} < {}: {}", new Object[]{$$3, 4053, $$0});
      }

      uj $$5 = bas.f.a(bat.a(), $$1, $$3);
      $$2.a(lx.e, $$5);
      return $$2.a(new uj());
   }
}
