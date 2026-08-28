import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class pl implements pk.a {
   private static final Logger a = LogUtils.getLogger();
   private static final String b = ath.b.a() + "/minecraft/structure/";

   @Override
   public uf apply(String $$0, uf $$1) {
      return $$0.startsWith(b) ? a($$0, $$1) : $$1;
   }

   public static uf a(String $$0, uf $$1) {
      epe $$2 = new epe();
      int $$3 = uu.b($$1, 500);
      int $$4 = 4053;
      if ($$3 < 4053) {
         a.warn("SNBT Too old, do not forget to update: {} < {}: {}", new Object[]{$$3, 4053, $$0});
      }

      uf $$5 = bam.f.a(ban.a(), $$1, $$3);
      $$2.a(lu.e.p(), $$5);
      return $$2.a(new uf());
   }
}
