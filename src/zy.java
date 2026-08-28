import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class zy {
   private static final Logger a = LogUtils.getLogger();

   public static <T extends wu> void a(zv<T> $$0, T $$1, are $$2) throws alq {
      a($$0, $$1, $$2.o());
   }

   public static <T extends wu> void a(zv<T> $$0, T $$1, bpi<?> $$2) throws alq {
      if (!$$2.bw()) {
         $$2.c(() -> {
            if ($$1.a($$0)) {
               try {
                  $$0.a($$1);
               } catch (Exception var4) {
                  if (var4 instanceof y $$3 && $$3.getCause() instanceof OutOfMemoryError) {
                     throw a(var4, $$0, $$1);
                  }

                  $$1.a($$0, var4);
               }
            } else {
               a.debug("Ignoring packet due to disconnection: {}", $$0);
            }
         });
         throw alq.a;
      }
   }

   public static <T extends wu> y a(Exception $$0, zv<T> $$1, T $$2) {
      if ($$0 instanceof y $$3) {
         a($$3.a(), $$2, $$1);
         return $$3;
      } else {
         o $$4 = o.a($$0, "Main thread packet handler");
         a($$4, $$2, $$1);
         return new y($$4);
      }
   }

   private static <T extends wu> void a(o $$0, T $$1, zv<T> $$2) {
      p $$3 = $$0.a("Incoming Packet");
      $$3.a("Type", () -> $$2.a().toString());
      $$3.a("Is Terminal", () -> Boolean.toString($$2.d()));
      $$3.a("Is Skippable", () -> Boolean.toString($$2.c()));
      $$1.a($$0);
   }
}
