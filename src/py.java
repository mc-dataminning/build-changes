import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class py implements px.a {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = aui.b.a() + "/minecraft/structure/";

   @Override
   public ux apply(String $$0, ux $$1) {
      return $$0.startsWith(b) ? a($$0, $$1) : $$1;
   }

   public static ux a(String $$0, ux $$1) {
      ese $$2 = new ese();
      int $$3 = vm.b($$1, 500);
      int $$4 = 4053;
      if ($$3 < 4053) {
         a.warn("SNBT Too old, do not forget to update: {} < {}: {}", new Object[]{$$3, 4053, $$0});
      }

      ux $$5 = bbo.f.a(bbp.a(), $$1, $$3);
      $$2.a(ma.e, $$5);
      return $$2.a(new ux());
   }
}
