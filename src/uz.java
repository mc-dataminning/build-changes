import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class uz {
   private static final Logger a = LogUtils.getLogger();

   public static <T extends so> void a(ux<T> $$0, T $$1, akk $$2) throws afc {
      a($$0, $$1, $$2.n());
   }

   public static <T extends so> void a(ux<T> $$0, T $$1, bfg<?> $$2) throws afc {
      if (!$$2.bm()) {
         $$2.c(() -> {
            if ($$1.a($$0)) {
               try {
                  $$0.a($$1);
               } catch (Exception var3) {
                  if ($$1.d()) {
                     throw var3;
                  }

                  a.error("Failed to handle packet {}, suppressing error", $$0, var3);
               }
            } else {
               a.debug("Ignoring packet due to disconnection: {}", $$0);
            }
         });
         throw afc.a;
      }
   }
}
