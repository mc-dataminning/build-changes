import com.mojang.serialization.Codec;
import java.time.Instant;
import java.util.Optional;
import javax.annotation.Nullable;

public enum fys implements azu {
   a("secure"),
   b("modified"),
   c("not_secure");

   public static final Codec<fys> d = azu.a(fys::values);
   private final String e;

   private fys(final String $$0) {
      this.e = $$0;
   }

   public static fys a(yf $$0, xp $$1, Instant $$2) {
      if (!$$0.i() || $$0.b($$2)) {
         return c;
      } else {
         return a($$0, $$1) ? b : a;
      }
   }

   private static boolean a(yf $$0, xp $$1) {
      if (!$$1.getString().contains($$0.c())) {
         return true;
      } else {
         xp $$2 = $$0.n();
         return $$2 == null ? false : a($$2);
      }
   }

   private static boolean a(xp $$0) {
      return $$0.<Boolean>a(($$0x, $$1) -> a($$0x) ? Optional.of(true) : Optional.empty(), ym.a).orElse(false);
   }

   private static boolean a(ym $$0) {
      return !$$0.k().equals(ym.b);
   }

   public boolean a() {
      return this == c;
   }

   @Nullable
   public ffc a(yf $$0) {
      return switch (this) {
         case b -> ffc.a($$0.c());
         case c -> ffc.c();
         default -> null;
      };
   }

   @Override
   public String c() {
      return this.e;
   }
}
