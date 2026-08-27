import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class pd implements pc.a {
   private static final Logger a = LogUtils.getLogger();

   @Override
   public uk apply(String $$0, uk $$1) {
      return $$0.startsWith("data/minecraft/structures/") ? a($$0, $$1) : $$1;
   }

   public static uk a(String $$0, uk $$1) {
      ent $$2 = new ent();
      int $$3 = uz.b($$1, 500);
      int $$4 = 3798;
      if ($$3 < 3798) {
         a.warn("SNBT Too old, do not forget to update: {} < {}: {}", new Object[]{$$3, 3798, $$0});
      }

      uk $$5 = azs.f.a(azt.a(), $$1, $$3);
      $$2.a(lh.e.p(), $$5);
      return $$2.a(new uk());
   }
}
