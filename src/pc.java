import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class pc implements pb.a {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = atv.b.a() + "/minecraft/structure/";

   @Override
   public ua apply(String $$0, ua $$1) {
      return $$0.startsWith(b) ? a($$0, $$1) : $$1;
   }

   public static ua a(String $$0, ua $$1) {
      ewf $$2 = new ewf();
      int $$3 = up.b($$1, 500);
      int $$4 = 4292;
      if ($$3 < 4292) {
         a.warn("SNBT Too old, do not forget to update: {} < {}: {}", new Object[]{$$3, 4292, $$0});
      }

      ua $$5 = bbf.f.a(bbg.a(), $$1, $$3);
      $$2.a(mh.e, $$5);
      return $$2.a(new ua());
   }
}
