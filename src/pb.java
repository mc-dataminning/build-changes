import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class pb implements pa.a {
   private static final Logger a = LogUtils.getLogger();

   @Override
   public ud apply(String $$0, ud $$1) {
      return $$0.startsWith("data/minecraft/structures/") ? a($$0, $$1) : $$1;
   }

   public static ud a(String $$0, ud $$1) {
      elj $$2 = new elj();
      int $$3 = us.b($$1, 500);
      int $$4 = 3798;
      if ($$3 < 3798) {
         a.warn("SNBT Too old, do not forget to update: {} < {}: {}", new Object[]{$$3, 3798, $$0});
      }

      ud $$5 = azj.f.a(azk.a(), $$1, $$3);
      $$2.a(le.e.p(), $$5);
      return $$2.a(new ud());
   }
}
