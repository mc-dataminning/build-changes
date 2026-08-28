import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class oy implements ox.a {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = ato.b.a() + "/minecraft/structure/";

   @Override
   public tw apply(String $$0, tw $$1) {
      return $$0.startsWith(b) ? a($$0, $$1) : $$1;
   }

   public static tw a(String $$0, tw $$1) {
      eti $$2 = new eti();
      int $$3 = ul.b($$1, 500);
      int $$4 = 4292;
      if ($$3 < 4292) {
         a.warn("SNBT Too old, do not forget to update: {} < {}: {}", new Object[]{$$3, 4292, $$0});
      }

      tw $$5 = bax.f.a(bay.a(), $$1, $$3);
      $$2.a(md.e, $$5);
      return $$2.a(new tw());
   }
}
