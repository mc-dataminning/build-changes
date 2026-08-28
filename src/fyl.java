import com.mojang.serialization.Codec;
import java.time.Instant;
import java.util.Optional;
import javax.annotation.Nullable;

public enum fyl implements azp {
   a("secure"),
   b("modified"),
   c("not_secure");

   public static final Codec<fyl> d = azp.a(fyl::values);
   private final String e;

   private fyl(final String $$0) {
      this.e = $$0;
   }

   public static fyl a(yb $$0, xl $$1, Instant $$2) {
      if (!$$0.i() || $$0.b($$2)) {
         return c;
      } else {
         return a($$0, $$1) ? b : a;
      }
   }

   private static boolean a(yb $$0, xl $$1) {
      if (!$$1.getString().contains($$0.c())) {
         return true;
      } else {
         xl $$2 = $$0.n();
         return $$2 == null ? false : a($$2);
      }
   }

   private static boolean a(xl $$0) {
      return $$0.<Boolean>a(($$0x, $$1) -> a($$0x) ? Optional.of(true) : Optional.empty(), yi.a).orElse(false);
   }

   private static boolean a(yi $$0) {
      return !$$0.k().equals(yi.b);
   }

   public boolean a() {
      return this == c;
   }

   @Nullable
   public fev a(yb $$0) {
      return switch (this) {
         case b -> fev.a($$0.c());
         case c -> fev.c();
         default -> null;
      };
   }

   @Override
   public String c() {
      return this.e;
   }
}
