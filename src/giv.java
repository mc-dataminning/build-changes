import com.mojang.serialization.Codec;
import java.time.Instant;
import java.util.Optional;
import javax.annotation.Nullable;

public enum giv implements bag {
   a("secure"),
   b("modified"),
   c("not_secure");

   public static final Codec<giv> d = bag.a(giv::values);
   private final String e;

   private giv(final String $$0) {
      this.e = $$0;
   }

   public static giv a(xl $$0, wv $$1, Instant $$2) {
      if (!$$0.i() || $$0.b($$2)) {
         return c;
      } else {
         return a($$0, $$1) ? b : a;
      }
   }

   private static boolean a(xl $$0, wv $$1) {
      if (!$$1.getString().contains($$0.c())) {
         return true;
      } else {
         wv $$2 = $$0.n();
         return $$2 == null ? false : a($$2);
      }
   }

   private static boolean a(wv $$0) {
      return $$0.<Boolean>a(($$0x, $$1) -> a($$0x) ? Optional.of(true) : Optional.empty(), xs.a).orElse(false);
   }

   private static boolean a(xs $$0) {
      return !$$0.l().equals(xs.b);
   }

   public boolean a() {
      return this == c;
   }

   @Nullable
   public fmx a(xl $$0) {
      return switch (this) {
         case b -> fmx.a($$0.c());
         case c -> fmx.c();
         default -> null;
      };
   }

   @Override
   public String c() {
      return this.e;
   }
}
