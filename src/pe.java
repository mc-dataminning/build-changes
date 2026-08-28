import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class pe implements pd.a {
   private static final Logger a = LogUtils.getLogger();

   @Override
   public tx apply(String $$0, tx $$1) {
      return $$0.startsWith("data/minecraft/structures/") ? a($$0, $$1) : $$1;
   }

   public static tx a(String $$0, tx $$1) {
      emq $$2 = new emq();
      int $$3 = um.b($$1, 500);
      int $$4 = 3937;
      if ($$3 < 3937) {
         a.warn("SNBT Too old, do not forget to update: {} < {}: {}", new Object[]{$$3, 3937, $$0});
      }

      tx $$5 = azl.f.a(azm.a(), $$1, $$3);
      $$2.a(lq.e.q(), $$5);
      return $$2.a(new tx());
   }
}
