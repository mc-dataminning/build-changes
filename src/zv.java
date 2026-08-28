import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class zv {
   private static final Logger a = LogUtils.getLogger();

   public static <T extends wr> void a(zs<T> $$0, T $$1, arb $$2) throws aln {
      a($$0, $$1, $$2.o());
   }

   public static <T extends wr> void a(zs<T> $$0, T $$1, bpf<?> $$2) throws aln {
      if (!$$2.bw()) {
         $$2.c(() -> {
            if ($$1.a($$0)) {
               try {
                  $$0.a($$1);
               } catch (Exception var6) {
                  if (var6 instanceof y $$3 && $$3.getCause() instanceof OutOfMemoryError || $$1.d()) {
                     if (var6 instanceof y $$4) {
                        a($$4.a(), $$1, $$0);
                        throw var6;
                     }

                     o $$5 = o.a(var6, "Main thread packet handler");
                     a($$5, $$1, $$0);
                     throw new y($$5);
                  }

                  a.error("Failed to handle packet {}, suppressing error", $$0, var6);
               }
            } else {
               a.debug("Ignoring packet due to disconnection: {}", $$0);
            }
         });
         throw aln.a;
      }
   }

   private static <T extends wr> void a(o $$0, T $$1, zs<T> $$2) {
      p $$3 = $$0.a("Incoming Packet");
      $$3.a("Type", () -> $$2.a().toString());
      $$3.a("Is Terminal", () -> Boolean.toString($$2.d()));
      $$3.a("Is Skippable", () -> Boolean.toString($$2.c()));
      $$1.a($$0);
   }
}
