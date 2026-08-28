import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class pi implements ph.a {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = ass.b.a() + "/minecraft/structure/";

   @Override
   public ub apply(String $$0, ub $$1) {
      return $$0.startsWith(b) ? a($$0, $$1) : $$1;
   }

   public static ub a(String $$0, ub $$1) {
      enr $$2 = new enr();
      int $$3 = uq.b($$1, 500);
      int $$4 = 3937;
      if ($$3 < 3937) {
         a.warn("SNBT Too old, do not forget to update: {} < {}: {}", new Object[]{$$3, 3937, $$0});
      }

      ub $$5 = azw.f.a(azx.a(), $$1, $$3);
      $$2.a(lt.e.q(), $$5);
      return $$2.a(new ub());
   }
}
