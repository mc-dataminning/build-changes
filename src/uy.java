import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class uy {
   private static final Logger a = LogUtils.getLogger();

   public static <T extends sn> void a(uw<T> $$0, T $$1, aki $$2) throws afa {
      a($$0, $$1, $$2.n());
   }

   public static <T extends sn> void a(uw<T> $$0, T $$1, bfe<?> $$2) throws afa {
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
         throw afa.a;
      }
   }
}
