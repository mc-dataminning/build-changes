import com.mojang.serialization.Codec;
import java.time.Instant;
import java.util.Optional;
import javax.annotation.Nullable;

public enum gai implements azg {
   a("secure"),
   b("modified"),
   c("not_secure");

   public static final Codec<gai> d = azg.a(gai::values);
   private final String e;

   private gai(String $$0) {
      this.e = $$0;
   }

   public static gai a(xu $$0, xe $$1, Instant $$2) {
      if (!$$0.i() || $$0.b($$2)) {
         return c;
      } else {
         return a($$0, $$1) ? b : a;
      }
   }

   private static boolean a(xu $$0, xe $$1) {
      if (!$$1.getString().contains($$0.c())) {
         return true;
      } else {
         xe $$2 = $$0.n();
         return $$2 == null ? false : a($$2);
      }
   }

   private static boolean a(xe $$0) {
      return $$0.<Boolean>a(($$0x, $$1) -> a($$0x) ? Optional.of(true) : Optional.empty(), yb.a).orElse(false);
   }

   private static boolean a(yb $$0) {
      return !$$0.k().equals(yb.b);
   }

   public boolean a() {
      return this == c;
   }

   @Nullable
   public fge a(xu $$0) {
      return switch (this) {
         case b -> fge.a($$0.c());
         case c -> fge.c();
         default -> null;
      };
   }

   @Override
   public String c() {
      return this.e;
   }
}
