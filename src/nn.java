import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class nn implements nm.a {
   private static final Logger a = LogUtils.getLogger();

   @Override
   public rz apply(String $$0, rz $$1) {
      return $$0.startsWith("data/minecraft/structures/") ? a($$0, $$1) : $$1;
   }

   public static rz a(String $$0, rz $$1) {
      eav $$2 = new eav();
      int $$3 = so.b($$1, 500);
      int $$4 = 3678;
      if ($$3 < 3678) {
         a.warn("SNBT Too old, do not forget to update: {} < {}: {}", new Object[]{$$3, 3678, $$0});
      }

      rz $$5 = aun.f.a(auo.a(), $$1, $$3);
      $$2.a(jy.f.p(), $$5);
      return $$2.a(new rz());
   }
}
