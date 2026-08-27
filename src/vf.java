import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class vf {
   private static final Logger a = LogUtils.getLogger();

   public static <T extends su> void a(vd<T> $$0, T $$1, akr $$2) throws afi {
      a($$0, $$1, $$2.n());
   }

   public static <T extends su> void a(vd<T> $$0, T $$1, bfo<?> $$2) throws afi {
      if (!$$2.bl()) {
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
         throw afi.a;
      }
   }
}
