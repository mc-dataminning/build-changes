import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class pa implements oz.a {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = atp.b.a() + "/minecraft/structure/";

   @Override
   public tx apply(String $$0, tx $$1) {
      return $$0.startsWith(b) ? a($$0, $$1) : $$1;
   }

   public static tx a(String $$0, tx $$1) {
      euk $$2 = new euk();
      int $$3 = um.b($$1, 500);
      int $$4 = 4292;
      if ($$3 < 4292) {
         a.warn("SNBT Too old, do not forget to update: {} < {}: {}", new Object[]{$$3, 4292, $$0});
      }

      tx $$5 = baz.f.a(bba.a(), $$1, $$3);
      $$2.a(mf.e, $$5);
      return $$2.a(new tx());
   }
}
