import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class zc {
   private static final Logger a = LogUtils.getLogger();

   public static <T extends vy> void a(yz<T> $$0, T $$1, aqe $$2) throws akq {
      a($$0, $$1, $$2.o());
   }

   public static <T extends vy> void a(yz<T> $$0, T $$1, bng<?> $$2) throws akq {
      if (!$$2.bv()) {
         $$2.c(() -> {
            if ($$1.a($$0)) {
               try {
                  $$0.a($$1);
               } catch (Exception var6) {
                  if (var6 instanceof y $$3 && $$3.getCause() instanceof OutOfMemoryError || $$1.d()) {
                     if (var6 instanceof y $$4) {
                        $$1.a($$4.a());
                        throw var6;
                     }

                     o $$5 = o.a(var6, "Main thread packet handler");
                     $$1.a($$5);
                     throw new y($$5);
                  }

                  a.error("Failed to handle packet {}, suppressing error", $$0, var6);
               }
            } else {
               a.debug("Ignoring packet due to disconnection: {}", $$0);
            }
         });
         throw akq.a;
      }
   }
}
