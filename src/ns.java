import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ns implements nr.a {
   private static final Logger a = LogUtils.getLogger();

   @Override
   public sl apply(String $$0, sl $$1) {
      return $$0.startsWith("data/minecraft/structures/") ? a($$0, $$1) : $$1;
   }

   public static sl a(String $$0, sl $$1) {
      ecz $$2 = new ecz();
      int $$3 = ta.b($$1, 500);
      int $$4 = 3678;
      if ($$3 < 3678) {
         a.warn("SNBT Too old, do not forget to update: {} < {}: {}", new Object[]{$$3, 3678, $$0});
      }

      sl $$5 = avq.f.a(avr.a(), $$1, $$3);
      $$2.a(kd.e.p(), $$5);
      return $$2.a(new sl());
   }
}
