import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class pq implements pp.a {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = ato.b.a() + "/minecraft/structure/";

   @Override
   public uk apply(String $$0, uk $$1) {
      return $$0.startsWith(b) ? a($$0, $$1) : $$1;
   }

   public static uk a(String $$0, uk $$1) {
      epz $$2 = new epz();
      int $$3 = uz.b($$1, 500);
      int $$4 = 4053;
      if ($$3 < 4053) {
         a.warn("SNBT Too old, do not forget to update: {} < {}: {}", new Object[]{$$3, 4053, $$0});
      }

      uk $$5 = bat.f.a(bau.a(), $$1, $$3);
      $$2.a(ly.e, $$5);
      return $$2.a(new uk());
   }
}
