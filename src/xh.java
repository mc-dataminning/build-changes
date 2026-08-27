import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class xh {
   private static final Logger a = LogUtils.getLogger();

   public static <T extends uo> void a(xf<T> $$0, T $$1, and $$2) throws ahr {
      a($$0, $$1, $$2.o());
   }

   public static <T extends uo> void a(xf<T> $$0, T $$1, biq<?> $$2) throws ahr {
      if (!$$2.bq()) {
         $$2.c(() -> {
            if ($$1.a($$0)) {
               try {
                  $$0.a($$1);
               } catch (Exception var4) {
                  if (var4 instanceof y $$3 && $$3.getCause() instanceof OutOfMemoryError || $$1.d()) {
                     throw var4;
                  }

                  a.error("Failed to handle packet {}, suppressing error", $$0, var4);
               }
            } else {
               a.debug("Ignoring packet due to disconnection: {}", $$0);
            }
         });
         throw ahr.a;
      }
   }
}
