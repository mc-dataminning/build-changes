import com.mojang.serialization.Codec;
import java.time.Instant;
import java.util.Optional;
import javax.annotation.Nullable;

public enum fzh implements azc {
   a("secure"),
   b("modified"),
   c("not_secure");

   public static final Codec<fzh> d = azc.a(fzh::values);
   private final String e;

   private fzh(final String $$0) {
      this.e = $$0;
   }

   public static fzh a(xk $$0, wu $$1, Instant $$2) {
      if (!$$0.i() || $$0.b($$2)) {
         return c;
      } else {
         return a($$0, $$1) ? b : a;
      }
   }

   private static boolean a(xk $$0, wu $$1) {
      if (!$$1.getString().contains($$0.c())) {
         return true;
      } else {
         wu $$2 = $$0.n();
         return $$2 == null ? false : a($$2);
      }
   }

   private static boolean a(wu $$0) {
      return $$0.<Boolean>a(($$0x, $$1) -> a($$0x) ? Optional.of(true) : Optional.empty(), xr.a).orElse(false);
   }

   private static boolean a(xr $$0) {
      return !$$0.k().equals(xr.b);
   }

   public boolean a() {
      return this == c;
   }

   @Nullable
   public ffr a(xk $$0) {
      return switch (this) {
         case b -> ffr.a($$0.c());
         case c -> ffr.c();
         default -> null;
      };
   }

   @Override
   public String c() {
      return this.e;
   }
}
