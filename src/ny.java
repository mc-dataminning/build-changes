import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ny implements nx.a {
   private static final Logger a = LogUtils.getLogger();

   @Override
   public sy apply(String $$0, sy $$1) {
      return $$0.startsWith("data/minecraft/structures/") ? a($$0, $$1) : $$1;
   }

   public static sy a(String $$0, sy $$1) {
      egg $$2 = new egg();
      int $$3 = tn.b($$1, 500);
      int $$4 = 3798;
      if ($$3 < 3798) {
         a.warn("SNBT Too old, do not forget to update: {} < {}: {}", new Object[]{$$3, 3798, $$0});
      }

      sy $$5 = axs.f.a(axt.a(), $$1, $$3);
      $$2.a(kh.e.p(), $$5);
      return $$2.a(new sy());
   }
}
