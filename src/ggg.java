import com.mojang.serialization.Codec;
import java.time.Instant;
import java.util.Optional;
import javax.annotation.Nullable;

public enum ggg implements bba {
   a("secure"),
   b("modified"),
   c("not_secure");

   public static final Codec<ggg> d = bba.a(ggg::values);
   private final String e;

   private ggg(final String $$0) {
      this.e = $$0;
   }

   public static ggg a(yl $$0, xv $$1, Instant $$2) {
      if (!$$0.i() || $$0.b($$2)) {
         return c;
      } else {
         return a($$0, $$1) ? b : a;
      }
   }

   private static boolean a(yl $$0, xv $$1) {
      if (!$$1.getString().contains($$0.c())) {
         return true;
      } else {
         xv $$2 = $$0.n();
         return $$2 == null ? false : a($$2);
      }
   }

   private static boolean a(xv $$0) {
      return $$0.<Boolean>a(($$0x, $$1) -> a($$0x) ? Optional.of(true) : Optional.empty(), ys.a).orElse(false);
   }

   private static boolean a(ys $$0) {
      return !$$0.k().equals(ys.b);
   }

   public boolean a() {
      return this == c;
   }

   @Nullable
   public fma a(yl $$0) {
      return switch (this) {
         case b -> fma.a($$0.c());
         case c -> fma.c();
         default -> null;
      };
   }

   @Override
   public String c() {
      return this.e;
   }
}
