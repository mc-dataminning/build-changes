import com.mojang.serialization.Codec;
import java.time.Instant;
import java.util.Optional;
import javax.annotation.Nullable;

public enum gcc implements azz {
   a("secure"),
   b("modified"),
   c("not_secure");

   public static final Codec<gcc> d = azz.a(gcc::values);
   private final String e;

   private gcc(final String $$0) {
      this.e = $$0;
   }

   public static gcc a(xt $$0, xd $$1, Instant $$2) {
      if (!$$0.i() || $$0.b($$2)) {
         return c;
      } else {
         return a($$0, $$1) ? b : a;
      }
   }

   private static boolean a(xt $$0, xd $$1) {
      if (!$$1.getString().contains($$0.c())) {
         return true;
      } else {
         xd $$2 = $$0.n();
         return $$2 == null ? false : a($$2);
      }
   }

   private static boolean a(xd $$0) {
      return $$0.<Boolean>a(($$0x, $$1) -> a($$0x) ? Optional.of(true) : Optional.empty(), ya.a).orElse(false);
   }

   private static boolean a(ya $$0) {
      return !$$0.k().equals(ya.b);
   }

   public boolean a() {
      return this == c;
   }

   @Nullable
   public fif a(xt $$0) {
      return switch (this) {
         case b -> fif.a($$0.c());
         case c -> fif.c();
         default -> null;
      };
   }

   @Override
   public String c() {
      return this.e;
   }
}
