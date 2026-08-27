import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class uq {
   private static final Logger a = LogUtils.getLogger();

   public static <T extends sk> void a(uo<T> $$0, T $$1, aif $$2) throws adb {
      a($$0, $$1, $$2.n());
   }

   public static <T extends sk> void a(uo<T> $$0, T $$1, bcn<?> $$2) throws adb {
      if (!$$2.bl()) {
         $$2.c(() -> {
            if ($$1.a()) {
               try {
                  $$0.a($$1);
               } catch (Exception var3) {
                  if ($$1.b()) {
                     throw var3;
                  }

                  a.error("Failed to handle packet {}, suppressing error", $$0, var3);
               }
            } else {
               a.debug("Ignoring packet due to disconnection: {}", $$0);
            }
         });
         throw adb.a;
      }
   }
}
