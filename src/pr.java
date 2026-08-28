import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class pr implements pq.a {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = atq.b.a() + "/minecraft/structure/";

   @Override
   public ul apply(String $$0, ul $$1) {
      return $$0.startsWith(b) ? a($$0, $$1) : $$1;
   }

   public static ul a(String $$0, ul $$1) {
      eqk $$2 = new eqk();
      int $$3 = va.b($$1, 500);
      int $$4 = 4053;
      if ($$3 < 4053) {
         a.warn("SNBT Too old, do not forget to update: {} < {}: {}", new Object[]{$$3, 4053, $$0});
      }

      ul $$5 = baw.f.a(bax.a(), $$1, $$3);
      $$2.a(lz.e, $$5);
      return $$2.a(new ul());
   }
}
