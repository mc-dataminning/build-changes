import com.mojang.serialization.Codec;
import java.time.Instant;
import java.util.Optional;
import javax.annotation.Nullable;

public enum fxm implements ayx {
   a("secure"),
   b("modified"),
   c("not_secure");

   public static final Codec<fxm> d = ayx.a(fxm::values);
   private final String e;

   private fxm(String $$0) {
      this.e = $$0;
   }

   public static fxm a(xn $$0, wx $$1, Instant $$2) {
      if (!$$0.i() || $$0.b($$2)) {
         return c;
      } else {
         return a($$0, $$1) ? b : a;
      }
   }

   private static boolean a(xn $$0, wx $$1) {
      if (!$$1.getString().contains($$0.c())) {
         return true;
      } else {
         wx $$2 = $$0.n();
         return $$2 == null ? false : a($$2);
      }
   }

   private static boolean a(wx $$0) {
      return $$0.<Boolean>a(($$0x, $$1) -> a($$0x) ? Optional.of(true) : Optional.empty(), xu.a).orElse(false);
   }

   private static boolean a(xu $$0) {
      return !$$0.k().equals(xu.b);
   }

   public boolean a() {
      return this == c;
   }

   @Nullable
   public fdu a(xn $$0) {
      return switch (this) {
         case b -> fdu.a($$0.c());
         case c -> fdu.c();
         default -> null;
      };
   }

   @Override
   public String c() {
      return this.e;
   }
}
