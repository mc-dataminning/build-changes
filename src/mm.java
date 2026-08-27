import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class mm implements ml.a {
   private static final Logger a = LogUtils.getLogger();

   @Override
   public qw apply(String $$0, qw $$1) {
      return $$0.startsWith("data/minecraft/structures/") ? a($$0, $$1) : $$1;
   }

   public static qw a(String $$0, qw $$1) {
      dyv $$2 = new dyv();
      int $$3 = rj.b($$1, 500);
      int $$4 = 3678;
      if ($$3 < 3678) {
         a.warn("SNBT Too old, do not forget to update: {} < {}: {}", new Object[]{$$3, 3678, $$0});
      }

      qw $$5 = atg.f.a(ath.a(), $$1, $$3);
      $$2.a(jb.f.p(), $$5);
      return $$2.a(new qw());
   }
}
