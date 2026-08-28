import com.mojang.serialization.Codec;
import java.time.Instant;
import java.util.Optional;
import javax.annotation.Nullable;

public enum fzz implements azk {
   a("secure"),
   b("modified"),
   c("not_secure");

   public static final Codec<fzz> d = azk.a(fzz::values);
   private final String e;

   private fzz(final String $$0) {
      this.e = $$0;
   }

   public static fzz a(xp $$0, wz $$1, Instant $$2) {
      if (!$$0.i() || $$0.b($$2)) {
         return c;
      } else {
         return a($$0, $$1) ? b : a;
      }
   }

   private static boolean a(xp $$0, wz $$1) {
      if (!$$1.getString().contains($$0.c())) {
         return true;
      } else {
         wz $$2 = $$0.n();
         return $$2 == null ? false : a($$2);
      }
   }

   private static boolean a(wz $$0) {
      return $$0.<Boolean>a(($$0x, $$1) -> a($$0x) ? Optional.of(true) : Optional.empty(), xw.a).orElse(false);
   }

   private static boolean a(xw $$0) {
      return !$$0.k().equals(xw.b);
   }

   public boolean a() {
      return this == c;
   }

   @Nullable
   public fgh a(xp $$0) {
      return switch (this) {
         case b -> fgh.a($$0.c());
         case c -> fgh.c();
         default -> null;
      };
   }

   @Override
   public String c() {
      return this.e;
   }
}
