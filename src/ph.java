import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ph implements pg.a {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = asr.b.a() + "/minecraft/structure/";

   @Override
   public ua apply(String $$0, ua $$1) {
      return $$0.startsWith(b) ? a($$0, $$1) : $$1;
   }

   public static ua a(String $$0, ua $$1) {
      enn $$2 = new enn();
      int $$3 = up.b($$1, 500);
      int $$4 = 3937;
      if ($$3 < 3937) {
         a.warn("SNBT Too old, do not forget to update: {} < {}: {}", new Object[]{$$3, 3937, $$0});
      }

      ua $$5 = azv.f.a(azw.a(), $$1, $$3);
      $$2.a(lt.e.q(), $$5);
      return $$2.a(new ua());
   }
}
