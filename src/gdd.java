import com.mojang.serialization.Codec;
import java.time.Instant;
import java.util.Optional;
import javax.annotation.Nullable;

public enum gdd implements bag {
   a("secure"),
   b("modified"),
   c("not_secure");

   public static final Codec<gdd> d = bag.a(gdd::values);
   private final String e;

   private gdd(final String $$0) {
      this.e = $$0;
   }

   public static gdd a(xy $$0, xi $$1, Instant $$2) {
      if (!$$0.i() || $$0.b($$2)) {
         return c;
      } else {
         return a($$0, $$1) ? b : a;
      }
   }

   private static boolean a(xy $$0, xi $$1) {
      if (!$$1.getString().contains($$0.c())) {
         return true;
      } else {
         xi $$2 = $$0.n();
         return $$2 == null ? false : a($$2);
      }
   }

   private static boolean a(xi $$0) {
      return $$0.<Boolean>a(($$0x, $$1) -> a($$0x) ? Optional.of(true) : Optional.empty(), yf.a).orElse(false);
   }

   private static boolean a(yf $$0) {
      return !$$0.k().equals(yf.b);
   }

   public boolean a() {
      return this == c;
   }

   @Nullable
   public fjc a(xy $$0) {
      return switch (this) {
         case b -> fjc.a($$0.c());
         case c -> fjc.c();
         default -> null;
      };
   }

   @Override
   public String c() {
      return this.e;
   }
}
