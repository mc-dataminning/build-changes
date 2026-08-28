import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class zz {
   private static final Logger a = LogUtils.getLogger();

   public static <T extends wv> void a(zw<T> $$0, T $$1, arf $$2) throws alr {
      a($$0, $$1, $$2.o());
   }

   public static <T extends wv> void a(zw<T> $$0, T $$1, bpl<?> $$2) throws alr {
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
         throw alr.a;
      }
   }

   public static <T extends wv> y a(Exception $$0, zw<T> $$1, T $$2) {
      if ($$0 instanceof y $$3) {
         a($$3.a(), $$2, $$1);
         return $$3;
      } else {
         o $$4 = o.a($$0, "Main thread packet handler");
         a($$4, $$2, $$1);
         return new y($$4);
      }
   }

   private static <T extends wv> void a(o $$0, T $$1, zw<T> $$2) {
      p $$3 = $$0.a("Incoming Packet");
      $$3.a("Type", () -> $$2.a().toString());
      $$3.a("Is Terminal", () -> Boolean.toString($$2.d()));
      $$3.a("Is Skippable", () -> Boolean.toString($$2.c()));
      $$1.a($$0);
   }
}
