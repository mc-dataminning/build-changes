import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ow implements ov.a {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = ate.b.a() + "/minecraft/structure/";

   @Override
   public tq apply(String $$0, tq $$1) {
      return $$0.startsWith(b) ? a($$0, $$1) : $$1;
   }

   public static tq a(String $$0, tq $$1) {
      ern $$2 = new ern();
      int $$3 = uf.b($$1, 500);
      int $$4 = 4173;
      if ($$3 < 4173) {
         a.warn("SNBT Too old, do not forget to update: {} < {}: {}", new Object[]{$$3, 4173, $$0});
      }

      tq $$5 = ban.f.a(bao.a(), $$1, $$3);
      $$2.a(mb.e, $$5);
      return $$2.a(new tq());
   }
}
