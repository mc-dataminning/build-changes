import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class nu implements nt.a {
   private static final Logger a = LogUtils.getLogger();

   @Override
   public sn apply(String $$0, sn $$1) {
      return $$0.startsWith("data/minecraft/structures/") ? a($$0, $$1) : $$1;
   }

   public static sn a(String $$0, sn $$1) {
      edf $$2 = new edf();
      int $$3 = tc.b($$1, 500);
      int $$4 = 3678;
      if ($$3 < 3678) {
         a.warn("SNBT Too old, do not forget to update: {} < {}: {}", new Object[]{$$3, 3678, $$0});
      }

      sn $$5 = avv.f.a(avw.a(), $$1, $$3);
      $$2.a(kd.e.p(), $$5);
      return $$2.a(new sn());
   }
}
