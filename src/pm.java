import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class pm implements pl.a {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = atj.b.a() + "/minecraft/structure/";

   @Override
   public ug apply(String $$0, ug $$1) {
      return $$0.startsWith(b) ? a($$0, $$1) : $$1;
   }

   public static ug a(String $$0, ug $$1) {
      epi $$2 = new epi();
      int $$3 = uv.b($$1, 500);
      int $$4 = 4053;
      if ($$3 < 4053) {
         a.warn("SNBT Too old, do not forget to update: {} < {}: {}", new Object[]{$$3, 4053, $$0});
      }

      ug $$5 = bao.f.a(bap.a(), $$1, $$3);
      $$2.a(lv.e, $$5);
      return $$2.a(new ug());
   }
}
