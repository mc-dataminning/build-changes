import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class zn {
   private static final Logger a = LogUtils.getLogger();

   public static <T extends wj> void a(zk<T> $$0, T $$1, arg $$2) throws aln {
      a($$0, $$1, $$2.o());
   }

   public static <T extends wj> void a(zk<T> $$0, T $$1, bqa<?> $$2) throws aln {
      if (!$$2.by()) {
         $$2.c(() -> {
            if ($$1.a($$0)) {
               try {
                  $$0.a($$1);
               } catch (Exception var4) {
                  if (var4 instanceof z $$3 && $$3.getCause() instanceof OutOfMemoryError) {
                     throw a(var4, $$0, $$1);
                  }

                  $$1.a($$0, var4);
               }
            } else {
               a.debug("Ignoring packet due to disconnection: {}", $$0);
            }
         });
         throw aln.a;
      }
   }

   public static <T extends wj> z a(Exception $$0, zk<T> $$1, T $$2) {
      if ($$0 instanceof z $$3) {
         a($$3.a(), $$2, $$1);
         return $$3;
      } else {
         o $$4 = o.a($$0, "Main thread packet handler");
         a($$4, $$2, $$1);
         return new z($$4);
      }
   }

   public static <T extends wj> void a(o $$0, T $$1, @Nullable zk<T> $$2) {
      if ($$2 != null) {
         p $$3 = $$0.a("Incoming Packet");
         $$3.a("Type", () -> $$2.a().toString());
         $$3.a("Is Terminal", () -> Boolean.toString($$2.d()));
         $$3.a("Is Skippable", () -> Boolean.toString($$2.c()));
      }

      $$1.a($$0);
   }
}
