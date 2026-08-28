import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class pa implements oz.a {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = atr.b.a() + "/minecraft/structure/";

   @Override
   public tz apply(String $$0, tz $$1) {
      return $$0.startsWith(b) ? a($$0, $$1) : $$1;
   }

   public static tz a(String $$0, tz $$1) {
      euv $$2 = new euv();
      int $$3 = uo.b($$1, 500);
      int $$4 = 4292;
      if ($$3 < 4292) {
         a.warn("SNBT Too old, do not forget to update: {} < {}: {}", new Object[]{$$3, 4292, $$0});
      }

      tz $$5 = bbb.f.a(bbc.a(), $$1, $$3);
      $$2.a(mf.e, $$5);
      return $$2.a(new tz());
   }
}
