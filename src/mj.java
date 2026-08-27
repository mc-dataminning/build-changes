import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class mj implements mi.a {
   private static final Logger a = LogUtils.getLogger();

   @Override
   public qs apply(String $$0, qs $$1) {
      return $$0.startsWith("data/minecraft/structures/") ? a($$0, $$1) : $$1;
   }

   public static qs a(String $$0, qs $$1) {
      dyq $$2 = new dyq();
      int $$3 = re.b($$1, 500);
      int $$4 = 3563;
      if ($$3 < 3563) {
         a.warn("SNBT Too old, do not forget to update: {} < {}: {}", new Object[]{$$3, 3563, $$0});
      }

      qs $$5 = asq.f.a(asr.a(), $$1, $$3);
      $$2.a(jc.f.p(), $$5);
      return $$2.a(new qs());
   }
}
