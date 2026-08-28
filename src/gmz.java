import com.mojang.serialization.Codec;
import java.time.Instant;
import java.util.Optional;
import javax.annotation.Nullable;

public enum gmz implements bao {
   a("secure"),
   b("modified"),
   c("not_secure");

   public static final Codec<gmz> d = bao.a(gmz::values);
   private final String e;

   private gmz(final String $$0) {
      this.e = $$0;
   }

   public static gmz a(xs $$0, xc $$1, Instant $$2) {
      if (!$$0.i() || $$0.b($$2)) {
         return c;
      } else {
         return a($$0, $$1) ? b : a;
      }
   }

   private static boolean a(xs $$0, xc $$1) {
      if (!$$1.getString().contains($$0.c())) {
         return true;
      } else {
         xc $$2 = $$0.n();
         return $$2 == null ? false : a($$2);
      }
   }

   private static boolean a(xc $$0) {
      return $$0.<Boolean>a(($$0x, $$1) -> a($$0x) ? Optional.of(true) : Optional.empty(), xz.a).orElse(false);
   }

   private static boolean a(xz $$0) {
      return !$$0.l().equals(xz.b);
   }

   public boolean a() {
      return this == c;
   }

   @Nullable
   public fqz a(xs $$0) {
      return switch (this) {
         case b -> fqz.a($$0.c());
         case c -> fqz.c();
         default -> null;
      };
   }

   @Override
   public String c() {
      return this.e;
   }
}
